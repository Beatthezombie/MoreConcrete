package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import com.autovw.moreconcrete.core.GenericSlabBlock;
import com.autovw.moreconcrete.core.GenericSlabType;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

/**
 * @author Autovw
 */
public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, MoreConcrete.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .filter(predicate -> predicate instanceof GenericSlabBlock)
                .forEach(this::slabBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .filter(predicate -> predicate instanceof StairBlock)
                .forEach(this::stairsBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .filter(predicate -> predicate instanceof WallBlock)
                .forEach(this::wallBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .filter(predicate -> predicate instanceof LeverBlock)
                .forEach(this::leverBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .filter(predicate -> predicate instanceof PressurePlateBlock)
                .forEach(this::pressurePlateBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .filter(predicate -> predicate instanceof FenceBlock)
                .forEach(this::fenceBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .filter(predicate -> predicate instanceof FenceGateBlock)
                .forEach(this::fenceGateBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .filter(predicate -> predicate instanceof ButtonBlock)
                .forEach(this::buttonBlock);
        
        ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)
        		.filter(predicate -> predicate instanceof LadderBlock)
        		.forEach(this::ladderBlock);
    }

    public void stairsBlock(Block stairs) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(stairs)).getPath();
        String parent = path.replace("_stairs", "");
        ResourceLocation txt = new ResourceLocation("block/" + parent);
        stairsBlock((StairBlock) stairs, txt);
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(stairs).getNamespace(), "block/" + path));
    }

    public void wallBlock(Block wall) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(wall)).getPath();
        String parent = path.replace("_wall", "");
        ResourceLocation txt = new ResourceLocation("block/" + parent);
        wallBlock((WallBlock) wall, txt);
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(wall).getNamespace(), "block/" + path + "_post"));
        itemModels().wallInventory(path, new ResourceLocation("block/" + parent));
    }

    /**
     * Helper method for registering blockstates/models for levers.
     *
     * @param lever Lever block
     */
    public void leverBlock(Block lever) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(lever)).getPath();
        String parent = path.replace("_lever", "");
        ResourceLocation texture = mcLoc("block/" + parent);

        // Creates lever_model model file
        BlockModelBuilder leverModel = models().withExistingParent(path, new ResourceLocation(MoreConcrete.MODID, "block/lever_model")).texture("base", texture);
        // Creates lever_model_on model file
        BlockModelBuilder leverModelOn = models().withExistingParent(path + "_on", new ResourceLocation(MoreConcrete.MODID, "block/lever_model_on")).texture("base", texture);

        getVariantBuilder(lever).forAllStates(blockState -> {
            Direction facing = blockState.getValue(LeverBlock.FACING);
            AttachFace face = blockState.getValue(LeverBlock.FACE);
            boolean powered = blockState.getValue(LeverBlock.POWERED);

            return ConfiguredModel.builder()
                    .modelFile(powered ? leverModel : leverModelOn)
                    .rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180))
                    .rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot())
                    .build();
        });

        // item model
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(lever).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for registering blockstates/models for pressure plates.
     *
     * @param pressurePlate Registered pressure plate
     */
    public void pressurePlateBlock(Block pressurePlate) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(pressurePlate)).getPath();
        String parent = path.replace("_pressure_plate", "");
        ResourceLocation texture = mcLoc("block/" + parent);

        // Creates pressure plate model file
        BlockModelBuilder pressurePlateModel = models().withExistingParent(path, mcLoc("block/pressure_plate_up")).texture("texture", texture);
        // Creates pressure plate down model file
        BlockModelBuilder pressurePlateModelDown = models().withExistingParent(path + "_down", mcLoc("block/pressure_plate_down")).texture("texture", texture);

        getVariantBuilder(pressurePlate)
                .partialState().with(PressurePlateBlock.POWERED, true).addModels(new ConfiguredModel(pressurePlateModelDown))
                .partialState().with(PressurePlateBlock.POWERED, false).addModels(new ConfiguredModel(pressurePlateModel));

        // item model
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(pressurePlate).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for registering blockstates/models for fences.
     *
     * @param fence Registered fence
     */
    public void fenceBlock(Block fence) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(fence)).getPath();
        String parent = path.replace("_fence", "");
        ResourceLocation txt = mcLoc("block/" + parent);
        fenceBlock((FenceBlock) fence, txt);

        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(fence).getNamespace(), "block/" + path + "_post"));
        itemModels().fenceInventory(path, txt);
    }

    /**
     * Helper method for registering blockstates/models for fence gates.
     *
     * @param fenceGate Registered fence gate
     */
    public void fenceGateBlock(Block fenceGate) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(fenceGate)).getPath();
        String parent = path.replace("_fence_gate", "");
        ResourceLocation txt = mcLoc("block/" + parent);
        fenceGateBlock((FenceGateBlock) fenceGate, txt);

        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(fenceGate).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for creating blockstates and models for buttons
     *
     * @param button Registered button block
     */
    public void buttonBlock(Block button) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(button)).getPath();
        String parent = path.replace("_button", "");
        ResourceLocation txt = mcLoc("block/" + parent);

        BlockModelBuilder buttonModel = models().withExistingParent(path, mcLoc("block/button")).texture("texture", txt);
        BlockModelBuilder buttonModelPressed = models().withExistingParent(path + "_pressed", mcLoc("block/button_pressed")).texture("texture", txt);
        BlockModelBuilder buttonModelInventory = models().withExistingParent(path + "_inventory", mcLoc("block/button_inventory")).texture("texture", txt);

        getVariantBuilder(button).forAllStates((blockState -> {
            Direction facing = blockState.getValue(ButtonBlock.FACING);
            AttachFace face = blockState.getValue(ButtonBlock.FACE);
            boolean powered = blockState.getValue(ButtonBlock.POWERED);

            return ConfiguredModel.builder()
                    .modelFile(powered ? buttonModelPressed : buttonModel)
                    .rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180))
                    .rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot())
                    .uvLock(face == AttachFace.WALL).build();
        }));

        itemModels().withExistingParent(path, buttonModelInventory.getLocation()); // item model
    }
    
    public void ladderBlock(Block ladder) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(ladder)).getPath();
        String parent = path.replace("_ladder", "");
        ResourceLocation texture = mcLoc("block/" + parent);
        // Creates lever_model model file
        BlockModelBuilder ladderModel = models().withExistingParent(path, new ResourceLocation(MoreConcrete.MODID, "block/ladder_model")).texture("o", texture).texture("particle", texture);


        getVariantBuilder(ladder).forAllStates(blockState -> {
            Direction facing = blockState.getValue(LadderBlock.FACING);

            return ConfiguredModel.builder()
                    .modelFile(ladderModel)
                    .rotationY( facing == Direction.NORTH ? 0 : facing == Direction.SOUTH ? 180 : facing == Direction.EAST ? 90 : 270 )
                    .build();
        });

        // item model
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(ladder).getNamespace(), "block/" + path));
    }
    
    public void slabBlock(Block verticalSlab) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(verticalSlab)).getPath();
        String parent = path.replace("_slab", "");
        ResourceLocation texture = mcLoc("block/" + parent);
        // Creates lever_model model file
        BlockModelBuilder slabModel = models().withExistingParent(path, mcLoc("block/slab")).texture("top", texture).texture("bottom", texture).texture("side", texture);
        
        getVariantBuilder(verticalSlab)
        .forAllStatesExcept(state -> {
           GenericSlabType type = state.getValue(GenericSlabBlock.GENERIC_TYPE);
           boolean doubleSlab = type == GenericSlabType.DOUBLE;
           int xRot = type == GenericSlabType.BOTTOM ? 180 : type == GenericSlabType.TOP ? 0 : 90;
           Direction dir = type == GenericSlabType.NORTH ? Direction.NORTH : type == GenericSlabType.SOUTH ? Direction.SOUTH : type == GenericSlabType.EAST ? Direction.EAST : Direction.WEST;
           int yRot = doubleSlab ? 0 :(((int) dir.toYRot()) + 180) % 360;
           
           return ConfiguredModel.builder()
                   .modelFile(doubleSlab ? models().getExistingFile(texture) : slabModel )
                   .rotationX(xRot)
                   .rotationY(yRot)
                   .uvLock(true)
                   .build();
        }, StairBlock.WATERLOGGED);
        
        // item model
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(verticalSlab).getNamespace(), "block/" + path));
    }
}

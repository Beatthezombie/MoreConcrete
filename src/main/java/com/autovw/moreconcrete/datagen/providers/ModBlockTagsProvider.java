package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.core.ModBlocks;
import com.autovw.moreconcrete.core.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, registries, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        // Slabs
        tag(ModTags.MOD_SLABS)
                .add(ModBlocks.WHITE_CONCRETE_SLAB.get())
                .add(ModBlocks.ORANGE_CONCRETE_SLAB.get())
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get())
                .add(ModBlocks.YELLOW_CONCRETE_SLAB.get())
                .add(ModBlocks.LIME_CONCRETE_SLAB.get())
                .add(ModBlocks.PINK_CONCRETE_SLAB.get())
                .add(ModBlocks.GRAY_CONCRETE_SLAB.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get())
                .add(ModBlocks.CYAN_CONCRETE_WALL.get())
                .add(ModBlocks.PURPLE_CONCRETE_SLAB.get())
                .add(ModBlocks.BLUE_CONCRETE_SLAB.get())
                .add(ModBlocks.BROWN_CONCRETE_SLAB.get())
                .add(ModBlocks.GREEN_CONCRETE_SLAB.get())
                .add(ModBlocks.RED_CONCRETE_SLAB.get())
                .add(ModBlocks.BLACK_CONCRETE_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_SLABS);
        tag(BlockTags.SLABS).addTag(ModTags.MOD_SLABS);

        // Stairs
        tag(ModTags.MOD_STAIRS)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS.get())
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS.get())
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get())
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS.get())
                .add(ModBlocks.LIME_CONCRETE_STAIRS.get())
                .add(ModBlocks.PINK_CONCRETE_STAIRS.get())
                .add(ModBlocks.GRAY_CONCRETE_STAIRS.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get())
                .add(ModBlocks.CYAN_CONCRETE_STAIRS.get())
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS.get())
                .add(ModBlocks.BLUE_CONCRETE_STAIRS.get())
                .add(ModBlocks.BROWN_CONCRETE_STAIRS.get())
                .add(ModBlocks.GREEN_CONCRETE_STAIRS.get())
                .add(ModBlocks.RED_CONCRETE_STAIRS.get())
                .add(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_STAIRS);
        tag(BlockTags.STAIRS).addTag(ModTags.MOD_STAIRS);

        // Walls
        tag(ModTags.MOD_WALLS)
                .add(ModBlocks.WHITE_CONCRETE_WALL.get())
                .add(ModBlocks.ORANGE_CONCRETE_WALL.get())
                .add(ModBlocks.MAGENTA_CONCRETE_WALL.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get())
                .add(ModBlocks.YELLOW_CONCRETE_WALL.get())
                .add(ModBlocks.LIME_CONCRETE_WALL.get())
                .add(ModBlocks.PINK_CONCRETE_WALL.get())
                .add(ModBlocks.GRAY_CONCRETE_WALL.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get())
                .add(ModBlocks.CYAN_CONCRETE_WALL.get())
                .add(ModBlocks.PURPLE_CONCRETE_WALL.get())
                .add(ModBlocks.BLUE_CONCRETE_WALL.get())
                .add(ModBlocks.BROWN_CONCRETE_WALL.get())
                .add(ModBlocks.GREEN_CONCRETE_WALL.get())
                .add(ModBlocks.RED_CONCRETE_WALL.get())
                .add(ModBlocks.BLACK_CONCRETE_WALL.get());
        // Walls are added to the vanilla walls tag
        tag(BlockTags.WALLS).addTag(ModTags.MOD_WALLS);
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_WALLS);

        // Levers
        tag(ModTags.MOD_LEVERS)
                .add(ModBlocks.WHITE_CONCRETE_LEVER.get())
                .add(ModBlocks.ORANGE_CONCRETE_LEVER.get())
                .add(ModBlocks.MAGENTA_CONCRETE_LEVER.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get())
                .add(ModBlocks.YELLOW_CONCRETE_LEVER.get())
                .add(ModBlocks.LIME_CONCRETE_LEVER.get())
                .add(ModBlocks.PINK_CONCRETE_LEVER.get())
                .add(ModBlocks.GRAY_CONCRETE_LEVER.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get())
                .add(ModBlocks.CYAN_CONCRETE_LEVER.get())
                .add(ModBlocks.PURPLE_CONCRETE_LEVER.get())
                .add(ModBlocks.BLUE_CONCRETE_LEVER.get())
                .add(ModBlocks.BROWN_CONCRETE_LEVER.get())
                .add(ModBlocks.GREEN_CONCRETE_LEVER.get())
                .add(ModBlocks.RED_CONCRETE_LEVER.get())
                .add(ModBlocks.BLACK_CONCRETE_LEVER.get());

        // Pressure Plates
        tag(ModTags.MOD_PRESSURE_PLATES)
                .add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get())
                .add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_PRESSURE_PLATES);
        tag(BlockTags.PRESSURE_PLATES).addTag(ModTags.MOD_PRESSURE_PLATES);

        // Fences
        tag(ModTags.MOD_FENCES)
                .add(ModBlocks.WHITE_CONCRETE_FENCE.get())
                .add(ModBlocks.ORANGE_CONCRETE_FENCE.get())
                .add(ModBlocks.MAGENTA_CONCRETE_FENCE.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get())
                .add(ModBlocks.YELLOW_CONCRETE_FENCE.get())
                .add(ModBlocks.LIME_CONCRETE_FENCE.get())
                .add(ModBlocks.PINK_CONCRETE_FENCE.get())
                .add(ModBlocks.GRAY_CONCRETE_FENCE.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get())
                .add(ModBlocks.CYAN_CONCRETE_FENCE.get())
                .add(ModBlocks.PURPLE_CONCRETE_FENCE.get())
                .add(ModBlocks.BLUE_CONCRETE_FENCE.get())
                .add(ModBlocks.BROWN_CONCRETE_FENCE.get())
                .add(ModBlocks.GREEN_CONCRETE_FENCE.get())
                .add(ModBlocks.RED_CONCRETE_FENCE.get())
                .add(ModBlocks.BLACK_CONCRETE_FENCE.get());
        // Fences are added to the vanilla fences tag
        tag(BlockTags.FENCES).addTag(ModTags.MOD_FENCES);
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_FENCES);

        // Fence Gates
        tag(ModTags.MOD_FENCE_GATES)
                .add(ModBlocks.WHITE_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.LIME_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.PINK_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.GRAY_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.CYAN_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.BLUE_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.BROWN_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.GREEN_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.RED_CONCRETE_FENCE_GATE.get())
                .add(ModBlocks.BLACK_CONCRETE_FENCE_GATE.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_FENCE_GATES);
        tag(BlockTags.FENCE_GATES).addTag(ModTags.MOD_FENCE_GATES);

        // Buttons
        tag(ModTags.MOD_BUTTONS)
                .add(ModBlocks.WHITE_CONCRETE_BUTTON.get())
                .add(ModBlocks.ORANGE_CONCRETE_BUTTON.get())
                .add(ModBlocks.MAGENTA_CONCRETE_BUTTON.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get())
                .add(ModBlocks.YELLOW_CONCRETE_BUTTON.get())
                .add(ModBlocks.LIME_CONCRETE_BUTTON.get())
                .add(ModBlocks.PINK_CONCRETE_BUTTON.get())
                .add(ModBlocks.GRAY_CONCRETE_BUTTON.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get())
                .add(ModBlocks.CYAN_CONCRETE_BUTTON.get())
                .add(ModBlocks.PURPLE_CONCRETE_BUTTON.get())
                .add(ModBlocks.BLUE_CONCRETE_BUTTON.get())
                .add(ModBlocks.BROWN_CONCRETE_BUTTON.get())
                .add(ModBlocks.GREEN_CONCRETE_BUTTON.get())
                .add(ModBlocks.RED_CONCRETE_BUTTON.get())
                .add(ModBlocks.BLACK_CONCRETE_BUTTON.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_BUTTONS);
        tag(BlockTags.BUTTONS).addTag(ModTags.MOD_BUTTONS);
        
        // Ladders
        tag(ModTags.MOD_LADDERS)
                .add(ModBlocks.WHITE_CONCRETE_LADDER.get())
                .add(ModBlocks.ORANGE_CONCRETE_LADDER.get())
                .add(ModBlocks.MAGENTA_CONCRETE_LADDER.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_LADDER.get())
                .add(ModBlocks.YELLOW_CONCRETE_LADDER.get())
                .add(ModBlocks.LIME_CONCRETE_LADDER.get())
                .add(ModBlocks.PINK_CONCRETE_LADDER.get())
                .add(ModBlocks.GRAY_CONCRETE_LADDER.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_LADDER.get())
                .add(ModBlocks.CYAN_CONCRETE_LADDER.get())
                .add(ModBlocks.PURPLE_CONCRETE_LADDER.get())
                .add(ModBlocks.BLUE_CONCRETE_LADDER.get())
                .add(ModBlocks.BROWN_CONCRETE_LADDER.get())
                .add(ModBlocks.GREEN_CONCRETE_LADDER.get())
                .add(ModBlocks.RED_CONCRETE_LADDER.get())
                .add(ModBlocks.BLACK_CONCRETE_LADDER.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_LADDERS);
        tag(BlockTags.CLIMBABLE).addTag(ModTags.MOD_LADDERS);
    }
}

package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

/**
 * @author Autovw
 */
public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Slabs
        concreteSlab(consumer, ModBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.WHITE_CONCRETE);
        concreteSlab(consumer, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.ORANGE_CONCRETE);
        concreteSlab(consumer, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.MAGENTA_CONCRETE);
        concreteSlab(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteSlab(consumer, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.YELLOW_CONCRETE);
        concreteSlab(consumer, ModBlocks.LIME_CONCRETE_SLAB.get(), Blocks.LIME_CONCRETE);
        concreteSlab(consumer, ModBlocks.PINK_CONCRETE_SLAB.get(), Blocks.PINK_CONCRETE);
        concreteSlab(consumer, ModBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.GRAY_CONCRETE);
        concreteSlab(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteSlab(consumer, ModBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CYAN_CONCRETE);
        concreteSlab(consumer, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.PURPLE_CONCRETE);
        concreteSlab(consumer, ModBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.BLUE_CONCRETE);
        concreteSlab(consumer, ModBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.BROWN_CONCRETE);
        concreteSlab(consumer, ModBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.GREEN_CONCRETE);
        concreteSlab(consumer, ModBlocks.RED_CONCRETE_SLAB.get(), Blocks.RED_CONCRETE);
        concreteSlab(consumer, ModBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.BLACK_CONCRETE);

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 2, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 2, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 2, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 2, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 2, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIME_CONCRETE), 2, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.PINK_CONCRETE), 2, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 2, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 2, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 2, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 2, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 2, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 2, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 2, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_SLAB.get(), Ingredient.of(Blocks.RED_CONCRETE), 2, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 2, Blocks.BLACK_CONCRETE);


        // Stairs
        concreteStairs(consumer, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Blocks.WHITE_CONCRETE);
        concreteStairs(consumer, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Blocks.ORANGE_CONCRETE);
        concreteStairs(consumer, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Blocks.MAGENTA_CONCRETE);
        concreteStairs(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteStairs(consumer, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Blocks.YELLOW_CONCRETE);
        concreteStairs(consumer, ModBlocks.LIME_CONCRETE_STAIRS.get(), Blocks.LIME_CONCRETE);
        concreteStairs(consumer, ModBlocks.PINK_CONCRETE_STAIRS.get(), Blocks.PINK_CONCRETE);
        concreteStairs(consumer, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Blocks.GRAY_CONCRETE);
        concreteStairs(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteStairs(consumer, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Blocks.CYAN_CONCRETE);
        concreteStairs(consumer, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Blocks.PURPLE_CONCRETE);
        concreteStairs(consumer, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Blocks.BLUE_CONCRETE);
        concreteStairs(consumer, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Blocks.BROWN_CONCRETE);
        concreteStairs(consumer, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Blocks.GREEN_CONCRETE);
        concreteStairs(consumer, ModBlocks.RED_CONCRETE_STAIRS.get(), Blocks.RED_CONCRETE);
        concreteStairs(consumer, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Blocks.BLACK_CONCRETE);

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


        // Walls
        concreteWall(consumer, ModBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE);
        concreteWall(consumer, ModBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE);
        concreteWall(consumer, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE);
        concreteWall(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteWall(consumer, ModBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE);
        concreteWall(consumer, ModBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE);
        concreteWall(consumer, ModBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE);
        concreteWall(consumer, ModBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE);
        concreteWall(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteWall(consumer, ModBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE);
        concreteWall(consumer, ModBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE);
        concreteWall(consumer, ModBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE);
        concreteWall(consumer, ModBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE);
        concreteWall(consumer, ModBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE);
        concreteWall(consumer, ModBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE);
        concreteWall(consumer, ModBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE);

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_WALL.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_WALL.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_WALL.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_WALL.get(), Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_WALL.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_WALL.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_WALL.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_WALL.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_WALL.get(), Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_WALL.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


        // Levers
        concreteLever(consumer, ModBlocks.WHITE_CONCRETE_LEVER.get(), Blocks.WHITE_CONCRETE);
        concreteLever(consumer, ModBlocks.ORANGE_CONCRETE_LEVER.get(), Blocks.ORANGE_CONCRETE);
        concreteLever(consumer, ModBlocks.MAGENTA_CONCRETE_LEVER.get(), Blocks.MAGENTA_CONCRETE);
        concreteLever(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteLever(consumer, ModBlocks.YELLOW_CONCRETE_LEVER.get(), Blocks.YELLOW_CONCRETE);
        concreteLever(consumer, ModBlocks.LIME_CONCRETE_LEVER.get(), Blocks.LIME_CONCRETE);
        concreteLever(consumer, ModBlocks.PINK_CONCRETE_LEVER.get(), Blocks.PINK_CONCRETE);
        concreteLever(consumer, ModBlocks.GRAY_CONCRETE_LEVER.get(), Blocks.GRAY_CONCRETE);
        concreteLever(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteLever(consumer, ModBlocks.CYAN_CONCRETE_LEVER.get(), Blocks.CYAN_CONCRETE);
        concreteLever(consumer, ModBlocks.PURPLE_CONCRETE_LEVER.get(), Blocks.PURPLE_CONCRETE);
        concreteLever(consumer, ModBlocks.BLUE_CONCRETE_LEVER.get(), Blocks.BLUE_CONCRETE);
        concreteLever(consumer, ModBlocks.BROWN_CONCRETE_LEVER.get(), Blocks.BROWN_CONCRETE);
        concreteLever(consumer, ModBlocks.GREEN_CONCRETE_LEVER.get(), Blocks.GREEN_CONCRETE);
        concreteLever(consumer, ModBlocks.RED_CONCRETE_LEVER.get(), Blocks.RED_CONCRETE);
        concreteLever(consumer, ModBlocks.BLACK_CONCRETE_LEVER.get(), Blocks.BLACK_CONCRETE);


        // Pressure Plates
        concretePressurePlate(consumer, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), Blocks.WHITE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), Blocks.ORANGE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(), Blocks.MAGENTA_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), Blocks.YELLOW_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIME_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), Blocks.PINK_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.GRAY_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), Blocks.CYAN_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), Blocks.PURPLE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLUE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), Blocks.BROWN_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), Blocks.GREEN_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get(), Blocks.RED_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLACK_CONCRETE);


        // Fences
        concreteFence(consumer, ModBlocks.WHITE_CONCRETE_FENCE.get(), Blocks.WHITE_CONCRETE);
        concreteFence(consumer, ModBlocks.ORANGE_CONCRETE_FENCE.get(), Blocks.ORANGE_CONCRETE);
        concreteFence(consumer, ModBlocks.MAGENTA_CONCRETE_FENCE.get(), Blocks.MAGENTA_CONCRETE);
        concreteFence(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteFence(consumer, ModBlocks.YELLOW_CONCRETE_FENCE.get(), Blocks.YELLOW_CONCRETE);
        concreteFence(consumer, ModBlocks.LIME_CONCRETE_FENCE.get(), Blocks.LIME_CONCRETE);
        concreteFence(consumer, ModBlocks.PINK_CONCRETE_FENCE.get(), Blocks.PINK_CONCRETE);
        concreteFence(consumer, ModBlocks.GRAY_CONCRETE_FENCE.get(), Blocks.GRAY_CONCRETE);
        concreteFence(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteFence(consumer, ModBlocks.CYAN_CONCRETE_FENCE.get(), Blocks.CYAN_CONCRETE);
        concreteFence(consumer, ModBlocks.PURPLE_CONCRETE_FENCE.get(), Blocks.PURPLE_CONCRETE);
        concreteFence(consumer, ModBlocks.BLUE_CONCRETE_FENCE.get(), Blocks.BLUE_CONCRETE);
        concreteFence(consumer, ModBlocks.BROWN_CONCRETE_FENCE.get(), Blocks.BROWN_CONCRETE);
        concreteFence(consumer, ModBlocks.GREEN_CONCRETE_FENCE.get(), Blocks.GREEN_CONCRETE);
        concreteFence(consumer, ModBlocks.RED_CONCRETE_FENCE.get(), Blocks.RED_CONCRETE);
        concreteFence(consumer, ModBlocks.BLACK_CONCRETE_FENCE.get(), Blocks.BLACK_CONCRETE);


        // Fence Gates
        concreteFenceGate(consumer, ModBlocks.WHITE_CONCRETE_FENCE_GATE.get(), Blocks.WHITE_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get(), Blocks.ORANGE_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get(), Blocks.MAGENTA_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get(), Blocks.YELLOW_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.LIME_CONCRETE_FENCE_GATE.get(), Blocks.LIME_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.PINK_CONCRETE_FENCE_GATE.get(), Blocks.PINK_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.GRAY_CONCRETE_FENCE_GATE.get(), Blocks.GRAY_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.CYAN_CONCRETE_FENCE_GATE.get(), Blocks.CYAN_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get(), Blocks.PURPLE_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.BLUE_CONCRETE_FENCE_GATE.get(), Blocks.BLUE_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.BROWN_CONCRETE_FENCE_GATE.get(), Blocks.BROWN_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.GREEN_CONCRETE_FENCE_GATE.get(), Blocks.GREEN_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.RED_CONCRETE_FENCE_GATE.get(), Blocks.RED_CONCRETE);
        concreteFenceGate(consumer, ModBlocks.BLACK_CONCRETE_FENCE_GATE.get(), Blocks.BLACK_CONCRETE);


        // Buttons
        concreteButton(consumer, ModBlocks.WHITE_CONCRETE_BUTTON.get(), Blocks.WHITE_CONCRETE);
        concreteButton(consumer, ModBlocks.ORANGE_CONCRETE_BUTTON.get(), Blocks.ORANGE_CONCRETE);
        concreteButton(consumer, ModBlocks.MAGENTA_CONCRETE_BUTTON.get(), Blocks.MAGENTA_CONCRETE);
        concreteButton(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteButton(consumer, ModBlocks.YELLOW_CONCRETE_BUTTON.get(), Blocks.YELLOW_CONCRETE);
        concreteButton(consumer, ModBlocks.LIME_CONCRETE_BUTTON.get(), Blocks.LIME_CONCRETE);
        concreteButton(consumer, ModBlocks.PINK_CONCRETE_BUTTON.get(), Blocks.PINK_CONCRETE);
        concreteButton(consumer, ModBlocks.GRAY_CONCRETE_BUTTON.get(), Blocks.GRAY_CONCRETE);
        concreteButton(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteButton(consumer, ModBlocks.CYAN_CONCRETE_BUTTON.get(), Blocks.CYAN_CONCRETE);
        concreteButton(consumer, ModBlocks.PURPLE_CONCRETE_BUTTON.get(), Blocks.PURPLE_CONCRETE);
        concreteButton(consumer, ModBlocks.BLUE_CONCRETE_BUTTON.get(), Blocks.BLUE_CONCRETE);
        concreteButton(consumer, ModBlocks.BROWN_CONCRETE_BUTTON.get(), Blocks.BROWN_CONCRETE);
        concreteButton(consumer, ModBlocks.GREEN_CONCRETE_BUTTON.get(), Blocks.GREEN_CONCRETE);
        concreteButton(consumer, ModBlocks.RED_CONCRETE_BUTTON.get(), Blocks.RED_CONCRETE);
        concreteButton(consumer, ModBlocks.BLACK_CONCRETE_BUTTON.get(), Blocks.BLACK_CONCRETE);
        

        // Ladders
        concreteLadder(consumer, ModBlocks.WHITE_CONCRETE_LADDER.get(), Blocks.WHITE_CONCRETE);
        concreteLadder(consumer, ModBlocks.ORANGE_CONCRETE_LADDER.get(), Blocks.ORANGE_CONCRETE);
        concreteLadder(consumer, ModBlocks.MAGENTA_CONCRETE_LADDER.get(), Blocks.MAGENTA_CONCRETE);
        concreteLadder(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_LADDER.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteLadder(consumer, ModBlocks.YELLOW_CONCRETE_LADDER.get(), Blocks.YELLOW_CONCRETE);
        concreteLadder(consumer, ModBlocks.LIME_CONCRETE_LADDER.get(), Blocks.LIME_CONCRETE);
        concreteLadder(consumer, ModBlocks.PINK_CONCRETE_LADDER.get(), Blocks.PINK_CONCRETE);
        concreteLadder(consumer, ModBlocks.GRAY_CONCRETE_LADDER.get(), Blocks.GRAY_CONCRETE);
        concreteLadder(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_LADDER.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteLadder(consumer, ModBlocks.CYAN_CONCRETE_LADDER.get(), Blocks.CYAN_CONCRETE);
        concreteLadder(consumer, ModBlocks.PURPLE_CONCRETE_LADDER.get(), Blocks.PURPLE_CONCRETE);
        concreteLadder(consumer, ModBlocks.BLUE_CONCRETE_LADDER.get(), Blocks.BLUE_CONCRETE);
        concreteLadder(consumer, ModBlocks.BROWN_CONCRETE_LADDER.get(), Blocks.BROWN_CONCRETE);
        concreteLadder(consumer, ModBlocks.GREEN_CONCRETE_LADDER.get(), Blocks.GREEN_CONCRETE);
        concreteLadder(consumer, ModBlocks.RED_CONCRETE_LADDER.get(), Blocks.RED_CONCRETE);
        concreteLadder(consumer, ModBlocks.BLACK_CONCRETE_LADDER.get(), Blocks.BLACK_CONCRETE);    
        
        
        // Concrete mixing
        concreteMix(consumer, Blocks.WHITE_CONCRETE, Blocks.WHITE_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.ORANGE_CONCRETE, Blocks.ORANGE_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.MAGENTA_CONCRETE, Blocks.MAGENTA_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.LIGHT_BLUE_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.YELLOW_CONCRETE, Blocks.YELLOW_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.LIME_CONCRETE, Blocks.LIME_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.PINK_CONCRETE, Blocks.PINK_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.GRAY_CONCRETE, Blocks.GRAY_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.LIGHT_GRAY_CONCRETE, Blocks.LIGHT_GRAY_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.CYAN_CONCRETE, Blocks.CYAN_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.PURPLE_CONCRETE, Blocks.PURPLE_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.BLUE_CONCRETE, Blocks.BLUE_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.BROWN_CONCRETE, Blocks.BROWN_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.GREEN_CONCRETE, Blocks.GREEN_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.RED_CONCRETE, Blocks.RED_CONCRETE_POWDER);
        concreteMix(consumer, Blocks.BLACK_CONCRETE, Blocks.BLACK_CONCRETE_POWDER);   
        
        
        
    }

    private static void concreteSlab(Consumer<FinishedRecipe> recipeConsumer, ItemLike slab, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slab, 6)
                .define('#', ingredient)
                .pattern("###")
                .group("concrete_slab")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }

    private static void concreteStairs(Consumer<FinishedRecipe> recipeConsumer, ItemLike stairs, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stairs, 4)
                .define('#', ingredient)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .group("concrete_stairs")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }

    private static void concreteWall(Consumer<FinishedRecipe> recipeConsumer, ItemLike wall, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wall, 6)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .group("concrete_wall")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }

    private static void stonecutting(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, Ingredient ingredient, int amount, ItemLike type) {
        SingleItemRecipeBuilder.stonecutting(ingredient, RecipeCategory.BUILDING_BLOCKS, result, amount)
                .unlockedBy("has_concrete", has(type))
                .save(recipeConsumer, new ResourceLocation(MoreConcrete.MODID, result.asItem() + "_from_" + type.asItem() + "_stonecutting"));
    }

    private static void concretePressurePlate(Consumer<FinishedRecipe> recipeConsumer, ItemLike pressurePlate, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pressurePlate, 1)
                .define('#', ingredient)
                .pattern("##")
                .group("concrete_pressure_plate")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }

    private static void concreteLever(Consumer<FinishedRecipe> recipeConsumer, ItemLike lever, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, lever, 1)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("X")
                .pattern("#")
                .group("concrete_lever")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeConsumer);
    }

    private static void concreteFence(Consumer<FinishedRecipe> recipeConsumer, ItemLike fence, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, fence, 3)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("#X#")
                .pattern("#X#")
                .group("concrete_fence")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeConsumer);
    }

    private static void concreteFenceGate(Consumer<FinishedRecipe> recipeConsumer, ItemLike fenceGate, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, fenceGate, 1)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("X#X")
                .pattern("X#X")
                .group("concrete_fence_gate")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeConsumer);
    }

    private static void concreteButton(Consumer<FinishedRecipe> recipeConsumer, ItemLike button, ItemLike ingredient) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, button, 1)
                .requires(ingredient)
                .group("concrete_button")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);

        stonecutting(recipeConsumer, button, Ingredient.of(ingredient), 1, ingredient);
    }
    
    private static void concreteLadder(Consumer<FinishedRecipe> recipeConsumer, ItemLike fenceGate, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, fenceGate, 6)
                .define('X', ingredient)
                .pattern("X X")
                .pattern("XXX")
                .pattern("X X")
                .group("concrete_ladder")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }
    
    private static void concreteMix(Consumer<FinishedRecipe> recipeConsumer, ItemLike concrete, ItemLike concretePowder ) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, concrete, 8)
        		.requires(concretePowder, 8)
        		.requires(Items.WATER_BUCKET, 1)
                .group("concrete")
                .unlockedBy("has_concrete_powder", has(concretePowder))
                .unlockedBy("has_water_bucket", has(Items.WATER_BUCKET))
                .save(recipeConsumer);
    }
}

package com.theunderworld.datagen;

import java.util.function.Consumer;

import com.theunderworld.Collections.BlocksCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class TURecipeProvider extends FabricRecipeProvider {
    public TURecipeProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.HOLLOW_OAK_PLANKS, 4)
        .input(BlocksCollection.HOLLOW_OAK_LOG).criterion(FabricRecipeProvider.hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS)).criterion(FabricRecipeProvider.hasItem(BlocksCollection.HOLLOW_OAK_LOG), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.HOLLOW_OAK_LOG)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.HOLLOW_OAK_WOOD, 3)
            .pattern("hh")
            .pattern("hh")
            .input('h', BlocksCollection.HOLLOW_OAK_LOG)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.HOLLOW_OAK_LOG), FabricRecipeProvider.conditionsFromItem(BlocksCollection.HOLLOW_OAK_LOG))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.STRIPPED_HOLLOW_OAK_WOOD, 3)
            .pattern("hh")
            .pattern("hh")
            .input('h', BlocksCollection.STRIPPED_HOLLOW_OAK_LOG)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.HOLLOW_OAK_LOG), FabricRecipeProvider.conditionsFromItem(BlocksCollection.HOLLOW_OAK_LOG))
            .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.HOLLOW_OAK_BUTTON)
        .input(BlocksCollection.HOLLOW_OAK_PLANKS).criterion(FabricRecipeProvider.hasItem(BlocksCollection.HOLLOW_OAK_BUTTON), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.HOLLOW_OAK_BUTTON)).criterion(FabricRecipeProvider.hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADWOOD_PLANKS, 4)
        .input(BlocksCollection.DREADWOOD_LOG).criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_PLANKS), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS)).criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_LOG), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_LOG)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADWOOD_WOOD, 3)
            .pattern("dd")
            .pattern("dd")
            .input('d', BlocksCollection.DREADWOOD_LOG)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_LOG), FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_LOG))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.STRIPPED_DREADWOOD_WOOD, 3)
            .pattern("dd")
            .pattern("dd")
            .input('d', BlocksCollection.STRIPPED_DREADWOOD_LOG)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_LOG), FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_LOG))
            .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADWOOD_BUTTON)
        .input(BlocksCollection.DREADWOOD_PLANKS).criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_BUTTON), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_BUTTON)).criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_PLANKS), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS)).offerTo(exporter);

        createStairsRecipe(BlocksCollection.HOLLOW_OAK_STAIRS, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_PLANKS))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_STAIRS)));

        createStairsRecipe(BlocksCollection.DREADWOOD_STAIRS, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_STAIRS)));
        
        createStairsRecipe(BlocksCollection.DREADSTONE_STAIRS, Ingredient.ofItems(BlocksCollection.DREADSTONE))
            .criterion(hasItem(BlocksCollection.DREADSTONE), conditionsFromItem(BlocksCollection.DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADSTONE_STAIRS)));

        createStairsRecipe(BlocksCollection.COBBLED_DREADSTONE_STAIRS, Ingredient.ofItems(BlocksCollection.COBBLED_DREADSTONE))
            .criterion(hasItem(BlocksCollection.COBBLED_DREADSTONE), conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.COBBLED_DREADSTONE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.HOLLOW_OAK_SLAB, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_PLANKS))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADWOOD_SLAB, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_SLAB, Ingredient.ofItems(BlocksCollection.DREADSTONE))
            .criterion(hasItem(BlocksCollection.DREADSTONE), conditionsFromItem(BlocksCollection.DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADSTONE_SLAB)));
        
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_SLAB, Ingredient.ofItems(BlocksCollection.COBBLED_DREADSTONE))
            .criterion(hasItem(BlocksCollection.COBBLED_DREADSTONE), conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.COBBLED_DREADSTONE_SLAB)));

        createFenceRecipe(BlocksCollection.HOLLOW_OAK_FENCE, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_PLANKS))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_FENCE)));

        createFenceRecipe(BlocksCollection.DREADWOOD_FENCE, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_FENCE)));

        createFenceGateRecipe(BlocksCollection.HOLLOW_OAK_FENCE_GATE, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_PLANKS))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_FENCE_GATE)));

        createFenceGateRecipe(BlocksCollection.DREADWOOD_FENCE_GATE, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_FENCE_GATE)));

        createDoorRecipe(BlocksCollection.HOLLOW_OAK_DOOR, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_PLANKS))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_DOOR)));

        createDoorRecipe(BlocksCollection.DREADWOOD_DOOR, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_DOOR)));

        createTrapdoorRecipe(BlocksCollection.HOLLOW_OAK_TRAPDOOR, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_PLANKS))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_TRAPDOOR)));

        createTrapdoorRecipe(BlocksCollection.DREADWOOD_TRAPDOOR, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_TRAPDOOR)));

        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlocksCollection.HOLLOW_OAK_PRESSURE_PLATE, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_PLANKS))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_PRESSURE_PLATE)));

        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlocksCollection.DREADWOOD_PRESSURE_PLATE, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_PRESSURE_PLATE)));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_WALL, BlocksCollection.DREADSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_WALL, BlocksCollection.COBBLED_DREADSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_STAIRS, BlocksCollection.DREADSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_SLAB, BlocksCollection.DREADSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_WALL, BlocksCollection.DREADSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_STAIRS, BlocksCollection.COBBLED_DREADSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_SLAB, BlocksCollection.COBBLED_DREADSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_WALL, BlocksCollection.COBBLED_DREADSTONE);
    }
    
}

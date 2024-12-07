package com.theunderworld.datagen;

import java.util.List;
import java.util.function.Consumer;

import com.theunderworld.Collections.BlocksCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class TURecipeProvider extends FabricRecipeProvider {
    List<ItemConvertible> DREADSTONE_SMELTABLES = List.of(BlocksCollection.COBBLED_DREADSTONE);
    List<ItemConvertible> UNDERWORLD_SANDSTONE_SMOOTH_SMELTABLES = List.of(BlocksCollection.UNDERWORLD_SANDSTONE);

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, BlocksCollection.DREADWOOD_SHRUB)
            .pattern("d")
            .pattern("d")
            .input('d', BlocksCollection.DREADWOOD_LOG)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_LOG), FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_LOG))
            .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADWOOD_BUTTON)
        .input(BlocksCollection.DREADWOOD_PLANKS).criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_BUTTON), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_BUTTON)).criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_PLANKS), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICKS, 4)
            .pattern("dd")
            .pattern("dd")
            .input('d', BlocksCollection.DREADSTONE)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADSTONE), FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADSTONE))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE)
            .pattern("uu")
            .pattern("uu")
            .input('u', BlocksCollection.UNDERWORLD_SAND)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.UNDERWORLD_SAND), FabricRecipeProvider.conditionsFromItem(BlocksCollection.UNDERWORLD_SAND))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED, 2)
            .pattern("u")
            .pattern("u")
            .input('u', BlocksCollection.UNDERWORLD_SANDSTONE)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.UNDERWORLD_SANDSTONE), FabricRecipeProvider.conditionsFromItem(BlocksCollection.UNDERWORLD_SANDSTONE))
            .offerTo(exporter);

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

        createStairsRecipe(BlocksCollection.DREADSTONE_BRICK_STAIRS, Ingredient.ofItems(BlocksCollection.DREADSTONE_BRICKS))
            .criterion(hasItem(BlocksCollection.DREADSTONE_BRICKS), conditionsFromItem(BlocksCollection.DREADSTONE_BRICKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADSTONE_BRICK_STAIRS)));

        createStairsRecipe(BlocksCollection.UNDERWORLD_SANDSTONE_STAIRS, Ingredient.ofItems(BlocksCollection.UNDERWORLD_SANDSTONE))
            .criterion(hasItem(BlocksCollection.UNDERWORLD_SANDSTONE), conditionsFromItem(BlocksCollection.UNDERWORLD_SANDSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.UNDERWORLD_SANDSTONE_STAIRS)));

        createStairsRecipe(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS, Ingredient.ofItems(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED))
            .criterion(hasItem(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED), conditionsFromItem(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS)));

        createStairsRecipe(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_STAIRS, Ingredient.ofItems(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH))
            .criterion(hasItem(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH), conditionsFromItem(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_STAIRS)));

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

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_SLAB, Ingredient.ofItems(BlocksCollection.DREADSTONE_BRICKS))
            .criterion(hasItem(BlocksCollection.DREADSTONE_BRICKS), conditionsFromItem(BlocksCollection.DREADSTONE_BRICKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADSTONE_BRICK_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SLAB, Ingredient.ofItems(BlocksCollection.UNDERWORLD_SANDSTONE))
            .criterion(hasItem(BlocksCollection.UNDERWORLD_SANDSTONE), conditionsFromItem(BlocksCollection.UNDERWORLD_SANDSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.UNDERWORLD_SANDSTONE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB, Ingredient.ofItems(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED))
            .criterion(hasItem(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED), conditionsFromItem(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_SLAB, Ingredient.ofItems(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH))
            .criterion(hasItem(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH), conditionsFromItem(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_SLAB)));

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
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_WALL, BlocksCollection.DREADSTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_WALL, BlocksCollection.UNDERWORLD_SANDSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_WALL, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_WALL, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_STAIRS, BlocksCollection.DREADSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_SLAB, BlocksCollection.DREADSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_WALL, BlocksCollection.DREADSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_STAIRS, BlocksCollection.COBBLED_DREADSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_SLAB, BlocksCollection.COBBLED_DREADSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_WALL, BlocksCollection.COBBLED_DREADSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_STAIRS, BlocksCollection.DREADSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_SLAB, BlocksCollection.DREADSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_WALL, BlocksCollection.DREADSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICKS, BlocksCollection.DREADSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_STAIRS, BlocksCollection.DREADSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_SLAB, BlocksCollection.DREADSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_WALL, BlocksCollection.DREADSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_STAIRS, BlocksCollection.UNDERWORLD_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SLAB, BlocksCollection.UNDERWORLD_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_WALL, BlocksCollection.UNDERWORLD_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_WALL, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED, BlocksCollection.UNDERWORLD_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS, BlocksCollection.UNDERWORLD_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB, BlocksCollection.UNDERWORLD_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_WALL, BlocksCollection.UNDERWORLD_SANDSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_STAIRS, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_SLAB, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_WALL, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH);

        offerSmelting(exporter, DREADSTONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE, 0.1f, 200, "dreadstone");
        offerSmelting(exporter, UNDERWORLD_SANDSTONE_SMOOTH_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH, 0.1f, 200, "underworld_sandstone_smooth");
    }
    
}

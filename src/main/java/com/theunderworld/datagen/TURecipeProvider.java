package com.theunderworld.datagen;

import java.util.List;
import java.util.function.Consumer;

import com.theunderworld.Collections.BlocksCollection;
import com.theunderworld.Collections.ItemsCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class TURecipeProvider extends FabricRecipeProvider {
    List<ItemConvertible> DREADSTONE_SMELTABLES = List.of(BlocksCollection.COBBLED_DREADSTONE);
    List<ItemConvertible> SMOOTH_DREADSTONE_SMELTABLES = List.of(BlocksCollection.DREADSTONE);
    List<ItemConvertible> UNDERWORLD_SANDSTONE_SMOOTH_SMELTABLES = List.of(BlocksCollection.UNDERWORLD_SANDSTONE);
    List<ItemConvertible> OPACITITE_SMELTABLES = List.of(BlocksCollection.OPACITITE_ORE, ItemsCollection.RAW_OPACITITE);

    public TURecipeProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Block Recipes
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, BlocksCollection.HOLLOW_OAK_TILES)
            .pattern("h")
            .pattern("h")
            .input('h', BlocksCollection.HOLLOW_OAK_SLAB)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, BlocksCollection.DREADWOOD_TILES)
            .pattern("d")
            .pattern("d")
            .input('d', BlocksCollection.DREADWOOD_SLAB)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADWOOD_PLANKS), FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.OPACITITE_BLOCK)
            .pattern("ooo")
            .pattern("ooo")
            .pattern("ooo")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.RADIANT_COAL_BLOCK)
            .pattern("rrr")
            .pattern("rrr")
            .pattern("rrr")
            .input('r', ItemsCollection.RADIANT_COAL)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.RADIANT_COAL), FabricRecipeProvider.conditionsFromItem(ItemsCollection.RADIANT_COAL))
            .offerTo(exporter);

        createStairsRecipe(BlocksCollection.HOLLOW_OAK_STAIRS, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_PLANKS))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_PLANKS), conditionsFromItem(BlocksCollection.HOLLOW_OAK_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_STAIRS)));
            
        createStairsRecipe(BlocksCollection.HOLLOW_OAK_TILES_STAIRS, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_TILES))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_TILES), conditionsFromItem(BlocksCollection.HOLLOW_OAK_TILES))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_TILES_STAIRS)));

        createStairsRecipe(BlocksCollection.DREADWOOD_STAIRS, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_STAIRS)));

        createStairsRecipe(BlocksCollection.DREADWOOD_TILES_STAIRS, Ingredient.ofItems(BlocksCollection.DREADWOOD_TILES))
            .criterion(hasItem(BlocksCollection.DREADWOOD_TILES), conditionsFromItem(BlocksCollection.DREADWOOD_TILES))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_TILES_STAIRS)));
        
        createStairsRecipe(BlocksCollection.DREADSTONE_STAIRS, Ingredient.ofItems(BlocksCollection.DREADSTONE))
            .criterion(hasItem(BlocksCollection.DREADSTONE), conditionsFromItem(BlocksCollection.DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADSTONE_STAIRS)));

        createStairsRecipe(BlocksCollection.COBBLED_DREADSTONE_STAIRS, Ingredient.ofItems(BlocksCollection.COBBLED_DREADSTONE))
            .criterion(hasItem(BlocksCollection.COBBLED_DREADSTONE), conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.COBBLED_DREADSTONE_STAIRS)));

        createStairsRecipe(BlocksCollection.DREADSTONE_BRICK_STAIRS, Ingredient.ofItems(BlocksCollection.DREADSTONE_BRICKS))
            .criterion(hasItem(BlocksCollection.DREADSTONE_BRICKS), conditionsFromItem(BlocksCollection.DREADSTONE_BRICKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADSTONE_BRICK_STAIRS)));

        createStairsRecipe(BlocksCollection.SMOOTH_DREADSTONE_STAIRS, Ingredient.ofItems(BlocksCollection.SMOOTH_DREADSTONE))
            .criterion(hasItem(BlocksCollection.SMOOTH_DREADSTONE), conditionsFromItem(BlocksCollection.SMOOTH_DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.SMOOTH_DREADSTONE_STAIRS)));

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

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.HOLLOW_OAK_TILES_SLAB, Ingredient.ofItems(BlocksCollection.HOLLOW_OAK_TILES))
            .criterion(hasItem(BlocksCollection.HOLLOW_OAK_TILES), conditionsFromItem(BlocksCollection.HOLLOW_OAK_TILES))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.HOLLOW_OAK_TILES_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADWOOD_SLAB, Ingredient.ofItems(BlocksCollection.DREADWOOD_PLANKS))
            .criterion(hasItem(BlocksCollection.DREADWOOD_PLANKS), conditionsFromItem(BlocksCollection.DREADWOOD_PLANKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADWOOD_TILES_SLAB, Ingredient.ofItems(BlocksCollection.DREADWOOD_TILES))
            .criterion(hasItem(BlocksCollection.DREADWOOD_TILES), conditionsFromItem(BlocksCollection.DREADWOOD_TILES))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADWOOD_TILES_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_SLAB, Ingredient.ofItems(BlocksCollection.DREADSTONE))
            .criterion(hasItem(BlocksCollection.DREADSTONE), conditionsFromItem(BlocksCollection.DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADSTONE_SLAB)));
        
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.COBBLED_DREADSTONE_SLAB, Ingredient.ofItems(BlocksCollection.COBBLED_DREADSTONE))
            .criterion(hasItem(BlocksCollection.COBBLED_DREADSTONE), conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.COBBLED_DREADSTONE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.DREADSTONE_BRICK_SLAB, Ingredient.ofItems(BlocksCollection.DREADSTONE_BRICKS))
            .criterion(hasItem(BlocksCollection.DREADSTONE_BRICKS), conditionsFromItem(BlocksCollection.DREADSTONE_BRICKS))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.DREADSTONE_BRICK_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksCollection.SMOOTH_DREADSTONE_SLAB, Ingredient.ofItems(BlocksCollection.SMOOTH_DREADSTONE))
            .criterion(hasItem(BlocksCollection.SMOOTH_DREADSTONE), conditionsFromItem(BlocksCollection.SMOOTH_DREADSTONE))
            .offerTo(exporter, new Identifier(getRecipeName(BlocksCollection.SMOOTH_DREADSTONE_SLAB)));

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
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.SMOOTH_DREADSTONE_WALL, BlocksCollection.SMOOTH_DREADSTONE);
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

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.SMOOTH_DREADSTONE_STAIRS, BlocksCollection.SMOOTH_DREADSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.SMOOTH_DREADSTONE_SLAB, BlocksCollection.SMOOTH_DREADSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.SMOOTH_DREADSTONE_WALL, BlocksCollection.SMOOTH_DREADSTONE);

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
        offerSmelting(exporter, SMOOTH_DREADSTONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.SMOOTH_DREADSTONE, 0.1f, 200, "smooth_dreadstone");
        offerSmelting(exporter, UNDERWORLD_SANDSTONE_SMOOTH_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH, 0.1f, 200, "underworld_sandstone_smooth");

        // Item Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.DREADSTONE_SWORD)
            .pattern(" d ")
            .pattern(" d ")
            .pattern(" s ")
            .input('d', BlocksCollection.COBBLED_DREADSTONE)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.COBBLED_DREADSTONE), FabricRecipeProvider.conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.DREADSTONE_PICKAXE)
            .pattern("ddd")
            .pattern(" s ")
            .pattern(" s ")
            .input('d', BlocksCollection.COBBLED_DREADSTONE)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.COBBLED_DREADSTONE), FabricRecipeProvider.conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.DREADSTONE_AXE)
            .pattern("dd ")
            .pattern("ds ")
            .pattern(" s ")
            .input('d', BlocksCollection.COBBLED_DREADSTONE)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.COBBLED_DREADSTONE), FabricRecipeProvider.conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.DREADSTONE_SHOVEL)
            .pattern(" d ")
            .pattern(" s ")
            .pattern(" s ")
            .input('d', BlocksCollection.COBBLED_DREADSTONE)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.COBBLED_DREADSTONE), FabricRecipeProvider.conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.DREADSTONE_HOE)
            .pattern("dd ")
            .pattern(" s ")
            .pattern(" s ")
            .input('d', BlocksCollection.COBBLED_DREADSTONE)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(BlocksCollection.COBBLED_DREADSTONE), FabricRecipeProvider.conditionsFromItem(BlocksCollection.COBBLED_DREADSTONE))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.OPACITITE_SWORD)
            .pattern(" o ")
            .pattern(" o ")
            .pattern(" s ")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.OPACITITE_PICKAXE)
            .pattern("ooo")
            .pattern(" s ")
            .pattern(" s ")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.OPACITITE_AXE)
            .pattern("oo ")
            .pattern("os ")
            .pattern(" s ")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.OPACITITE_SHOVEL)
            .pattern(" o ")
            .pattern(" s ")
            .pattern(" s ")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemsCollection.OPACITITE_HOE)
            .pattern("oo ")
            .pattern(" s ")
            .pattern(" s ")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsCollection.OPACITITE_HELMET)
            .pattern("ooo")
            .pattern("o o")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsCollection.OPACITITE_CHESTPLATE)
            .pattern("o o")
            .pattern("ooo")
            .pattern("ooo")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsCollection.OPACITITE_LEGGINGS)
            .pattern("ooo")
            .pattern("o o")
            .pattern("o o")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsCollection.OPACITITE_BOOTS)
            .pattern("o o")
            .pattern("o o")
            .input('o', ItemsCollection.OPACITITE_INGOT)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.SOUL_TORCH, 4)
            .pattern("r")
            .pattern("s")
            .input('r', ItemsCollection.RADIANT_COAL)
            .input('s', Items.STICK)
            .criterion(FabricRecipeProvider.hasItem(ItemsCollection.RADIANT_COAL), FabricRecipeProvider.conditionsFromItem(ItemsCollection.RADIANT_COAL))
            .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemsCollection.RADIANT_DUST)
        .input(BlocksCollection.RADIANT_MUSHROOM).criterion(FabricRecipeProvider.hasItem(ItemsCollection.RADIANT_DUST), 
        FabricRecipeProvider.conditionsFromItem(ItemsCollection.RADIANT_DUST)).criterion(FabricRecipeProvider.hasItem(BlocksCollection.RADIANT_MUSHROOM), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.RADIANT_MUSHROOM)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemsCollection.DREADDED_DUST)
        .input(BlocksCollection.DREADSHROOM).criterion(FabricRecipeProvider.hasItem(ItemsCollection.DREADDED_DUST), 
        FabricRecipeProvider.conditionsFromItem(ItemsCollection.DREADDED_DUST)).criterion(FabricRecipeProvider.hasItem(BlocksCollection.DREADSHROOM), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.DREADSHROOM)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemsCollection.OPACITITE_INGOT, 9)
        .input(BlocksCollection.OPACITITE_BLOCK).criterion(FabricRecipeProvider.hasItem(ItemsCollection.OPACITITE_INGOT), 
        FabricRecipeProvider.conditionsFromItem(ItemsCollection.OPACITITE_INGOT)).criterion(FabricRecipeProvider.hasItem(BlocksCollection.OPACITITE_BLOCK), 
        FabricRecipeProvider.conditionsFromItem(BlocksCollection.OPACITITE_BLOCK)).offerTo(exporter);

        offerSmelting(exporter, OPACITITE_SMELTABLES, RecipeCategory.MISC, ItemsCollection.OPACITITE_INGOT, 1.0f, 200, "opacitite_ingot");
        offerBlasting(exporter, OPACITITE_SMELTABLES, RecipeCategory.MISC, ItemsCollection.OPACITITE_INGOT, 1.0f, 100, "opacitite_ingot");
    }
    
}

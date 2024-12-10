package com.theunderworld.datagen;

import com.theunderworld.Collections.BlocksCollection;
import com.theunderworld.Collections.ItemsCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class TUModelProvider extends FabricModelProvider {
    public TUModelProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(BlocksCollection.HOLLOW_OAK_LOG)
            .log(BlocksCollection.HOLLOW_OAK_LOG)
            .wood(BlocksCollection.HOLLOW_OAK_WOOD);

        blockStateModelGenerator.registerLog(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG)
            .log(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG)
            .wood(BlocksCollection.STRIPPED_HOLLOW_OAK_WOOD);

        BlockStateModelGenerator.BlockTexturePool hollow_oak_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksCollection.HOLLOW_OAK_PLANKS);
        hollow_oak_pool.fence(BlocksCollection.HOLLOW_OAK_FENCE);
        hollow_oak_pool.fenceGate(BlocksCollection.HOLLOW_OAK_FENCE_GATE);
        hollow_oak_pool.stairs(BlocksCollection.HOLLOW_OAK_STAIRS);
        hollow_oak_pool.slab(BlocksCollection.HOLLOW_OAK_SLAB);
        hollow_oak_pool.button(BlocksCollection.HOLLOW_OAK_BUTTON);
        hollow_oak_pool.pressurePlate(BlocksCollection.HOLLOW_OAK_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(BlocksCollection.HOLLOW_OAK_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlocksCollection.HOLLOW_OAK_TRAPDOOR);

        blockStateModelGenerator.registerLog(BlocksCollection.DREADWOOD_LOG)
            .log(BlocksCollection.DREADWOOD_LOG)
            .wood(BlocksCollection.DREADWOOD_WOOD);

        blockStateModelGenerator.registerLog(BlocksCollection.STRIPPED_DREADWOOD_LOG)
            .log(BlocksCollection.STRIPPED_DREADWOOD_LOG)
            .wood(BlocksCollection.STRIPPED_DREADWOOD_WOOD);
        
        BlockStateModelGenerator.BlockTexturePool dreadwood_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksCollection.DREADWOOD_PLANKS);
        dreadwood_pool.fence(BlocksCollection.DREADWOOD_FENCE);
        dreadwood_pool.fenceGate(BlocksCollection.DREADWOOD_FENCE_GATE);
        dreadwood_pool.stairs(BlocksCollection.DREADWOOD_STAIRS);
        dreadwood_pool.slab(BlocksCollection.DREADWOOD_SLAB);
        dreadwood_pool.button(BlocksCollection.DREADWOOD_BUTTON);
        dreadwood_pool.pressurePlate(BlocksCollection.DREADWOOD_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(BlocksCollection.DREADWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlocksCollection.DREADWOOD_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool dreadstone_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksCollection.DREADSTONE);
        dreadstone_pool.stairs(BlocksCollection.DREADSTONE_STAIRS);
        dreadstone_pool.slab(BlocksCollection.DREADSTONE_SLAB);
        dreadstone_pool.wall(BlocksCollection.DREADSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool cobbled_dreadstone_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksCollection.COBBLED_DREADSTONE);
        cobbled_dreadstone_pool.stairs(BlocksCollection.COBBLED_DREADSTONE_STAIRS);
        cobbled_dreadstone_pool.slab(BlocksCollection.COBBLED_DREADSTONE_SLAB);
        cobbled_dreadstone_pool.wall(BlocksCollection.COBBLED_DREADSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool dreadstone_bricks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksCollection.DREADSTONE_BRICKS);
        dreadstone_bricks_pool.stairs(BlocksCollection.DREADSTONE_BRICK_STAIRS);
        dreadstone_bricks_pool.slab(BlocksCollection.DREADSTONE_BRICK_SLAB);
        dreadstone_bricks_pool.wall(BlocksCollection.DREADSTONE_BRICK_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(BlocksCollection.UNDERWORLD_SOIL);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksCollection.HOLLOW_OAK_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(BlocksCollection.UNDERWORLD_SAND);

        BlockStateModelGenerator.BlockTexturePool underworld_sandstone_cobbled_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED);
        underworld_sandstone_cobbled_pool.stairs(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS);
        underworld_sandstone_cobbled_pool.slab(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB);
        underworld_sandstone_cobbled_pool.wall(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_WALL);

        blockStateModelGenerator.registerTintableCross(BlocksCollection.UNDERWORLD_SHRUB, BlockStateModelGenerator.TintType.TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(BlocksCollection.HOLLOW_OAK_SAPLING, BlocksCollection.POTTED_HOLLOW_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksCollection.DREADWOOD_SHRUB, BlocksCollection.POTTED_DREADWOOD_SHRUB, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksCollection.RADIANT_MUSHROOM, BlocksCollection.POTTED_RADIANT_MUSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksCollection.DREADSHROOM, BlocksCollection.POTTED_DREADSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(BlocksCollection.OPACITITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksCollection.RADIANT_COAL_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemsCollection.DREADSTONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.DREADSTONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.DREADSTONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.DREADSTONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.DREADSTONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ItemsCollection.RADIANT_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.DREADDED_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.RAW_OPACITITE, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.OPACITITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.RADIANT_COAL, Models.GENERATED);

        itemModelGenerator.register(ItemsCollection.OPACITITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.OPACITITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.OPACITITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.OPACITITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.OPACITITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ItemsCollection.OPACITITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.OPACITITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.OPACITITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.OPACITITE_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ItemsCollection.RADIANT_OPACITITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.RADIANT_OPACITITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.RADIANT_OPACITITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.RADIANT_OPACITITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.RADIANT_OPACITITE_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ItemsCollection.DREADDED_OPACITITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemsCollection.DREADDED_OPACITITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.DREADDED_OPACITITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.DREADDED_OPACITITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemsCollection.DREADDED_OPACITITE_BOOTS, Models.GENERATED);
    }
    
}

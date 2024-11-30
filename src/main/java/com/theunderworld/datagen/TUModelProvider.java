package com.theunderworld.datagen;

import com.theunderworld.Collections.BlocksCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

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
        blockStateModelGenerator.registerTintableCross(BlocksCollection.HOLLOW_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        
    }
    
}

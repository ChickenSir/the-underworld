package com.theunderworld.datagen;

import com.theunderworld.Collections.BlocksCollection;
import com.theunderworld.Collections.ItemsCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class TUBlockLootTableProvider extends FabricBlockLootTableProvider {
    public TUBlockLootTableProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generate() {
        addDrop(BlocksCollection.HOLLOW_OAK_LOG);
        addDrop(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG);
        addDrop(BlocksCollection.HOLLOW_OAK_WOOD);
        addDrop(BlocksCollection.STRIPPED_HOLLOW_OAK_WOOD);
        addDrop(BlocksCollection.HOLLOW_OAK_PLANKS);
        addDrop(BlocksCollection.HOLLOW_OAK_TILES);
        addDrop(BlocksCollection.HOLLOW_OAK_FENCE);
        addDrop(BlocksCollection.HOLLOW_OAK_FENCE_GATE);
        addDrop(BlocksCollection.HOLLOW_OAK_STAIRS);
        addDrop(BlocksCollection.HOLLOW_OAK_SLAB, slabDrops(BlocksCollection.HOLLOW_OAK_SLAB));
        addDrop(BlocksCollection.HOLLOW_OAK_BUTTON);
        addDrop(BlocksCollection.HOLLOW_OAK_PRESSURE_PLATE);
        addDrop(BlocksCollection.HOLLOW_OAK_TILES_STAIRS);
        addDrop(BlocksCollection.HOLLOW_OAK_TILES_SLAB, slabDrops(BlocksCollection.HOLLOW_OAK_TILES_SLAB));
        addDrop(BlocksCollection.HOLLOW_OAK_DOOR, doorDrops(BlocksCollection.HOLLOW_OAK_DOOR));
        addDrop(BlocksCollection.HOLLOW_OAK_TRAPDOOR);
        addDrop(BlocksCollection.HOLLOW_OAK_LEAVES, leavesDrops(BlocksCollection.HOLLOW_OAK_LEAVES, BlocksCollection.HOLLOW_OAK_SAPLING, 0.005f));
        addDrop(BlocksCollection.HOLLOW_OAK_SAPLING);

        addDrop(BlocksCollection.DREADWOOD_LOG);
        addDrop(BlocksCollection.STRIPPED_DREADWOOD_LOG);
        addDrop(BlocksCollection.DREADWOOD_WOOD);
        addDrop(BlocksCollection.STRIPPED_DREADWOOD_WOOD);
        addDrop(BlocksCollection.DREADWOOD_PLANKS);
        addDrop(BlocksCollection.DREADWOOD_TILES);
        addDrop(BlocksCollection.DREADWOOD_FENCE);
        addDrop(BlocksCollection.DREADWOOD_FENCE_GATE);
        addDrop(BlocksCollection.DREADWOOD_STAIRS);
        addDrop(BlocksCollection.DREADWOOD_SLAB, slabDrops(BlocksCollection.DREADWOOD_SLAB));
        addDrop(BlocksCollection.DREADWOOD_BUTTON);
        addDrop(BlocksCollection.DREADWOOD_PRESSURE_PLATE);
        addDrop(BlocksCollection.DREADWOOD_TILES_STAIRS);
        addDrop(BlocksCollection.DREADWOOD_TILES_SLAB, slabDrops(BlocksCollection.DREADWOOD_TILES_SLAB));
        addDrop(BlocksCollection.DREADWOOD_DOOR, doorDrops(BlocksCollection.DREADWOOD_DOOR));
        addDrop(BlocksCollection.DREADWOOD_TRAPDOOR);
        addDrop(BlocksCollection.DREADWOOD_SHRUB);
        
        addDrop(BlocksCollection.DREADSTONE, BlocksCollection.COBBLED_DREADSTONE);
        addDrop(BlocksCollection.DREADSTONE_STAIRS);
        addDrop(BlocksCollection.DREADSTONE_SLAB, slabDrops(BlocksCollection.DREADSTONE_SLAB));
        addDrop(BlocksCollection.DREADSTONE_WALL);
        addDrop(BlocksCollection.COBBLED_DREADSTONE);
        addDrop(BlocksCollection.COBBLED_DREADSTONE_STAIRS);
        addDrop(BlocksCollection.COBBLED_DREADSTONE_SLAB, slabDrops(BlocksCollection.COBBLED_DREADSTONE_SLAB));
        addDrop(BlocksCollection.COBBLED_DREADSTONE_WALL);
        addDrop(BlocksCollection.DREADSTONE_BRICKS);
        addDrop(BlocksCollection.DREADSTONE_BRICK_STAIRS);
        addDrop(BlocksCollection.DREADSTONE_BRICK_SLAB, slabDrops(BlocksCollection.DREADSTONE_BRICK_SLAB));
        addDrop(BlocksCollection.DREADSTONE_BRICK_WALL);
        addDrop(BlocksCollection.SMOOTH_DREADSTONE);
        addDrop(BlocksCollection.SMOOTH_DREADSTONE_STAIRS);
        addDrop(BlocksCollection.SMOOTH_DREADSTONE_SLAB, slabDrops(BlocksCollection.SMOOTH_DREADSTONE_SLAB));
        addDrop(BlocksCollection.SMOOTH_DREADSTONE_WALL);

        addDrop(BlocksCollection.UNDERWORLD_SOIL);
        addDrop(BlocksCollection.UNDERWORLD_GRASS, BlocksCollection.UNDERWORLD_SOIL);
        addDrop(BlocksCollection.UNDERWORLD_SAND);

        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE);
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_STAIRS);
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_SLAB, slabDrops(BlocksCollection.UNDERWORLD_SANDSTONE_SLAB));
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_WALL);

        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED);
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS);
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB, slabDrops(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB));
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_WALL);

        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH);
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_STAIRS);
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_SLAB, slabDrops(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_SLAB));
        addDrop(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_WALL);

        grassDrops(BlocksCollection.UNDERWORLD_SHRUB);
        addDrop(BlocksCollection.RADIANT_MUSHROOM);
        addDrop(BlocksCollection.DREADSHROOM);
        addDrop(BlocksCollection.DEAD_SHRUB, grassDrops(BlocksCollection.DEAD_SHRUB));

        addPottedPlantDrops(BlocksCollection.POTTED_HOLLOW_OAK_SAPLING);
        addPottedPlantDrops(BlocksCollection.POTTED_DREADWOOD_SHRUB);
        addPottedPlantDrops(BlocksCollection.POTTED_RADIANT_MUSHROOM);
        addPottedPlantDrops(BlocksCollection.POTTED_DREADSHROOM);

        addDrop(BlocksCollection.OPACITITE_ORE, oreDrops(BlocksCollection.OPACITITE_ORE, ItemsCollection.RAW_OPACITITE));
        addDrop(BlocksCollection.RADIANT_COAL_ORE, oreDrops(BlocksCollection.RADIANT_COAL_ORE, ItemsCollection.RADIANT_COAL));

        addDrop(BlocksCollection.OPACITITE_BLOCK);
        addDrop(BlocksCollection.RADIANT_COAL_BLOCK);
    }
    
}

package com.theunderworld.datagen;

import com.theunderworld.Collections.BlocksCollection;

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
        addDrop(BlocksCollection.HOLLOW_OAK_FENCE);
        addDrop(BlocksCollection.HOLLOW_OAK_FENCE_GATE);
        addDrop(BlocksCollection.HOLLOW_OAK_STAIRS);
        addDrop(BlocksCollection.HOLLOW_OAK_SLAB, slabDrops(BlocksCollection.HOLLOW_OAK_SLAB));
        addDrop(BlocksCollection.HOLLOW_OAK_BUTTON);
        addDrop(BlocksCollection.HOLLOW_OAK_PRESSURE_PLATE);
        addDrop(BlocksCollection.HOLLOW_OAK_DOOR, doorDrops(BlocksCollection.HOLLOW_OAK_DOOR));
        addDrop(BlocksCollection.HOLLOW_OAK_TRAPDOOR);

        addDrop(BlocksCollection.DREADWOOD_LOG);
        addDrop(BlocksCollection.STRIPPED_DREADWOOD_LOG);
        addDrop(BlocksCollection.DREADWOOD_WOOD);
        addDrop(BlocksCollection.STRIPPED_DREADWOOD_WOOD);
        addDrop(BlocksCollection.DREADWOOD_PLANKS);
        addDrop(BlocksCollection.DREADWOOD_FENCE);
        addDrop(BlocksCollection.DREADWOOD_FENCE_GATE);
        addDrop(BlocksCollection.DREADWOOD_STAIRS);
        addDrop(BlocksCollection.DREADWOOD_SLAB, slabDrops(BlocksCollection.DREADWOOD_SLAB));
        addDrop(BlocksCollection.DREADWOOD_BUTTON);
        addDrop(BlocksCollection.DREADWOOD_PRESSURE_PLATE);
        addDrop(BlocksCollection.DREADWOOD_DOOR, doorDrops(BlocksCollection.DREADWOOD_DOOR));
        addDrop(BlocksCollection.DREADWOOD_TRAPDOOR);
    }
    
}

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
        addDrop(BlocksCollection.HOLLOW_OAK_STAIRS);
        addDrop(BlocksCollection.HOLLOW_OAK_SLAB, slabDrops(BlocksCollection.HOLLOW_OAK_SLAB));
    }
    
}

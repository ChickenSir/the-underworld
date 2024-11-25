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
    }
    
}

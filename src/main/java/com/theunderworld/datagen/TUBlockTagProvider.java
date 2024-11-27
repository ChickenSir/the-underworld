package com.theunderworld.datagen;

import java.util.concurrent.CompletableFuture;

import com.theunderworld.Collections.BlocksCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;

public class TUBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TUBlockTagProvider(FabricDataOutput generator, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(generator, registriesFuture);
    }

    @Override
    protected void configure(WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
            .add(BlocksCollection.HOLLOW_OAK_LOG)
            .add(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG)
            .add(BlocksCollection.HOLLOW_OAK_PLANKS)
            .add(BlocksCollection.HOLLOW_OAK_WOOD)
            .add(BlocksCollection.STRIPPED_HOLLOW_OAK_WOOD)
            .add(BlocksCollection.DREADWOOD_LOG)
            .add(BlocksCollection.STRIPPED_DREADWOOD_LOG)
            .add(BlocksCollection.DREADWOOD_WOOD)
            .add(BlocksCollection.STRIPPED_DREADWOOD_WOOD)
            .add(BlocksCollection.DREADWOOD_PLANKS);

        getOrCreateTagBuilder(BlockTags.FENCES)
            .add(BlocksCollection.HOLLOW_OAK_FENCE)
            .add(BlocksCollection.DREADWOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(BlocksCollection.DREADSTONE_WALL)
            .add(BlocksCollection.COBBLED_DREADSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.STAIRS)
            .add(BlocksCollection.HOLLOW_OAK_STAIRS)
            .add(BlocksCollection.DREADWOOD_STAIRS)
            .add(BlocksCollection.DREADSTONE_STAIRS)
            .add(BlocksCollection.COBBLED_DREADSTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(BlocksCollection.HOLLOW_OAK_SLAB)
            .add(BlocksCollection.DREADWOOD_SLAB)
            .add(BlocksCollection.DREADSTONE_SLAB)
            .add(BlocksCollection.COBBLED_DREADSTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(BlocksCollection.HOLLOW_OAK_FENCE_GATE)
            .add(BlocksCollection.DREADWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(BlocksCollection.DREADSTONE)
            .add(BlocksCollection.COBBLED_DREADSTONE)
            .add(BlocksCollection.DREADSTONE_STAIRS)
            .add(BlocksCollection.DREADSTONE_SLAB)
            .add(BlocksCollection.DREADSTONE_WALL)
            .add(BlocksCollection.COBBLED_DREADSTONE_STAIRS)
            .add(BlocksCollection.COBBLED_DREADSTONE_SLAB)
            .add(BlocksCollection.COBBLED_DREADSTONE_WALL);
    }
    
}

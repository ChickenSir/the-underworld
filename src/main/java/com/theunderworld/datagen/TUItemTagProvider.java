package com.theunderworld.datagen;

import java.util.concurrent.CompletableFuture;

import com.theunderworld.Collections.BlocksCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.ItemTags;

public class TUItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public TUItemTagProvider(FabricDataOutput generator, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(generator, registriesFuture);
    }

    @Override
    protected void configure(WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
            .add(BlocksCollection.HOLLOW_OAK_LOG.asItem())
            .add(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG.asItem())
            .add(BlocksCollection.HOLLOW_OAK_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
            .add(BlocksCollection.HOLLOW_OAK_LOG.asItem())
            .add(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG.asItem())
            .add(BlocksCollection.HOLLOW_OAK_PLANKS.asItem());
    }
    
}

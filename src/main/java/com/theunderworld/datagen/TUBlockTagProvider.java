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
            .add(BlocksCollection.HOLLOW_OAK_LOG);
    }
    
}

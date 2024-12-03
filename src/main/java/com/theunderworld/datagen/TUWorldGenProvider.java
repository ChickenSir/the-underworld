package com.theunderworld.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class TUWorldGenProvider extends FabricDynamicRegistryProvider {
    public TUWorldGenProvider(FabricDataOutput generator, CompletableFuture<RegistryWrapper.WrapperLookup> regestriesFuture) {
        super(generator, regestriesFuture);
    }

    @Override
    public String getName() {
        return "World Gen";
    }

    @Override
    protected void configure(WrapperLookup registries, Entries entries) {
        entries.addAll(registries.getWrapperOrThrow(RegistryKeys.CONFIGURED_FEATURE));
        entries.addAll(registries.getWrapperOrThrow(RegistryKeys.PLACED_FEATURE));
    }
    
}

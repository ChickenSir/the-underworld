package com.theunderworld.datagen;

import com.theunderworld.world.TUConfiguredFeatures;
import com.theunderworld.world.TUPlacedFeatures;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TheUnderworldDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		FabricDataGenerator.Pack pack = generator.createPack();

		pack.addProvider(TUModelProvider::new);
		pack.addProvider(TUBlockLootTableProvider::new);
		pack.addProvider(TUBlockTagProvider::new);
		pack.addProvider(TUItemTagProvider::new);
		pack.addProvider(TURecipeProvider::new);
		pack.addProvider(TUWorldGenProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, TUConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, TUPlacedFeatures::bootstrap);
	}
}

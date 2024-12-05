package com.theunderworld.world;

import com.theunderworld.TheUnderworld;
import com.theunderworld.Collections.BlocksCollection;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class TUPlacedFeatures {
    // Trees
    public static final RegistryKey<PlacedFeature> HOLLOW_OAK_TREE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "hollow_oak_tree_placed"));
    public static final RegistryKey<PlacedFeature> HOLLOW_OAK_FOREST_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "hollow_oak_forest_placed"));
    public static final RegistryKey<PlacedFeature> DREADWOOD_FOREST_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "dreadwood_forest_placed"));

    // Vegetation
    public static final RegistryKey<PlacedFeature> SHRUB_PATCH_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "shrub_patch_placed"));
    
    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> hollowOakTree = registryEntryLookup.getOrThrow(TUConfiguredFeatures.HOLLOW_OAK_TREE);
        RegistryEntry<ConfiguredFeature<?, ?>> dreadwoodTree = registryEntryLookup.getOrThrow(TUConfiguredFeatures.DREADWOOD_TREE);
        RegistryEntry<ConfiguredFeature<?, ?>> shrubPatch = registryEntryLookup.getOrThrow(TUConfiguredFeatures.SHRUB_PATCH);

        featureRegisterable.register(HOLLOW_OAK_TREE_PLACED, new PlacedFeature(hollowOakTree, 
            VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(0, 0.05f, 1), 
                BlocksCollection.HOLLOW_OAK_SAPLING)
        ));

        featureRegisterable.register(HOLLOW_OAK_FOREST_PLACED, new PlacedFeature(hollowOakTree, 
            VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(10, 0.1f, 1), 
                BlocksCollection.HOLLOW_OAK_SAPLING)
        ));

        featureRegisterable.register(DREADWOOD_FOREST_PLACED, new PlacedFeature(dreadwoodTree, 
            VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(10, 0.1f, 1), 
                BlocksCollection.DREADWOOD_SHRUB)
        ));

        featureRegisterable.register(SHRUB_PATCH_PLACED, new PlacedFeature(shrubPatch, 
            VegetationPlacedFeatures.modifiers(2)
        ));
    }
}

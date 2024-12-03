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
    
    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> hollowOakTree = registryEntryLookup.getOrThrow(TUConfiguredFeatures.HOLLOW_OAK_TREE);

        featureRegisterable.register(HOLLOW_OAK_TREE_PLACED, new PlacedFeature(hollowOakTree, 
            VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(0, 0.05f, 1), 
                BlocksCollection.HOLLOW_OAK_SAPLING)
        ));
    }
}

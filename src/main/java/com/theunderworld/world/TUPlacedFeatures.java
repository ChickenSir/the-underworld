package com.theunderworld.world;

import java.util.List;

import com.theunderworld.TheUnderworld;
import com.theunderworld.Collections.BlocksCollection;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class TUPlacedFeatures {
    // Trees
    public static final RegistryKey<PlacedFeature> HOLLOW_OAK_TREE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "hollow_oak_tree_placed"));
    public static final RegistryKey<PlacedFeature> HOLLOW_OAK_FOREST_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "hollow_oak_forest_placed"));
    public static final RegistryKey<PlacedFeature> DREADWOOD_FOREST_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "dreadwood_forest_placed"));

    // Vegetation
    public static final RegistryKey<PlacedFeature> SHRUB_PATCH_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "shrub_patch_placed"));
    public static final RegistryKey<PlacedFeature> RADIANT_MUSHROOM_PATCH_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "radiant_mushroom_patch_placed"));
    public static final RegistryKey<PlacedFeature> DREADSHROOM_PATCH_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "dreadshroom_patch_placed"));
    public static final RegistryKey<PlacedFeature> DEAD_SHRUB_PATCH_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "dead_shrub_patch_placed"));

    // Ores
    public static final RegistryKey<PlacedFeature> ORE_OPACITITE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "ore_opacitite_placed"));
    public static final RegistryKey<PlacedFeature> ORE_RADIANT_COAL_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "ore_radiant_coal_placed"));

    // Terrain Ores
    public static final RegistryKey<PlacedFeature> ORE_UNDERWORLD_SOIL_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheUnderworld.modID, "ore_underworld_soil_placed"));
    
    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> hollowOakTree = registryEntryLookup.getOrThrow(TUConfiguredFeatures.HOLLOW_OAK_TREE);
        RegistryEntry<ConfiguredFeature<?, ?>> dreadwoodTree = registryEntryLookup.getOrThrow(TUConfiguredFeatures.DREADWOOD_TREE);
        RegistryEntry<ConfiguredFeature<?, ?>> shrubPatch = registryEntryLookup.getOrThrow(TUConfiguredFeatures.SHRUB_PATCH);
        RegistryEntry<ConfiguredFeature<?, ?>> radiantMushroomPatch = registryEntryLookup.getOrThrow(TUConfiguredFeatures.RADIANT_MUSHROOM_PATCH);
        RegistryEntry<ConfiguredFeature<?, ?>> dreadshroomPatch = registryEntryLookup.getOrThrow(TUConfiguredFeatures.DREADSHROOM_PATCH);
        RegistryEntry<ConfiguredFeature<?, ?>> deadShrubPatch = registryEntryLookup.getOrThrow(TUConfiguredFeatures.DEAD_SHRUB_PATCH);
        RegistryEntry<ConfiguredFeature<?, ?>> oreOpacitite = registryEntryLookup.getOrThrow(TUConfiguredFeatures.ORE_OPACITITE);
        RegistryEntry<ConfiguredFeature<?, ?>> oreRadiantCoal = registryEntryLookup.getOrThrow(TUConfiguredFeatures.ORE_RADIANT_COAL);
        RegistryEntry<ConfiguredFeature<?, ?>> oreUnderworldSoil = registryEntryLookup.getOrThrow(TUConfiguredFeatures.ORE_UNDERWORLD_SOIL);

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

        featureRegisterable.register(RADIANT_MUSHROOM_PATCH_PLACED, new PlacedFeature(radiantMushroomPatch, 
            List.of(CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(12), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of())
        ));

        featureRegisterable.register(DREADSHROOM_PATCH_PLACED, new PlacedFeature(dreadshroomPatch, 
            List.of(CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(12), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of())
        ));

        featureRegisterable.register(DEAD_SHRUB_PATCH_PLACED, new PlacedFeature(deadShrubPatch, 
            VegetationPlacedFeatures.modifiers(2)
        ));

        featureRegisterable.register(ORE_OPACITITE_PLACED, new PlacedFeature(oreOpacitite, 
            List.of(CountPlacementModifier.of(8), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(32)), BiomePlacementModifier.of())
        ));

        featureRegisterable.register(ORE_RADIANT_COAL_PLACED, new PlacedFeature(oreRadiantCoal, 
            List.of(CountPlacementModifier.of(16), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(15), YOffset.fixed(55)), BiomePlacementModifier.of())
        ));

        featureRegisterable.register(ORE_UNDERWORLD_SOIL_PLACED, new PlacedFeature(oreUnderworldSoil, 
            List.of(CountPlacementModifier.of(6), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(25), YOffset.fixed(60)), BiomePlacementModifier.of())
        ));
    }
}

package com.theunderworld.world;

import java.util.List;

import com.theunderworld.TheUnderworld;
import com.theunderworld.Collections.BlocksCollection;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SimpleBlockFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class TUConfiguredFeatures {
    // Trees
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLOW_OAK_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "hollow_oak_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADWOOD_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "dreadwood_tree"));

    // Vegetation
    public static final RegistryKey<ConfiguredFeature<?, ?>> SHRUB_PATCH = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "shrub_patch"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> RADIANT_MUSHROOM_PATCH = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "radiant_mushroom_patch"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADSHROOM_PATCH = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "dreadshroom_patch"));

    // Ores
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_OPACITITE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "ore_opacitite"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_RADIANT_COAL = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "ore_radiant_coal"));

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest dreadstoneReplacables = new BlockMatchRuleTest(BlocksCollection.DREADSTONE);
        List<OreFeatureConfig.Target> opacititeOre = List.of(OreFeatureConfig.createTarget(dreadstoneReplacables, BlocksCollection.OPACITITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> radiantCoalOre = List.of(OreFeatureConfig.createTarget(dreadstoneReplacables, BlocksCollection.RADIANT_COAL_ORE.getDefaultState()));

        featureRegisterable.register(HOLLOW_OAK_TREE, new ConfiguredFeature<>(Feature.TREE, 
            new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksCollection.HOLLOW_OAK_LOG), 
                new StraightTrunkPlacer(4, 2, 0), 
                BlockStateProvider.of(BlocksCollection.HOLLOW_OAK_LEAVES), 
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), 
                new TwoLayersFeatureSize(1, 0, 1)
            ).build()
        ));

        featureRegisterable.register(DREADWOOD_TREE, new ConfiguredFeature<>(Feature.TREE, 
            new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksCollection.DREADWOOD_LOG), 
                new LargeOakTrunkPlacer(8, 2, 1), 
                BlockStateProvider.of(Blocks.AIR), 
                new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0), 
                new TwoLayersFeatureSize(1, 0, 1)
            ).build()
        ));

        featureRegisterable.register(SHRUB_PATCH, new ConfiguredFeature<>(Feature.RANDOM_PATCH, 
            new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(
                Feature.SIMPLE_BLOCK, 
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksCollection.UNDERWORLD_SHRUB))
            ))
        ));

        featureRegisterable.register(RADIANT_MUSHROOM_PATCH, new ConfiguredFeature<>(Feature.RANDOM_PATCH, 
            new RandomPatchFeatureConfig(96, 7, 3, PlacedFeatures.createEntry(
                Feature.SIMPLE_BLOCK, 
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksCollection.RADIANT_MUSHROOM))
                ))
        ));

        featureRegisterable.register(DREADSHROOM_PATCH, new ConfiguredFeature<>(Feature.RANDOM_PATCH, 
            new RandomPatchFeatureConfig(96, 7, 3, PlacedFeatures.createEntry(
                Feature.SIMPLE_BLOCK, 
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksCollection.DREADSHROOM))
                ))
        ));

        featureRegisterable.register(ORE_OPACITITE, new ConfiguredFeature<>(Feature.ORE, 
            new OreFeatureConfig(opacititeOre, 8)
        ));

        featureRegisterable.register(ORE_RADIANT_COAL, new ConfiguredFeature<>(Feature.ORE, 
            new OreFeatureConfig(radiantCoalOre, 16)
        ));
    }
}

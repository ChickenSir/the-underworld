package com.theunderworld.world;

import com.theunderworld.TheUnderworld;
import com.theunderworld.Collections.BlocksCollection;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class TUConfiguredFeatures {
    // Trees
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLOW_OAK_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "hollow_oak_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADWOOD_TREE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheUnderworld.modID, "dreadwood_tree"));

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
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
                new CherryTrunkPlacer(8, 2, 1, ConstantIntProvider.create(3), UniformIntProvider.create(2, 4), UniformIntProvider.create(-4, -3), UniformIntProvider.create(-1, 0)), 
                BlockStateProvider.of(Blocks.AIR), 
                new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0), 
                new TwoLayersFeatureSize(1, 0, 1)
            ).build()
        ));
    }
}

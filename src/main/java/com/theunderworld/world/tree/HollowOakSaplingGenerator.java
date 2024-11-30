package com.theunderworld.world.tree;

import org.jetbrains.annotations.Nullable;

import com.theunderworld.world.TUConfiguredFeatures;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class HollowOakSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random arg0, boolean arg1) {
        return TUConfiguredFeatures.HOLLOW_OAK_TREE;
    }
}

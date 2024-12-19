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
            .add(BlocksCollection.HOLLOW_OAK_LOG)
            .add(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG)
            .add(BlocksCollection.HOLLOW_OAK_PLANKS)
            .add(BlocksCollection.HOLLOW_OAK_WOOD)
            .add(BlocksCollection.STRIPPED_HOLLOW_OAK_WOOD)
            .add(BlocksCollection.DREADWOOD_LOG)
            .add(BlocksCollection.STRIPPED_DREADWOOD_LOG)
            .add(BlocksCollection.DREADWOOD_WOOD)
            .add(BlocksCollection.STRIPPED_DREADWOOD_WOOD)
            .add(BlocksCollection.DREADWOOD_PLANKS);

        getOrCreateTagBuilder(BlockTags.FENCES)
            .add(BlocksCollection.HOLLOW_OAK_FENCE)
            .add(BlocksCollection.DREADWOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(BlocksCollection.DREADSTONE_WALL)
            .add(BlocksCollection.COBBLED_DREADSTONE_WALL)
            .add(BlocksCollection.DREADSTONE_BRICK_WALL)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_WALL)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_WALL)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_WALL);

        getOrCreateTagBuilder(BlockTags.STAIRS)
            .add(BlocksCollection.HOLLOW_OAK_STAIRS)
            .add(BlocksCollection.DREADWOOD_STAIRS)
            .add(BlocksCollection.DREADSTONE_STAIRS)
            .add(BlocksCollection.COBBLED_DREADSTONE_STAIRS)
            .add(BlocksCollection.DREADSTONE_BRICK_STAIRS)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_STAIRS)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(BlocksCollection.HOLLOW_OAK_SLAB)
            .add(BlocksCollection.DREADWOOD_SLAB)
            .add(BlocksCollection.DREADSTONE_SLAB)
            .add(BlocksCollection.COBBLED_DREADSTONE_SLAB)
            .add(BlocksCollection.DREADSTONE_BRICK_SLAB)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SLAB)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_SLAB);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(BlocksCollection.HOLLOW_OAK_FENCE_GATE)
            .add(BlocksCollection.DREADWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(BlocksCollection.DREADSTONE)
            .add(BlocksCollection.COBBLED_DREADSTONE)
            .add(BlocksCollection.DREADSTONE_STAIRS)
            .add(BlocksCollection.DREADSTONE_SLAB)
            .add(BlocksCollection.DREADSTONE_WALL)
            .add(BlocksCollection.COBBLED_DREADSTONE_STAIRS)
            .add(BlocksCollection.COBBLED_DREADSTONE_SLAB)
            .add(BlocksCollection.COBBLED_DREADSTONE_WALL)
            .add(BlocksCollection.DREADSTONE_BRICKS)
            .add(BlocksCollection.DREADSTONE_BRICK_STAIRS)
            .add(BlocksCollection.DREADSTONE_BRICK_SLAB)
            .add(BlocksCollection.DREADSTONE_BRICK_WALL)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_STAIRS)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SLAB)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_WALL)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_STAIRS)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_SLAB)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_COBBLED_WALL)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_STAIRS)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_SLAB)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE_SMOOTH_WALL)
            .add(BlocksCollection.OPACITITE_ORE)
            .add(BlocksCollection.RADIANT_COAL_ORE)
            .add(BlocksCollection.OPACITITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.DIRT)
            .add(BlocksCollection.UNDERWORLD_SOIL)
            .add(BlocksCollection.UNDERWORLD_GRASS);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(BlocksCollection.UNDERWORLD_SOIL)
            .add(BlocksCollection.UNDERWORLD_GRASS)
            .add(BlocksCollection.UNDERWORLD_SAND);

        getOrCreateTagBuilder(BlockTags.LEAVES)
            .add(BlocksCollection.HOLLOW_OAK_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
            .add(BlocksCollection.HOLLOW_OAK_SAPLING)
            .add(BlocksCollection.DREADWOOD_SHRUB);

        getOrCreateTagBuilder(BlockTags.SAND)
            .add(BlocksCollection.UNDERWORLD_SAND);

        getOrCreateTagBuilder(BlockTags.OVERWORLD_CARVER_REPLACEABLES)
            .add(BlocksCollection.DREADSTONE)
            .add(BlocksCollection.UNDERWORLD_GRASS)
            .add(BlocksCollection.UNDERWORLD_SOIL)
            .add(BlocksCollection.UNDERWORLD_SAND)
            .add(BlocksCollection.UNDERWORLD_SANDSTONE);
    }
    
}

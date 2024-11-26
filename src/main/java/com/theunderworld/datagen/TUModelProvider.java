package com.theunderworld.datagen;

import com.theunderworld.Collections.BlocksCollection;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class TUModelProvider extends FabricModelProvider {
    public TUModelProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(BlocksCollection.HOLLOW_OAK_LOG)
            .log(BlocksCollection.HOLLOW_OAK_LOG)
            .wood(BlocksCollection.HOLLOW_OAK_WOOD);

        blockStateModelGenerator.registerLog(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG)
            .log(BlocksCollection.STRIPPED_HOLLOW_OAK_LOG)
            .wood(BlocksCollection.STRIPPED_HOLLOW_OAK_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(BlocksCollection.HOLLOW_OAK_PLANKS);

        BlockStateModelGenerator.BlockTexturePool hollow_oak_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksCollection.HOLLOW_OAK_PLANKS);
        hollow_oak_pool.fence(BlocksCollection.HOLLOW_OAK_FENCE);
        hollow_oak_pool.stairs(BlocksCollection.HOLLOW_OAK_STAIRS);
        hollow_oak_pool.slab(BlocksCollection.HOLLOW_OAK_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        
    }
    
}

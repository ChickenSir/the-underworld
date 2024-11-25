package com.theunderworld.Collections;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlocksCollection {
    public static final Block HOLLOW_OAK_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG));
    public static final Block STRIPPED_HOLLOW_OAK_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG));
    public static final Block HOLLOW_OAK_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));

    public static void Register(String modID) {
        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_log"), HOLLOW_OAK_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_log"), new BlockItem(HOLLOW_OAK_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_hollow_oak_log"), STRIPPED_HOLLOW_OAK_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_hollow_oak_log"), new BlockItem(STRIPPED_HOLLOW_OAK_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_planks"), HOLLOW_OAK_PLANKS);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_planks"), new BlockItem(HOLLOW_OAK_PLANKS, new FabricItemSettings()));
    }
}

package com.theunderworld.Collections;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlocksCollection {
    public static final Block HOLLOW_OAK_LOG = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));

    public static void Register(String modID) {
        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_log"), HOLLOW_OAK_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_log"), new BlockItem(HOLLOW_OAK_LOG, new FabricItemSettings()));
    }
}

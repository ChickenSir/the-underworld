package com.theunderworld.Collections;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WoodType;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlocksCollection {
    // Hollow Oak Blocks
    public static final Block HOLLOW_OAK_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG));
    public static final Block STRIPPED_HOLLOW_OAK_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG));
    public static final Block HOLLOW_OAK_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD));
    public static final Block STRIPPED_HOLLOW_OAK_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD));
    public static final Block HOLLOW_OAK_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));

    public static final Block HOLLOW_OAK_STAIRS = new StairsBlock(HOLLOW_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static final Block HOLLOW_OAK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static final Block HOLLOW_OAK_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static final Block HOLLOW_OAK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_STAIRS), WoodType.OAK);
    public static final Block HOLLOW_OAK_BUTTON = new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK, 30, true);
    public static final Block HOLLOW_OAK_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK);

    public static final Block HOLLOW_OAK_DOOR = new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK);
    public static final Block HOLLOW_OAK_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK);

    public static void Register(String modID) {
        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_log"), HOLLOW_OAK_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_log"), new BlockItem(HOLLOW_OAK_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_hollow_oak_log"), STRIPPED_HOLLOW_OAK_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_hollow_oak_log"), new BlockItem(STRIPPED_HOLLOW_OAK_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_wood"), HOLLOW_OAK_WOOD);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_wood"), new BlockItem(HOLLOW_OAK_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_hollow_oak_wood"), STRIPPED_HOLLOW_OAK_WOOD);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_hollow_oak_wood"), new BlockItem(STRIPPED_HOLLOW_OAK_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_planks"), HOLLOW_OAK_PLANKS);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_planks"), new BlockItem(HOLLOW_OAK_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_stairs"), HOLLOW_OAK_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_stairs"), new BlockItem(HOLLOW_OAK_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_slab"), HOLLOW_OAK_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_slab"), new BlockItem(HOLLOW_OAK_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_fence"), HOLLOW_OAK_FENCE);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_fence"), new BlockItem(HOLLOW_OAK_FENCE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_fence_gate"), HOLLOW_OAK_FENCE_GATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_fence_gate"), new BlockItem(HOLLOW_OAK_FENCE_GATE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_button"), HOLLOW_OAK_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_button"), new BlockItem(HOLLOW_OAK_BUTTON, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_pressure_plate"), HOLLOW_OAK_PRESSURE_PLATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_pressure_plate"), new BlockItem(HOLLOW_OAK_PRESSURE_PLATE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_door"), HOLLOW_OAK_DOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_door"), new BlockItem(HOLLOW_OAK_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_trapdoor"), HOLLOW_OAK_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_trapdoor"), new BlockItem(HOLLOW_OAK_TRAPDOOR, new FabricItemSettings()));
    }
}

package com.theunderworld.Collections;

import com.theunderworld.world.tree.DreadwoodSaplingGenerator;
import com.theunderworld.world.tree.HollowOakSaplingGenerator;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.DeadBushBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FernBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodType;
import net.minecraft.entity.effect.StatusEffects;
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
    public static final Block HOLLOW_OAK_TILES = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));

    public static final Block HOLLOW_OAK_STAIRS = new StairsBlock(HOLLOW_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static final Block HOLLOW_OAK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB));
    public static final Block HOLLOW_OAK_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE));
    public static final Block HOLLOW_OAK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK);
    public static final Block HOLLOW_OAK_BUTTON = new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK, 30, true);
    public static final Block HOLLOW_OAK_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK);
    public static final Block HOLLOW_OAK_TILES_STAIRS = new StairsBlock(HOLLOW_OAK_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static final Block HOLLOW_OAK_TILES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB));

    public static final Block HOLLOW_OAK_DOOR = new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK);
    public static final Block HOLLOW_OAK_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK);

    public static final Block HOLLOW_OAK_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Block HOLLOW_OAK_SAPLING = new SaplingBlock(new HollowOakSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));
    
    // Dreadwood Blocks
    public static final Block DREADWOOD_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG));
    public static final Block STRIPPED_DREADWOOD_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG));
    public static final Block DREADWOOD_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD));
    public static final Block STRIPPED_DREADWOOD_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block DREADWOOD_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS));
    public static final Block DREADWOOD_TILES = new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS));

    public static final Block DREADWOOD_STAIRS = new StairsBlock(DREADWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS));
    public static final Block DREADWOOD_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB));
    public static final Block DREADWOOD_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE));
    public static final Block DREADWOOD_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY);
    public static final Block DREADWOOD_BUTTON = new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS), BlockSetType.CHERRY, 30, true);
    public static final Block DREADWOOD_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS), BlockSetType.CHERRY);
    public static final Block DREADWOOD_TILES_STAIRS = new StairsBlock(DREADWOOD_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS));
    public static final Block DREADWOOD_TILES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB));

    public static final Block DREADWOOD_DOOR = new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).nonOpaque(), BlockSetType.CHERRY);
    public static final Block DREADWOOD_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).nonOpaque(), BlockSetType.CHERRY);

    public static final Block DREADWOOD_SHRUB = new SaplingBlock(new DreadwoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));

    // Dreadstone Blocks

    public static final Block DREADSTONE = new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block DREADSTONE_STAIRS = new StairsBlock(DREADSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS));
    public static final Block DREADSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB));
    public static final Block DREADSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL));

    public static final Block COBBLED_DREADSTONE = new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool());
    public static final Block COBBLED_DREADSTONE_STAIRS = new StairsBlock(COBBLED_DREADSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS));
    public static final Block COBBLED_DREADSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB));
    public static final Block COBBLED_DREADSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL));

    public static final Block DREADSTONE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block DREADSTONE_BRICK_STAIRS = new StairsBlock(DREADSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS));
    public static final Block DREADSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB));
    public static final Block DREADSTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL));

    public static final Block SMOOTH_DREADSTONE = new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).requiresTool());
    public static final Block SMOOTH_DREADSTONE_STAIRS = new StairsBlock(SMOOTH_DREADSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS));
    public static final Block SMOOTH_DREADSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB));
    public static final Block SMOOTH_DREADSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL));

    // Ground Terrain Blocks

    public static final Block UNDERWORLD_SOIL = new Block(FabricBlockSettings.copyOf(Blocks.DIRT));
    public static final Block UNDERWORLD_GRASS = new GrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    public static final Block UNDERWORLD_SAND = new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND));

    // Underworld Sandstone Blocks

    public static final Block UNDERWORLD_SANDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block UNDERWORLD_SANDSTONE_STAIRS = new StairsBlock(UNDERWORLD_SANDSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS));
    public static final Block UNDERWORLD_SANDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB));
    public static final Block UNDERWORLD_SANDSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL));

    public static final Block UNDERWORLD_SANDSTONE_COBBLED = new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block UNDERWORLD_SANDSTONE_COBBLED_STAIRS = new StairsBlock(UNDERWORLD_SANDSTONE_COBBLED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS));
    public static final Block UNDERWORLD_SANDSTONE_COBBLED_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB));
    public static final Block UNDERWORLD_SANDSTONE_COBBLED_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL));

    public static final Block UNDERWORLD_SANDSTONE_SMOOTH = new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block UNDERWORLD_SANDSTONE_SMOOTH_STAIRS = new StairsBlock(UNDERWORLD_SANDSTONE_SMOOTH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS));
    public static final Block UNDERWORLD_SANDSTONE_SMOOTH_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB));
    public static final Block UNDERWORLD_SANDSTONE_SMOOTH_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL));

    // Vegetation Blocks
    
    public static final Block UNDERWORLD_SHRUB = new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS));
    public static final Block RADIANT_MUSHROOM = new FlowerBlock(StatusEffects.GLOWING, 15, FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).luminance(3));
    public static final Block DREADSHROOM = new FlowerBlock(StatusEffects.BLINDNESS, 5, FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM));
    public static final Block DEAD_SHRUB = new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH));

    // Flower Pot Blocks

    public static final Block POTTED_HOLLOW_OAK_SAPLING = new FlowerPotBlock(HOLLOW_OAK_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING));
    public static final Block POTTED_DREADWOOD_SHRUB = new FlowerPotBlock(DREADWOOD_SHRUB, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING));
    public static final Block POTTED_RADIANT_MUSHROOM = new FlowerPotBlock(RADIANT_MUSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM));
    public static final Block POTTED_DREADSHROOM = new FlowerPotBlock(DREADSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_BROWN_MUSHROOM));

    // Ores

    public static final Block OPACITITE_ORE = new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).requiresTool());
    public static final Block RADIANT_COAL_ORE = new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool());

    // Material Blocks

    public static final Block OPACITITE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().nonOpaque());
    public static final Block RADIANT_COAL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool());

    public static void Register(String modID) {
        // Hollow Oak Blocks
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
        
        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_tiles"), HOLLOW_OAK_TILES);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_tiles"), new BlockItem(HOLLOW_OAK_TILES, new FabricItemSettings()));

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

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_tiles_stairs"), HOLLOW_OAK_TILES_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_tiles_stairs"), new BlockItem(HOLLOW_OAK_TILES_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_tiles_slab"), HOLLOW_OAK_TILES_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_tiles_slab"), new BlockItem(HOLLOW_OAK_TILES_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_door"), HOLLOW_OAK_DOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_door"), new BlockItem(HOLLOW_OAK_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_trapdoor"), HOLLOW_OAK_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_trapdoor"), new BlockItem(HOLLOW_OAK_TRAPDOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_leaves"), HOLLOW_OAK_LEAVES);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_leaves"), new BlockItem(HOLLOW_OAK_LEAVES, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "hollow_oak_sapling"), HOLLOW_OAK_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(modID, "hollow_oak_sapling"), new BlockItem(HOLLOW_OAK_SAPLING, new FabricItemSettings()));

        StrippableBlockRegistry.register(HOLLOW_OAK_LOG, STRIPPED_HOLLOW_OAK_LOG);
        StrippableBlockRegistry.register(HOLLOW_OAK_WOOD, STRIPPED_HOLLOW_OAK_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_HOLLOW_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_HOLLOW_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_BUTTON, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_PRESSURE_PLATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_DOOR, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_TRAPDOOR, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(HOLLOW_OAK_LEAVES, 30, 60);

        // Dreadwood Blocks
        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_log"), DREADWOOD_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_log"), new BlockItem(DREADWOOD_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_dreadwood_log"), STRIPPED_DREADWOOD_LOG);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_dreadwood_log"), new BlockItem(STRIPPED_DREADWOOD_LOG, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_wood"), DREADWOOD_WOOD);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_wood"), new BlockItem(DREADWOOD_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "stripped_dreadwood_wood"), STRIPPED_DREADWOOD_WOOD);
        Registry.register(Registries.ITEM, new Identifier(modID, "stripped_dreadwood_wood"), new BlockItem(STRIPPED_DREADWOOD_WOOD, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_planks"), DREADWOOD_PLANKS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_planks"), new BlockItem(DREADWOOD_PLANKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_tiles"), DREADWOOD_TILES);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_tiles"), new BlockItem(DREADWOOD_TILES, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_stairs"), DREADWOOD_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_stairs"), new BlockItem(DREADWOOD_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_slab"), DREADWOOD_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_slab"), new BlockItem(DREADWOOD_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_fence"), DREADWOOD_FENCE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_fence"), new BlockItem(DREADWOOD_FENCE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_fence_gate"), DREADWOOD_FENCE_GATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_fence_gate"), new BlockItem(DREADWOOD_FENCE_GATE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_button"), DREADWOOD_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_button"), new BlockItem(DREADWOOD_BUTTON, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_pressure_plate"), DREADWOOD_PRESSURE_PLATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_pressure_plate"), new BlockItem(DREADWOOD_PRESSURE_PLATE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_tiles_stairs"), DREADWOOD_TILES_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_tiles_stairs"), new BlockItem(DREADWOOD_TILES_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_tiles_slab"), DREADWOOD_TILES_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_tiles_slab"), new BlockItem(DREADWOOD_TILES_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_door"), DREADWOOD_DOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_door"), new BlockItem(DREADWOOD_DOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_trapdoor"), DREADWOOD_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_trapdoor"), new BlockItem(DREADWOOD_TRAPDOOR, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadwood_shrub"), DREADWOOD_SHRUB);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadwood_shrub"), new BlockItem(DREADWOOD_SHRUB, new FabricItemSettings()));

        StrippableBlockRegistry.register(DREADWOOD_LOG, STRIPPED_DREADWOOD_LOG);
        StrippableBlockRegistry.register(DREADWOOD_WOOD, STRIPPED_DREADWOOD_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_DREADWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_DREADWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_BUTTON, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_PRESSURE_PLATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_DOOR, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DREADWOOD_TRAPDOOR, 5, 20);

        // Dreadstone Blocks
        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadstone"), DREADSTONE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone"), new BlockItem(DREADSTONE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadstone_stairs"), DREADSTONE_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_stairs"), new BlockItem(DREADSTONE_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadstone_slab"), DREADSTONE_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_slab"), new BlockItem(DREADSTONE_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadstone_wall"), DREADSTONE_WALL);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_wall"), new BlockItem(DREADSTONE_WALL, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "cobbled_dreadstone"), COBBLED_DREADSTONE);
        Registry.register(Registries.ITEM, new Identifier(modID, "cobbled_dreadstone"), new BlockItem(COBBLED_DREADSTONE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "cobbled_dreadstone_stairs"), COBBLED_DREADSTONE_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "cobbled_dreadstone_stairs"), new BlockItem(COBBLED_DREADSTONE_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "cobbled_dreadstone_slab"), COBBLED_DREADSTONE_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "cobbled_dreadstone_slab"), new BlockItem(COBBLED_DREADSTONE_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "cobbled_dreadstone_wall"), COBBLED_DREADSTONE_WALL);
        Registry.register(Registries.ITEM, new Identifier(modID, "cobbled_dreadstone_wall"), new BlockItem(COBBLED_DREADSTONE_WALL, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadstone_bricks"), DREADSTONE_BRICKS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_bricks"), new BlockItem(DREADSTONE_BRICKS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadstone_brick_stairs"), DREADSTONE_BRICK_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_brick_stairs"), new BlockItem(DREADSTONE_BRICK_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadstone_brick_slab"), DREADSTONE_BRICK_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_brick_slab"), new BlockItem(DREADSTONE_BRICK_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadstone_brick_wall"), DREADSTONE_BRICK_WALL);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_brick_wall"), new BlockItem(DREADSTONE_BRICK_WALL, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "smooth_dreadstone"), SMOOTH_DREADSTONE);
        Registry.register(Registries.ITEM, new Identifier(modID, "smooth_dreadstone"), new BlockItem(SMOOTH_DREADSTONE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "smooth_dreadstone_stairs"), SMOOTH_DREADSTONE_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "smooth_dreadstone_stairs"), new BlockItem(SMOOTH_DREADSTONE_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "smooth_dreadstone_slab"), SMOOTH_DREADSTONE_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "smooth_dreadstone_slab"), new BlockItem(SMOOTH_DREADSTONE_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "smooth_dreadstone_wall"), SMOOTH_DREADSTONE_WALL);
        Registry.register(Registries.ITEM, new Identifier(modID, "smooth_dreadstone_wall"), new BlockItem(SMOOTH_DREADSTONE_WALL, new FabricItemSettings()));

        // Terrain Blocks
        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_soil"), UNDERWORLD_SOIL);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_soil"), new BlockItem(UNDERWORLD_SOIL, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_grass"), UNDERWORLD_GRASS);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_grass"), new BlockItem(UNDERWORLD_GRASS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sand"), UNDERWORLD_SAND);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sand"), new BlockItem(UNDERWORLD_SAND, new FabricItemSettings()));

        // Underworld Sandstone Blocks
        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone"), UNDERWORLD_SANDSTONE);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone"), new BlockItem(UNDERWORLD_SANDSTONE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_stairs"), UNDERWORLD_SANDSTONE_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_stairs"), new BlockItem(UNDERWORLD_SANDSTONE_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_slab"), UNDERWORLD_SANDSTONE_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_slab"), new BlockItem(UNDERWORLD_SANDSTONE_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_wall"), UNDERWORLD_SANDSTONE_WALL);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_wall"), new BlockItem(UNDERWORLD_SANDSTONE_WALL, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_cobbled"), UNDERWORLD_SANDSTONE_COBBLED);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_cobbled"), new BlockItem(UNDERWORLD_SANDSTONE_COBBLED, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_cobbled_stairs"), UNDERWORLD_SANDSTONE_COBBLED_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_cobbled_stairs"), new BlockItem(UNDERWORLD_SANDSTONE_COBBLED_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_cobbled_slab"), UNDERWORLD_SANDSTONE_COBBLED_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_cobbled_slab"), new BlockItem(UNDERWORLD_SANDSTONE_COBBLED_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_cobbled_wall"), UNDERWORLD_SANDSTONE_COBBLED_WALL);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_cobbled_wall"), new BlockItem(UNDERWORLD_SANDSTONE_COBBLED_WALL, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_smooth"), UNDERWORLD_SANDSTONE_SMOOTH);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_smooth"), new BlockItem(UNDERWORLD_SANDSTONE_SMOOTH, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_smooth_stairs"), UNDERWORLD_SANDSTONE_SMOOTH_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_smooth_stairs"), new BlockItem(UNDERWORLD_SANDSTONE_SMOOTH_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_smooth_slab"), UNDERWORLD_SANDSTONE_SMOOTH_SLAB);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_smooth_slab"), new BlockItem(UNDERWORLD_SANDSTONE_SMOOTH_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_sandstone_smooth_wall"), UNDERWORLD_SANDSTONE_SMOOTH_WALL);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_sandstone_smooth_wall"), new BlockItem(UNDERWORLD_SANDSTONE_SMOOTH_WALL, new FabricItemSettings()));

        // Vegetation Blocks
        Registry.register(Registries.BLOCK, new Identifier(modID, "underworld_shrub"), UNDERWORLD_SHRUB);
        Registry.register(Registries.ITEM, new Identifier(modID, "underworld_shrub"), new BlockItem(UNDERWORLD_SHRUB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "radiant_mushroom"), RADIANT_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_mushroom"), new BlockItem(RADIANT_MUSHROOM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "dreadshroom"), DREADSHROOM);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadshroom"), new BlockItem(DREADSHROOM, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "potted_hollow_oak_sapling"), POTTED_HOLLOW_OAK_SAPLING);
        Registry.register(Registries.BLOCK, new Identifier(modID, "potted_dreadwood_shrub"), POTTED_DREADWOOD_SHRUB);
        Registry.register(Registries.BLOCK, new Identifier(modID, "potted_radiant_mushroom"), POTTED_RADIANT_MUSHROOM);
        Registry.register(Registries.BLOCK, new Identifier(modID, "potted_dreadshroom"), POTTED_DREADSHROOM);

        Registry.register(Registries.BLOCK, new Identifier(modID, "dead_shrub"), DEAD_SHRUB);
        Registry.register(Registries.ITEM, new Identifier(modID, "dead_shrub"), new BlockItem(DEAD_SHRUB, new FabricItemSettings()));

        // Ores
        Registry.register(Registries.BLOCK, new Identifier(modID, "opacitite_ore"), OPACITITE_ORE);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_ore"), new BlockItem(OPACITITE_ORE, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "radiant_coal_ore"), RADIANT_COAL_ORE);
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_coal_ore"), new BlockItem(RADIANT_COAL_ORE, new FabricItemSettings()));

        // Material Blocks
        Registry.register(Registries.BLOCK, new Identifier(modID, "opacitite_block"), OPACITITE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_block"), new BlockItem(OPACITITE_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "radiant_coal_block"), RADIANT_COAL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_coal_block"), new BlockItem(RADIANT_COAL_BLOCK, new FabricItemSettings()));

        FuelRegistry.INSTANCE.add(BlocksCollection.RADIANT_COAL_BLOCK, 24000);
    }
}

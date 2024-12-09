package com.theunderworld.Collections;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemsCollection {
    // Dreadstone Toolset
    public static final ToolItem DREADSTONE_SWORD = new SwordItem(ToolMaterials.STONE, 3, -2.4f, new FabricItemSettings());
    public static final ToolItem DREADSTONE_PICKAXE = new PickaxeItem(ToolMaterials.STONE, 1, -2.8f, new FabricItemSettings());
    public static final ToolItem DREADSTONE_AXE = new AxeItem(ToolMaterials.STONE, 7.0f, -3.2f, new FabricItemSettings());
    public static final ToolItem DREADSTONE_SHOVEL = new ShovelItem(ToolMaterials.STONE, 1.5f, -3.0f, new FabricItemSettings());
    public static final ToolItem DREADSTONE_HOE = new HoeItem(ToolMaterials.STONE, -1, -2.0f, new FabricItemSettings());
    
    public static void register(String modID) {
        // Dreadstone Toolset
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_sword"), DREADSTONE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_pickaxe"), DREADSTONE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_axe"), DREADSTONE_AXE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_shovel"), DREADSTONE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_hoe"), DREADSTONE_HOE);
    }
}

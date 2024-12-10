package com.theunderworld.Collections;

import com.theunderworld.Items.OpacititeArmorItem;
import com.theunderworld.Items.RadiantOpacititeArmorItem;
import com.theunderworld.Items.SwiftOpacititeArmorItem;
import com.theunderworld.Materials.DreaddedOpacititeArmorMaterial;
import com.theunderworld.Materials.OpacititeArmorMaterial;
import com.theunderworld.Materials.OpacititeToolMaterial;
import com.theunderworld.Materials.RadiantOpacititeArmorMaterial;
import com.theunderworld.Materials.SwiftOpacititeArmorMaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.ArmorItem.Type;
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

    // Materials
    public static final Item RADIANT_DUST = new Item(new FabricItemSettings());
    public static final Item DREADDED_DUST = new Item(new FabricItemSettings());
    public static final Item RAW_OPACITITE = new Item(new FabricItemSettings());
    public static final Item OPACITITE_INGOT = new Item(new FabricItemSettings());
    public static final Item RADIANT_COAL = new Item(new FabricItemSettings());

    // Opacitite Gear
    public static final ToolItem OPACITITE_SWORD = new SwordItem(OpacititeToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings());
    public static final ToolItem OPACITITE_PICKAXE = new PickaxeItem(OpacititeToolMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings());
    public static final ToolItem OPACITITE_AXE = new AxeItem(OpacititeToolMaterial.INSTANCE, 7.0f, -3.2f, new FabricItemSettings());
    public static final ToolItem OPACITITE_SHOVEL = new ShovelItem(OpacititeToolMaterial.INSTANCE, 1.5f, -3.0f, new FabricItemSettings());
    public static final ToolItem OPACITITE_HOE = new HoeItem(OpacititeToolMaterial.INSTANCE, -1, -2.0f, new FabricItemSettings());

    public static final ArmorMaterial OPACITITE_ARMOR_MATERIAL = new OpacititeArmorMaterial();
    public static final Item OPACITITE_HELMET = new OpacititeArmorItem(OPACITITE_ARMOR_MATERIAL, Type.HELMET, new Item.Settings());
    public static final Item OPACITITE_CHESTPLATE = new OpacititeArmorItem(OPACITITE_ARMOR_MATERIAL, Type.CHESTPLATE, new Item.Settings());
    public static final Item OPACITITE_LEGGINGS = new OpacititeArmorItem(OPACITITE_ARMOR_MATERIAL, Type.LEGGINGS, new Item.Settings());
    public static final Item OPACITITE_BOOTS = new OpacititeArmorItem(OPACITITE_ARMOR_MATERIAL, Type.BOOTS, new Item.Settings());

    public static final ToolItem RADIANT_OPACITITE_SWORD = new SwordItem(OpacititeToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings());
    public static final ArmorMaterial RADIANT_OPACITITE_ARMOR_MATERIAL = new RadiantOpacititeArmorMaterial();
    public static final Item RADIANT_OPACITITE_HELMET = new RadiantOpacititeArmorItem(RADIANT_OPACITITE_ARMOR_MATERIAL, Type.HELMET, new Item.Settings());
    public static final Item RADIANT_OPACITITE_CHESTPLATE = new RadiantOpacititeArmorItem(RADIANT_OPACITITE_ARMOR_MATERIAL, Type.CHESTPLATE, new Item.Settings());
    public static final Item RADIANT_OPACITITE_LEGGINGS = new RadiantOpacititeArmorItem(RADIANT_OPACITITE_ARMOR_MATERIAL, Type.LEGGINGS, new Item.Settings());
    public static final Item RADIANT_OPACITITE_BOOTS = new RadiantOpacititeArmorItem(RADIANT_OPACITITE_ARMOR_MATERIAL, Type.BOOTS, new Item.Settings());

    public static final ToolItem DREADDED_OPACITITE_SWORD = new SwordItem(OpacititeToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings());
    public static final ArmorMaterial DREADDED_OPACITITE_ARMOR_MATERIAL = new DreaddedOpacititeArmorMaterial();
    public static final Item DREADDED_OPACITITE_HELMET = new OpacititeArmorItem(DREADDED_OPACITITE_ARMOR_MATERIAL, Type.HELMET, new Item.Settings());
    public static final Item DREADDED_OPACITITE_CHESTPLATE = new OpacititeArmorItem(DREADDED_OPACITITE_ARMOR_MATERIAL, Type.CHESTPLATE, new Item.Settings());
    public static final Item DREADDED_OPACITITE_LEGGINGS = new OpacititeArmorItem(DREADDED_OPACITITE_ARMOR_MATERIAL, Type.LEGGINGS, new Item.Settings());
    public static final Item DREADDED_OPACITITE_BOOTS = new OpacititeArmorItem(DREADDED_OPACITITE_ARMOR_MATERIAL, Type.BOOTS, new Item.Settings());

    public static final ToolItem SWIFT_OPACITITE_SWORD = new SwordItem(OpacititeToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings());
    public static final ArmorMaterial SWIFT_OPACITITE_ARMOR_MATERIAL = new SwiftOpacititeArmorMaterial();
    public static final Item SWIFT_OPACITITE_HELMET = new SwiftOpacititeArmorItem(SWIFT_OPACITITE_ARMOR_MATERIAL, Type.HELMET, new Item.Settings());
    public static final Item SWIFT_OPACITITE_CHESTPLATE = new SwiftOpacititeArmorItem(SWIFT_OPACITITE_ARMOR_MATERIAL, Type.CHESTPLATE, new Item.Settings());
    public static final Item SWIFT_OPACITITE_LEGGINGS = new SwiftOpacititeArmorItem(SWIFT_OPACITITE_ARMOR_MATERIAL, Type.LEGGINGS, new Item.Settings());
    public static final Item SWIFT_OPACITITE_BOOTS = new SwiftOpacititeArmorItem(SWIFT_OPACITITE_ARMOR_MATERIAL, Type.BOOTS, new Item.Settings());
    
    public static void Register(String modID) {
        // Dreadstone Toolset
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_sword"), DREADSTONE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_pickaxe"), DREADSTONE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_axe"), DREADSTONE_AXE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_shovel"), DREADSTONE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadstone_hoe"), DREADSTONE_HOE);

        // Materials
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_dust"), RADIANT_DUST);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadded_dust"), DREADDED_DUST);
        Registry.register(Registries.ITEM, new Identifier(modID, "raw_opacitite"), RAW_OPACITITE);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_ingot"), OPACITITE_INGOT);
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_coal"), RADIANT_COAL);

        FuelRegistry.INSTANCE.add(RADIANT_COAL, 2400);

        // Opacitite Gear
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_sword"), OPACITITE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_pickaxe"), OPACITITE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_axe"), OPACITITE_AXE);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_shovel"), OPACITITE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_hoe"), OPACITITE_HOE);

        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_helmet"), OPACITITE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_chestplate"), OPACITITE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_leggings"), OPACITITE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(modID, "opacitite_boots"), OPACITITE_BOOTS);

        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_opacitite_sword"), RADIANT_OPACITITE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_opacitite_helmet"), RADIANT_OPACITITE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_opacitite_chestplate"), RADIANT_OPACITITE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_opacitite_leggings"), RADIANT_OPACITITE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(modID, "radiant_opacitite_boots"), RADIANT_OPACITITE_BOOTS);

        Registry.register(Registries.ITEM, new Identifier(modID, "dreadded_opacitite_sword"), DREADDED_OPACITITE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadded_opacitite_helmet"), DREADDED_OPACITITE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadded_opacitite_chestplate"), DREADDED_OPACITITE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadded_opacitite_leggings"), DREADDED_OPACITITE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(modID, "dreadded_opacitite_boots"), DREADDED_OPACITITE_BOOTS);

        Registry.register(Registries.ITEM, new Identifier(modID, "swift_opacitite_sword"), SWIFT_OPACITITE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(modID, "swift_opacitite_helmet"), SWIFT_OPACITITE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(modID, "swift_opacitite_chestplate"), SWIFT_OPACITITE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(modID, "swift_opacitite_leggings"), SWIFT_OPACITITE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(modID, "swift_opacitite_boots"), SWIFT_OPACITITE_BOOTS);
    }
}

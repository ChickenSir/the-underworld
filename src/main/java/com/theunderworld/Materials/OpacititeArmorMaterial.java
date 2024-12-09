package com.theunderworld.Materials;

import net.minecraft.item.ArmorItem.Type;

import com.theunderworld.TheUnderworld;
import com.theunderworld.Collections.ItemsCollection;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class OpacititeArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{16, 25, 20, 28};
    private static final int[] PROTECTION_VALUES = new int[]{3, 8, 6, 3};
    private static final int durabilityMultiplier = 20;
    private static final int enchantability = 12;
    private static final String name = "armor_opacitite";
    private static final float toughness = 2.5f;
    private static final float knockbackResistance = 0f;

    @Override
    public int getDurability(Type type) {
        return BASE_DURABILITY[type.ordinal()] * durabilityMultiplier;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }

    @Override
    public String getName() {
        return TheUnderworld.modID + ":" + name;
    }

    @Override
    public int getProtection(Type type) {
        return PROTECTION_VALUES[type.ordinal()];
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemsCollection.OPACITITE_INGOT);
    }

    @Override
    public float getToughness() {
        return toughness;
    }
    
}

package com.theunderworld.Materials;

import com.theunderworld.Collections.ItemsCollection;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OpacititeToolMaterial implements ToolMaterial {
    public static final OpacititeToolMaterial INSTANCE = new OpacititeToolMaterial();

    private int durability = 1864;
    private float miningSpeed = 8.5f;
    private float attackDamage = 3.5f;
    private int miningLevel = 3;
    private int enchantability = 12;

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemsCollection.OPACITITE_INGOT);
    }
    
}

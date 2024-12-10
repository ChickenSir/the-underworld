package com.theunderworld.Items;

import java.util.List;

import com.theunderworld.Collections.ItemsCollection;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class SwiftOpacititeArmorItem extends ArmorItem {
    public SwiftOpacititeArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of(""));
        tooltip.add(Text.translatable("tooltip.theunderworld.generic.when_full_set").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("tooltip.theunderworld.swift_opacitite_armor.status_buff").formatted(Formatting.BLUE));
    }
    
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            if (entity instanceof PlayerEntity player) {
                if (isWearingFullSet(player)) {
                    // Add status effect if full set is worn
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1, 1, false, false, true));
                }
            }
        }
    }

    public boolean isWearingFullSet(PlayerEntity player) {
        ItemStack headStack = player.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chestStack = player.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack legStack = player.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack bootsStack = player.getEquippedStack(EquipmentSlot.FEET);

        // Check if player is wearing full set
        return headStack.isOf(ItemsCollection.SWIFT_OPACITITE_HELMET) &&
            chestStack.isOf(ItemsCollection.SWIFT_OPACITITE_CHESTPLATE) &&
            legStack.isOf(ItemsCollection.SWIFT_OPACITITE_LEGGINGS) &&
            bootsStack.isOf(ItemsCollection.SWIFT_OPACITITE_BOOTS);
    }
}

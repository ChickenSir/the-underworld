package com.theunderworld.Items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class DreaddedOpacititeSwordItem extends SwordItem {
    public DreaddedOpacititeSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);

        // Apply wither status effect to target
        if (!target.hasStatusEffect(StatusEffects.WITHER)) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 0, false, true, true));
        }
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.theunderworld.dreadded_opacitite_sword.bonus_effect").formatted(Formatting.GRAY));
    }
}

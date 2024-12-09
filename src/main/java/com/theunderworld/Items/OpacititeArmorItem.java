package com.theunderworld.Items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class OpacititeArmorItem extends ArmorItem {
    public OpacititeArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of(""));
        tooltip.add(Text.translatable("tooltip.theunderworld.generic.alter_properties").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("tooltip.theunderworld.opacitite_armor.radiant_dust").formatted(Formatting.BLUE));
        tooltip.add(Text.translatable("tooltip.theunderworld.opacitite_armor.dreadded_dust").formatted(Formatting.BLUE));
        tooltip.add(Text.translatable("tooltip.theunderworld.opacitite_armor.redstone_dust").formatted(Formatting.BLUE));
    }
}

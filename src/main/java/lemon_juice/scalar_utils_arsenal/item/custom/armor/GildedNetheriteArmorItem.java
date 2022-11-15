package lemon_juice.scalar_utils_arsenal.item.custom.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class GildedNetheriteArmorItem extends ArmorItem {
    public GildedNetheriteArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties p40388) {
        super(material, slot, p40388);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }
}

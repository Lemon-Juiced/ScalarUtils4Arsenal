package lemon_juice.scalar_utils_arsenal.item.custom.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class DesischalkosArmorItem extends GildedNetheriteArmorItem{
    public DesischalkosArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties p40388) {
        super(material, slot, p40388);
    }

    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan endermanEntity) {
        return true;
    }
}

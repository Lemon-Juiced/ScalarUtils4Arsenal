package lemon_juice.scalar_utils_arsenal.item.custom.armor;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class AngelicArmorItem extends ArmorItem {
    public AngelicArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if(hasCorrectArmorOn(player)){
            if(hasFullSetOfArmorOn(player)){
                if(!player.isCreative() && !player.isSpectator()) {
                    player.getAbilities().mayfly = true;
                }
            }
        }
        if(!hasCorrectArmorOn(player) || !hasFullSetOfArmorOn(player)){
            if(!player.isCreative() && !player.isSpectator()){
                player.getAbilities().mayfly = false;
                if(player.getAbilities().flying) {
                    player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 1)); //Grants slow falling for 5 seconds
                    player.getAbilities().flying = false; //Stops player from flying
                }
            }
        }
    }

    private boolean hasFullSetOfArmorOn(Player player){
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(Player player){
        ArmorMaterial material = ModArmorMaterials.ANGELIC;
        if(player.getInventory().getArmor(0).getItem() == Items.AIR ||
                (player.getInventory().getArmor(1).getItem() == Items.AIR) ||
                (player.getInventory().getArmor(2).getItem() == Items.AIR) ||
                (player.getInventory().getArmor(3).getItem() == Items.AIR)){
            return false; //Stop before hitting below and getting ClassCastException
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material && leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}

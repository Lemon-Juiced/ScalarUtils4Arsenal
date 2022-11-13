package lemon_juice.scalar_utils_arsenal.item.custom.weapons;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class BlazingBladeItem extends SwordItem {
    public BlazingBladeItem(Tier tier, int i, float v, Properties properties) {
        super(tier, i, v, properties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity){
            entity.setSecondsOnFire(12);
            entity.setSharedFlagOnFire(true);
        }

        if(player !=null){
            player.getItemInHand(player.getUsedItemHand()).hurtAndBreak(1, player, (p_41625_) -> p_41625_.broadcastBreakEvent(player.getUsedItemHand()));
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
}

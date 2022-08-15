package lemon_juice.scalar_utils_arsenal.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class MassivenceItem extends SwordItem {
    public MassivenceItem(Tier tier, int p_43270_, float p_43271_, Properties properties) {
        super(tier, p_43270_, p_43271_, properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide && hand == InteractionHand.MAIN_HAND){
            //Heal User
            player.setHealth(player.getHealth() + 1f);

            //Use Durability
            if(player != null)
                player.getItemInHand(hand).hurtAndBreak(1, player, (p_41625_) -> p_41625_.broadcastBreakEvent(hand));

            //Set Cooldown
            player.getCooldowns().addCooldown(this, 5);
        }

        return super.use(level, player, hand);
    }
}

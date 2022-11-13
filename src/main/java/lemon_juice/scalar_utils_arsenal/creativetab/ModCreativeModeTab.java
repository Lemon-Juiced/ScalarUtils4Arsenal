package lemon_juice.scalar_utils_arsenal.creativetab;

import lemon_juice.scalar_utils_arsenal.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SCALAR_UTILS_TAB = new CreativeModeTab("arsenalTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MITHRIL_INGOT.get());
        }
    };
}

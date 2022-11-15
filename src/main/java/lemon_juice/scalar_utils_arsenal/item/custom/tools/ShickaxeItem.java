package lemon_juice.scalar_utils_arsenal.item.custom.tools;

import lemon_juice.scalar_utils_arsenal.item.custom.util.DataTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;

public class ShickaxeItem extends DiggerItem {
    public ShickaxeItem(float v, float v1, Tier tier, Properties properties) {
        super(v, v1, tier, DataTags.WITH_SHICKAXE, properties);
    }
}

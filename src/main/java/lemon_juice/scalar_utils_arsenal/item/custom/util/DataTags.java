package lemon_juice.scalar_utils_arsenal.item.custom.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DataTags {
    public static final TagKey<Block> WITH_SHICKAXE = BlockTags.create(new ResourceLocation("minecraft:mineable/shickaxe"));

    public static void setup(){
        //Needs to be here to be initialized for some reason, even though it's not called
    }
}

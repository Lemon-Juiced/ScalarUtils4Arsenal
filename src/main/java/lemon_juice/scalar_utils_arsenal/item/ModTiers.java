package lemon_juice.scalar_utils_arsenal.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ADAMANTINE = new ForgeTier(3, 4000, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.ADAMANTINE_INGOT.get()));
    public static final ForgeTier ALTARUS = new ForgeTier(3, 4000, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.ALTARUS_INGOT.get()));
    public static final ForgeTier BLUTSTEIN = new ForgeTier(3, 4000, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BLUTSTEIN.get()));
    public static final ForgeTier BLUTSTEIN_UNBREAKABLE = new ForgeTier(3, -1, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BLUTSTEIN.get()));
    public static final ForgeTier MITHRIL = new ForgeTier(3, 4000, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get()));
    public static final ForgeTier TARTARITE = new ForgeTier(3, 4000, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TARTARITE_INGOT.get()));

    public static final ForgeTier VENCE = new ForgeTier(1, 60, 12f, 0f, 0, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModItems.BLUTSTEIN.get()));

}

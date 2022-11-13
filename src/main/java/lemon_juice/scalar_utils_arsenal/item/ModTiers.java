package lemon_juice.scalar_utils_arsenal.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    /*
    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
      return Ingredient.of(ItemTags.PLANKS);
   }),
   STONE(1, 131, 4.0F, 1.0F, 5, () -> {
      return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
   }),
   IRON(2, 250, 6.0F, 2.0F, 14, () -> {
      return Ingredient.of(Items.IRON_INGOT);
   }),
   DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
      return Ingredient.of(Items.DIAMOND);
   }),
   GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
      return Ingredient.of(Items.GOLD_INGOT);
   }),
   NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
      return Ingredient.of(Items.NETHERITE_INGOT);
   });
   */

    public static final ForgeTier ADAMANTINE = new ForgeTier(3, 6400, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.ADAMANTINE_INGOT.get()));
    public static final ForgeTier ALTARUS = new ForgeTier(3, 59, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.ALTARUS_INGOT.get()));
    //public static final ForgeTier BLUTSTEIN = new ForgeTier(3, 4000, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BLUTSTEIN.get()));
    public static final ForgeTier BLUTSTEIN_UNBREAKABLE = new ForgeTier(3, -1, 12f, 3.0f, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BLUTSTEIN.get()));
    public static final ForgeTier COPPER = new ForgeTier(2, 131, 6.0F, 2.0F, 10, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final ForgeTier MITHRIL = new ForgeTier(2, 6400, 12f, 3.0f, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get()));
    public static final ForgeTier VENCE = new ForgeTier(1, 60, 12f, 0f, 0, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModItems.BLUTSTEIN.get()));

}

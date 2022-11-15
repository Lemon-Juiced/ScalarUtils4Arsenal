package lemon_juice.scalar_utils_arsenal.item;

import lemon_juice.scalar_utils_arsenal.creativetab.ModCreativeModeTab;
import lemon_juice.scalar_utils_arsenal.ScalarUtilsArsenal;
import lemon_juice.scalar_utils_arsenal.item.custom.armor.AngelicArmorItem;
import lemon_juice.scalar_utils_arsenal.item.custom.armor.AngelicChestplateItem;
import lemon_juice.scalar_utils_arsenal.item.custom.armor.GildedNetheriteArmorItem;
import lemon_juice.scalar_utils_arsenal.item.custom.armor.ModArmorMaterials;
import lemon_juice.scalar_utils_arsenal.item.custom.tools.ShickaxeItem;
import lemon_juice.scalar_utils_arsenal.item.custom.weapons.BlazingBladeItem;
import lemon_juice.scalar_utils_arsenal.item.custom.weapons.MassivenceItem;
import lemon_juice.scalar_utils_arsenal.item.custom.weapons.PalavenceItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsArsenal.MOD_ID);

    /* Items */
    public static final RegistryObject<Item> BLUTSTEIN_ROD = ITEMS.register("blutstein_rod", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DRAGON_STAR = ITEMS.register("dragon_star", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> LONSDALEITE = ITEMS.register("lonsdaleite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    /* Resources */
    //Gems
    public static final RegistryObject<Item> BLUTSTEIN = ITEMS.register("blutstein", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Ingots
    public static final RegistryObject<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_INGOT = ITEMS.register("altarus_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Nuggets
    public static final RegistryObject<Item> ADAMANTINE_NUGGET = ITEMS.register("adamantine_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_NUGGET = ITEMS.register("altarus_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Raw Ores
    public static final RegistryObject<Item> RAW_ADAMANTINE = ITEMS.register("raw_adamantine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_ALTARUS= ITEMS.register("raw_altarus", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    /* Tools & Armor */
    //Adamantine
    public static final RegistryObject<Item> ADAMANTINE_AXE = ITEMS.register("adamantine_axe", () -> new AxeItem(ModTiers.ADAMANTINE, 5.0f, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_HOE = ITEMS.register("adamantine_hoe", () -> new HoeItem(ModTiers.ADAMANTINE, -3, 0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_PICKAXE = ITEMS.register("adamantine_pickaxe", () -> new PickaxeItem(ModTiers.ADAMANTINE, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_SHOVEL = ITEMS.register("adamantine_shovel", () -> new ShovelItem(ModTiers.ADAMANTINE, 1f, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_SWORD = ITEMS.register("adamantine_sword", () -> new SwordItem(ModTiers.ADAMANTINE, 3, -1.6f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Altarus
    public static final RegistryObject<Item> ALTARUS_AXE = ITEMS.register("altarus_axe", () -> new AxeItem(ModTiers.ALTARUS, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_HOE = ITEMS.register("altarus_hoe", () -> new HoeItem(ModTiers.ALTARUS, -3, 0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_PICKAXE = ITEMS.register("altarus_pickaxe", () -> new PickaxeItem(ModTiers.ALTARUS, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_SHOVEL = ITEMS.register("altarus_shovel", () -> new ShovelItem(ModTiers.ALTARUS, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_SWORD = ITEMS.register("altarus_sword", () -> new SwordItem(ModTiers.ALTARUS, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Angelic Armor
    public static final RegistryObject<Item> ANGELIC_BOOTS = ITEMS.register("angelic_boots", () -> new AngelicArmorItem(ModArmorMaterials.ANGELIC, EquipmentSlot.FEET, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ANGELIC_CHESTPLATE = ITEMS.register("angelic_chestplate", () -> new AngelicChestplateItem(ModArmorMaterials.ANGELIC, EquipmentSlot.CHEST, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ANGELIC_HELMET = ITEMS.register("angelic_helmet", () -> new AngelicArmorItem(ModArmorMaterials.ANGELIC, EquipmentSlot.HEAD, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ANGELIC_LEGGINGS = ITEMS.register("angelic_leggings", () -> new AngelicArmorItem(ModArmorMaterials.ANGELIC, EquipmentSlot.LEGS, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Blutstein
    public static final RegistryObject<Item> BLUTSTEIN_SWORD = ITEMS.register("blutstein_sword", () -> new SwordItem(ModTiers.BLUTSTEIN_UNBREAKABLE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Copper
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModTiers.COPPER, 6.0f, -3.1f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModTiers.COPPER, -2, -1.0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModTiers.COPPER, 1.5f, -3.0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModTiers.COPPER, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Gilded Netherite
    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots", () -> new GildedNetheriteArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate", () -> new GildedNetheriteArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet", () -> new GildedNetheriteArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings", () -> new GildedNetheriteArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Mithril
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(ModTiers.MITHRIL, 5, -3.1f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(ModTiers.MITHRIL, -3, -1f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(ModTiers.MITHRIL, 0, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(ModTiers.MITHRIL, 0.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(ModTiers.MITHRIL, 2, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Non-Associated
    public static final RegistryObject<Item> ADAMANTINE_SHICKAXE = ITEMS.register("adamantine_shickaxe", () -> new ShickaxeItem(1, -2.8f, ModTiers.ADAMANTINE, new Item.Properties().stacksTo(1).durability(12_000).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_SHICKAXE = ITEMS.register("altarus_shickaxe", () -> new ShickaxeItem(1, -2.8f, ModTiers.ALTARUS, new Item.Properties().stacksTo(1).durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> BLAZING_SWORD = ITEMS.register("blazing_sword", () -> new BlazingBladeItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MASSIVENCE = ITEMS.register("massivence", () -> new MassivenceItem(ModTiers.VENCE, 0, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> PALAVENCE = ITEMS.register("palavence", () -> new PalavenceItem(ModTiers.VENCE, 0, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

package lemon_juice.scalar_utils_arsenal.item;

import lemon_juice.scalar_utils_arsenal.creativetab.ModCreativeModeTab;
import lemon_juice.scalar_utils_arsenal.ScalarUtilsArsenal;
import lemon_juice.scalar_utils_arsenal.item.custom.armor.*;
import lemon_juice.scalar_utils_arsenal.item.custom.tools.ShickaxeItem;
import lemon_juice.scalar_utils_arsenal.item.custom.weapons.BlazingBladeItem;
import lemon_juice.scalar_utils_arsenal.item.custom.weapons.MassivenceItem;
import lemon_juice.scalar_utils_arsenal.item.custom.weapons.ModTiers;
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
    public static final RegistryObject<Item> DEISCHALKOS_INGOT = ITEMS.register("deischalkos_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_INGOT = ITEMS.register("eximite_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MEUTOITE_INGOT = ITEMS.register("meutoite_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Nuggets
    public static final RegistryObject<Item> ADAMANTINE_NUGGET = ITEMS.register("adamantine_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_NUGGET = ITEMS.register("altarus_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_NUGGET = ITEMS.register("deischalkos_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_NUGGET = ITEMS.register("eximite_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MEUTOITE_NUGGET = ITEMS.register("meutoite_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Raw Ores
    public static final RegistryObject<Item> RAW_ADAMANTINE = ITEMS.register("raw_adamantine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_ALTARUS= ITEMS.register("raw_altarus", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_EXIMITE = ITEMS.register("raw_eximite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_MEUTOITE = ITEMS.register("raw_meutoite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    /* Tools & Armor */
    //Adamantine
    public static final RegistryObject<Item> ADAMANTINE_AXE = ITEMS.register("adamantine_axe", () -> new AxeItem(ModTiers.ADAMANTINE, 5.0f, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_HOE = ITEMS.register("adamantine_hoe", () -> new HoeItem(ModTiers.ADAMANTINE, -3, 0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_PICKAXE = ITEMS.register("adamantine_pickaxe", () -> new PickaxeItem(ModTiers.ADAMANTINE, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_SHICKAXE = ITEMS.register("adamantine_shickaxe", () -> new ShickaxeItem(1, -2.8f, ModTiers.ADAMANTINE, new Item.Properties().stacksTo(1).durability(25_600).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_SHOVEL = ITEMS.register("adamantine_shovel", () -> new ShovelItem(ModTiers.ADAMANTINE, 1f, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ADAMANTINE_SWORD = ITEMS.register("adamantine_sword", () -> new SwordItem(ModTiers.ADAMANTINE, 3, -1.6f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Altarus
    public static final RegistryObject<Item> ALTARUS_AXE = ITEMS.register("altarus_axe", () -> new AxeItem(ModTiers.ALTARUS, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_HOE = ITEMS.register("altarus_hoe", () -> new HoeItem(ModTiers.ALTARUS, -3, 0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_PICKAXE = ITEMS.register("altarus_pickaxe", () -> new PickaxeItem(ModTiers.ALTARUS, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_SHICKAXE = ITEMS.register("altarus_shickaxe", () -> new ShickaxeItem(1, -2.8f, ModTiers.ALTARUS, new Item.Properties().stacksTo(1).durability(236).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_SHOVEL = ITEMS.register("altarus_shovel", () -> new ShovelItem(ModTiers.ALTARUS, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ALTARUS_SWORD = ITEMS.register("altarus_sword", () -> new SwordItem(ModTiers.ALTARUS, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Blutstein
    public static final RegistryObject<Item> BLUTSTEIN_SWORD = ITEMS.register("blutstein_sword", () -> new SwordItem(ModTiers.BLUTSTEIN_UNBREAKABLE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Copper
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModTiers.COPPER, 6.0f, -3.1f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModTiers.COPPER, -2, -1.0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_SHICKAXE = ITEMS.register("copper_shickaxe", () -> new ShickaxeItem(1, -2.8f, ModTiers.COPPER, new Item.Properties().durability(524).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModTiers.COPPER, 1.5f, -3.0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModTiers.COPPER, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Deischalkos
    public static final RegistryObject<Item> DEISCHALKOS_AXE = ITEMS.register("deischalkos_axe", () -> new AxeItem(ModTiers.DEISCHALKOS, 6.0f, -3.1f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_BOOTS = ITEMS.register("deischalkos_boots", () -> new DeischalkosArmorItem(ModArmorMaterials.DEISCHALKOS, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_CHESTPLATE = ITEMS.register("deischalkos_chestplate", () -> new DeischalkosChestplateItem(ModArmorMaterials.DEISCHALKOS, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_HELMET = ITEMS.register("deischalkos_helmet", () -> new DeischalkosArmorItem(ModArmorMaterials.DEISCHALKOS, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_HOE = ITEMS.register("deischalkos_hoe", () -> new HoeItem(ModTiers.DEISCHALKOS, -2, -1.0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_LEGGINGS = ITEMS.register("deischalkos_leggings", () -> new DeischalkosArmorItem(ModArmorMaterials.DEISCHALKOS, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_PICKAXE = ITEMS.register("deischalkos_pickaxe", () -> new PickaxeItem(ModTiers.DEISCHALKOS, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_SHICKAXE = ITEMS.register("deischalkos_shickaxe", () -> new ShickaxeItem(1, -2.8f, ModTiers.DEISCHALKOS, new Item.Properties().durability(7200).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_SHOVEL = ITEMS.register("deischalkos_shovel", () -> new ShovelItem(ModTiers.DEISCHALKOS, 1.5f, -3.0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> DEISCHALKOS_SWORD = ITEMS.register("deischalkos_sword", () -> new SwordItem(ModTiers.DEISCHALKOS, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Ethereal Armor
    public static final RegistryObject<Item> ETHEREAL_BOOTS = ITEMS.register("ethereal_boots", () -> new EtherealArmorItem(ModArmorMaterials.ETHEREAL, EquipmentSlot.FEET, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ETHEREAL_CHESTPLATE = ITEMS.register("ethereal_chestplate", () -> new EtherealChestplateItem(ModArmorMaterials.ETHEREAL, EquipmentSlot.CHEST, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ETHEREAL_HELMET = ITEMS.register("ethereal_helmet", () -> new EtherealArmorItem(ModArmorMaterials.ETHEREAL, EquipmentSlot.HEAD, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> ETHEREAL_LEGGINGS = ITEMS.register("ethereal_leggings", () -> new EtherealArmorItem(ModArmorMaterials.ETHEREAL, EquipmentSlot.LEGS, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Exalted Armor
    public static final RegistryObject<Item> EXALTED_BOOTS = ITEMS.register("exalted_boots", () -> new ExaltedArmorItem(ModArmorMaterials.EXALTED, EquipmentSlot.FEET, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXALTED_CHESTPLATE = ITEMS.register("exalted_chestplate", () -> new ExaltedChestplateItem(ModArmorMaterials.EXALTED, EquipmentSlot.CHEST, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXALTED_HELMET = ITEMS.register("exalted_helmet", () -> new ExaltedArmorItem(ModArmorMaterials.EXALTED, EquipmentSlot.HEAD, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXALTED_LEGGINGS = ITEMS.register("exalted_leggings", () -> new ExaltedArmorItem(ModArmorMaterials.EXALTED, EquipmentSlot.LEGS, new Item.Properties().durability(-1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Eximite
    public static final RegistryObject<Item> EXIMITE_AXE = ITEMS.register("eximite_axe", () -> new AxeItem(ModTiers.EXIMITE, 6.0f, -3.1f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_BOOTS = ITEMS.register("eximite_boots", () -> new ArmorItem(ModArmorMaterials.EXIMITE, EquipmentSlot.FEET, new Item.Properties().durability(1000).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_CHESTPLATE = ITEMS.register("eximite_chestplate", () -> new ArmorItem(ModArmorMaterials.EXIMITE, EquipmentSlot.CHEST, new Item.Properties().durability(1000).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_HELMET = ITEMS.register("eximite_helmet", () -> new ArmorItem(ModArmorMaterials.EXIMITE, EquipmentSlot.HEAD, new Item.Properties().durability(1000).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_HOE = ITEMS.register("eximite_hoe", () -> new HoeItem(ModTiers.EXIMITE, -2, -1.0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_LEGGINGS = ITEMS.register("eximite_leggings", () -> new ArmorItem(ModArmorMaterials.EXIMITE, EquipmentSlot.LEGS, new Item.Properties().durability(1000).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_PICKAXE = ITEMS.register("eximite_pickaxe", () -> new PickaxeItem(ModTiers.EXIMITE, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_SHICKAXE = ITEMS.register("eximite_shickaxe", () -> new ShickaxeItem(1, -2.8f, ModTiers.EXIMITE, new Item.Properties().durability(4000).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_SHOVEL = ITEMS.register("eximite_shovel", () -> new ShovelItem(ModTiers.EXIMITE, 1.5f, -3.0f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> EXIMITE_SWORD = ITEMS.register("eximite_sword", () -> new SwordItem(ModTiers.EXIMITE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Gilded Netherite
    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots", () -> new GildedNetheriteArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate", () -> new GildedNetheriteArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet", () -> new GildedNetheriteArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings", () -> new GildedNetheriteArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Mithril
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(ModTiers.MITHRIL, 5, -3.1f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(ModTiers.MITHRIL, -3, -1f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(ModTiers.MITHRIL, 0, -2.8f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_SHICKAXE = ITEMS.register("mithril_shickaxe", () -> new ShickaxeItem(0, -2.8f, ModTiers.MITHRIL, new Item.Properties().durability(25_600).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(ModTiers.MITHRIL, 0.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(ModTiers.MITHRIL, 2, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Non-Associated
    public static final RegistryObject<Item> BLAZING_SWORD = ITEMS.register("blazing_sword", () -> new BlazingBladeItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> MASSIVENCE = ITEMS.register("massivence", () -> new MassivenceItem(ModTiers.VENCE, 0, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> PALAVENCE = ITEMS.register("palavence", () -> new PalavenceItem(ModTiers.VENCE, 0, -2.4f, new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Vanilla Shickaxes
    public static final RegistryObject<Item> DIAMOND_SHICKAXE = ITEMS.register("diamond_shickaxe", () -> new ShickaxeItem(0, -2.8f, Tiers.DIAMOND, new Item.Properties().durability(6244).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHICKAXE = ITEMS.register("golden_shickaxe", () -> new ShickaxeItem(0, -2.8f, Tiers.GOLD, new Item.Properties().durability(128).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> IRON_SHICKAXE = ITEMS.register("iron_shickaxe", () -> new ShickaxeItem(0, -2.8f, Tiers.IRON, new Item.Properties().durability(1000).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> NETHERITE_SHICKAXE = ITEMS.register("netherite_shickaxe", () -> new ShickaxeItem(0, -2.8f, Tiers.NETHERITE, new Item.Properties().durability(8124).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> STONE_SHICKAXE = ITEMS.register("stone_shickaxe", () -> new ShickaxeItem(0, -2.8f, Tiers.STONE, new Item.Properties().durability(524).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHICKAXE = ITEMS.register("wooden_shickaxe", () -> new ShickaxeItem(0, -2.8f, Tiers.WOOD, new Item.Properties().durability(236).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

package lemon_juice.scalar_utils_arsenal.item;

import lemon_juice.scalar_utils_arsenal.ModCreativeModeTab;
import lemon_juice.scalar_utils_arsenal.ScalarUtilsArsenal;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsArsenal.MOD_ID);

    /* Items */
    public static final RegistryObject<Item> TARTARITE_INGOT = ITEMS.register("tartarite_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> TARTARITE_NUGGET = ITEMS.register("tartarite_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

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
    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Raw Ores
    public static final RegistryObject<Item> RAW_ADAMANTINE = ITEMS.register("raw_adamantine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_ALTARUS= ITEMS.register("raw_altarus", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

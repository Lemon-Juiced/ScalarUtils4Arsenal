package lemon_juice.scalar_utils_arsenal.block;

import lemon_juice.scalar_utils_arsenal.creativetab.ModCreativeModeTab;
import lemon_juice.scalar_utils_arsenal.ScalarUtilsArsenal;
import lemon_juice.scalar_utils_arsenal.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtilsArsenal.MOD_ID);

    /* Resource Blocks */
    public static final RegistryObject<Block> ADAMANTINE_BLOCK = registerBlock("adamantine_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ALTARUS_BLOCK = registerBlock("altarus_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> BLUTSTEIN_BLOCK = registerBlock("blutstein_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> EXIMITE_BLOCK = registerBlock("eximite_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> MEUTOITE_BLOCK = registerBlock("meutoite_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> MITHRIL_BLOCK = registerBlock("mithril_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> RAW_ADAMANTINE_BLOCK = registerBlock("raw_adamantine_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> RAW_ALTARUS_BLOCK = registerBlock("raw_altarus_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> RAW_EXIMITE_BLOCK = registerBlock("raw_eximite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> RAW_MEUTOITE_BLOCK = registerBlock("raw_meutoite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.SCALAR_UTILS_TAB);

    /* End Ores */
    public static final RegistryObject<Block> EXIMITE_ORE = registerBlock("eximite_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> MEUTOITE_ORE = registerBlock("meutoite_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);

    /* Nether Ores */
    public static final RegistryObject<Block> BLUTSTEIN_ORE = registerBlock("blutstein_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);

    /* Overworld Ores */
    // Deepslate Ores
    public static final RegistryObject<Block> DEEPSLATE_ADAMANTINE_ORE = registerBlock("deepslate_adamantine_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4.5F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ALTARUS_ORE = registerBlock("deepslate_altarus_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4.5F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4.5F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    // Stone Ores
    public static final RegistryObject<Block> ADAMANTINE_ORE = registerBlock("adamantine_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ALTARUS_ORE = registerBlock("altarus_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> MITHRIL_ORE = registerBlock("mithril_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.SCALAR_UTILS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

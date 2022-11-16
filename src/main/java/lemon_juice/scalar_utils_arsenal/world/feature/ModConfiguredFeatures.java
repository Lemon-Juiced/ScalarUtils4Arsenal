package lemon_juice.scalar_utils_arsenal.world.feature;

import com.google.common.base.Suppliers;
import lemon_juice.scalar_utils_arsenal.ScalarUtilsArsenal;
import lemon_juice.scalar_utils_arsenal.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.objectweb.asm.tree.FieldInsnNode;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ScalarUtilsArsenal.MOD_ID);

    //End Ores
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_EXIMITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.EXIMITE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_MEUTOITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.MEUTOITE_ORE.get().defaultBlockState())));
    //Nether Ores
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_BLUTSTEIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.BLUTSTEIN_ORE.get().defaultBlockState())));

    //Overworld Ores
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ADAMANTINE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ADAMANTINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ALTARUS_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALTARUS_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ALTARUS_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MITHRIL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MITHRIL_ORE.get().defaultBlockState())));

    //End Ores
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_EXIMITE_ORE = CONFIGURED_FEATURES.register("end_eximite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_EXIMITE_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_MEUTOITE_ORE = CONFIGURED_FEATURES.register("end_meutoite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_MEUTOITE_ORES.get(), 9)));
    //Nether Ores
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_BLUTSTEIN_ORE = CONFIGURED_FEATURES.register("nether_blutstein_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_BLUTSTEIN_ORES.get(), 9)));
    //Overworld Ores
    public static final RegistryObject<ConfiguredFeature<?, ?>> ADAMANTINE_ORE = CONFIGURED_FEATURES.register("adamantine_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ADAMANTINE_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ALTARUS_ORE = CONFIGURED_FEATURES.register("altarus_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ALTARUS_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> MITHRIL_ORE = CONFIGURED_FEATURES.register("mithril_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MITHRIL_ORES.get(),7)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}

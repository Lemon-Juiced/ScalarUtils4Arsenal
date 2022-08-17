package lemon_juice.scalar_utils_arsenal.world.feature;

import lemon_juice.scalar_utils_arsenal.ScalarUtilsArsenal;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ScalarUtilsArsenal.MOD_ID);


    public static final RegistryObject<PlacedFeature> ADAMANTINE_ORE_PLACED = PLACED_FEATURES.register("adamantine_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ADAMANTINE_ORE.getHolder().get(),
                    commonOrePlacement(10, // Veins Per Chunk
                            HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(32)))));

    public static final RegistryObject<PlacedFeature> ALTARUS_ORE_PLACED = PLACED_FEATURES.register("altarus_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALTARUS_ORE.getHolder().get(),
                    commonOrePlacement(10, // Veins Per Chunk
                            HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(32)))));

    public static final RegistryObject<PlacedFeature> MITHRIL_ORE_PLACED = PLACED_FEATURES.register("mithril_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALTARUS_ORE.getHolder().get(),
                    commonOrePlacement(12, // Veins Per Chunk
                            HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64)))));


    public static final RegistryObject<PlacedFeature> NETHER_BLUTSTEIN_ORE_PLACED = PLACED_FEATURES.register("nether_blutstein_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_BLUTSTEIN_ORE.getHolder().get(), commonOrePlacement(7, // Veins Per Chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));


    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}

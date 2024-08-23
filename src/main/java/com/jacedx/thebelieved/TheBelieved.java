package com.jacedx.thebelieved;

import com.jacedx.thebelieved.block.TheBelievedBlocks;
import com.jacedx.thebelieved.item.TheBelievedCreativeModTabs;
import com.jacedx.thebelieved.item.TheBelievedItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;


@Mod(TheBelieved.MOD_ID)
public class TheBelieved {

    public static final String MOD_ID = "thebelieved";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TheBelieved() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        modEventBus.addListener(this::commonSetup);



        MinecraftForge.EVENT_BUS.register(this);

        TheBelievedItems.register(modEventBus);
        TheBelievedBlocks.register(modEventBus);
        TheBelievedCreativeModTabs.register(modEventBus);

        modEventBus.addListener(this::addCreative);


        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        LOGGER.info("CHEEKY MOTIVES THIS MOD HAS, BE CAREFUL.");

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(TheBelievedItems.THE_SOUL_OF_LIFE_AND_CHARM);
            event.accept(TheBelievedItems.CHARMING_SOUL_INGOT);
            event.accept(TheBelievedItems.RAW_CHARMING_SOUL);
            event.accept(TheBelievedItems.REDSTINITE_INGOT);
            event.accept(TheBelievedItems.RAW_REDSTINITE);
            event.accept(TheBelievedItems.REDSTINITE_NUGGET);
            event.accept(TheBelievedItems.REDSTINITE_UNBOUND_KEY);
            event.accept(TheBelievedItems.REDSTINITE_BOUND_KEY);
            event.accept(TheBelievedItems.REDSTINITE_UNBOUND_HEART);
            event.accept(TheBelievedItems.REDSTINITE_BOUND_HEART);
            event.accept(TheBelievedItems.GRAYSTINITE_INGOT);
            event.accept(TheBelievedItems.RAW_GRAYSTINITE);
            event.accept(TheBelievedItems.BASIC_GRAYSTINITE_COMPUTATIONAL_BOARD);
            event.accept(TheBelievedItems.REDSTINITE_REGISTERING_CIRCUIT);
            event.accept(TheBelievedItems.LIQUEFIED_REDSTINITE_BUCKET);
            event.accept(TheBelievedItems.GRAYSTINITE_COPYING_CIRCUIT);
            event.accept(TheBelievedItems.REDSTINITE_CORE_CIRCUIT);
            event.accept(TheBelievedItems.EXTREMELY_CONDUCTIVE_INGOT);
            event.accept(TheBelievedItems.RAW_CONDUCTIVE_CLUMP);
            event.accept(TheBelievedItems.EXTREMELY_CONDUCTIVE_NUGGET);
            event.accept(TheBelievedItems.GRAYSTINITE_COPYING_CIRCUIT);
            event.accept(TheBelievedItems.REDSTINITE_PLATE);

        }
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(TheBelievedItems.MINECHOKE_CHERRY);
            }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
        event.accept(TheBelievedBlocks.WILD_LOST_STONE);
        event.accept(TheBelievedBlocks.WILD_LOST_COVERED_GRASS);
        event.accept(TheBelievedBlocks.WILD_LOST_DIRT);
        event.accept(TheBelievedBlocks.REDSTINITE_CASING);
            }
        if (event.getTabKey() == TheBelievedCreativeModTabs.THE_BELIEVED_TAB.getKey()) {
            event.accept(TheBelievedBlocks.WILD_LOST_STONE);
            event.accept(TheBelievedBlocks.WILD_LOST_COVERED_GRASS);
            event.accept(TheBelievedBlocks.WILD_LOST_DIRT);
            event.accept(TheBelievedItems.THE_SOUL_OF_LIFE_AND_CHARM);
            event.accept(TheBelievedItems.CHARMING_SOUL_INGOT);
            event.accept(TheBelievedItems.RAW_CHARMING_SOUL);
            event.accept(TheBelievedItems.REDSTINITE_INGOT);
            event.accept(TheBelievedItems.RAW_REDSTINITE);
            event.accept(TheBelievedItems.REDSTINITE_NUGGET);
            event.accept(TheBelievedBlocks.REDSTINITE_CASING);
            event.accept(TheBelievedItems.REDSTINITE_UNBOUND_KEY);
            event.accept(TheBelievedItems.REDSTINITE_BOUND_KEY);
            event.accept(TheBelievedItems.REDSTINITE_UNBOUND_HEART);
            event.accept(TheBelievedItems.REDSTINITE_BOUND_HEART);
            event.accept(TheBelievedItems.REDSTINITE_PLATE);
            event.accept(TheBelievedItems.GRAYSTINITE_INGOT);
            event.accept(TheBelievedItems.RAW_GRAYSTINITE);
            event.accept(TheBelievedItems.BASIC_GRAYSTINITE_COMPUTATIONAL_BOARD);
            event.accept(TheBelievedItems.REDSTINITE_CORE_CIRCUIT);
            event.accept(TheBelievedItems.REDSTINITE_REGISTERING_CIRCUIT);
            event.accept(TheBelievedItems.GRAYSTINITE_COPYING_CIRCUIT);
            event.accept(TheBelievedItems.LIQUEFIED_REDSTINITE_BUCKET);
            event.accept(TheBelievedItems.EXTREMELY_CONDUCTIVE_INGOT);
            event.accept(TheBelievedItems.RAW_CONDUCTIVE_CLUMP);
            event.accept(TheBelievedItems.EXTREMELY_CONDUCTIVE_NUGGET);
            event.accept(TheBelievedItems.MINECHOKE_CHERRY);
            }
        }



    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("YEP, THE SERVER STARTED, CONGRATS.");
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            LOGGER.info("CLIENT STARTED, CONGRATS");
            LOGGER.info("WOAH IS THAT YOUR MINECRAFT NAME? >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
// testicles :3
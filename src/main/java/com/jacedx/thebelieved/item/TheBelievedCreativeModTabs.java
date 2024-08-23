package com.jacedx.thebelieved.item;

import com.jacedx.thebelieved.TheBelieved;
import com.jacedx.thebelieved.block.TheBelievedBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TheBelievedCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheBelieved.MOD_ID);

    public static final RegistryObject<CreativeModeTab> THE_BELIEVED_TAB = CREATIVE_MODE_TABS.register("the_believed_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TheBelievedBlocks.WILD_LOST_COVERED_GRASS.get()))
                    .title(Component.translatable("creativetab.thebelieved.the_believed_tab"))


                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

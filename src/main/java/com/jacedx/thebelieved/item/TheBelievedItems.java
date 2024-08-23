package com.jacedx.thebelieved.item;

import com.jacedx.thebelieved.TheBelieved;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TheBelievedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheBelieved.MOD_ID);

 // cool ahh items jit

    public static final RegistryObject<Item> THE_SOUL_OF_LIFE_AND_CHARM = ITEMS.register("the_soul_of_life_and_charm",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CHARMING_SOUL_INGOT = ITEMS.register("charming_soul_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHARMING_SOUL = ITEMS.register("raw_charming_soul",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_INGOT = ITEMS.register("redstinite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_REDSTINITE = ITEMS.register("raw_redstinite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_NUGGET = ITEMS.register("redstinite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_UNBOUND_KEY = ITEMS.register("redstinite_unbound_key",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_BOUND_KEY = ITEMS.register("redstinite_bound_key",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_UNBOUND_HEART = ITEMS.register("redstinite_unbound_heart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_BOUND_HEART = ITEMS.register("redstinite_bound_heart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_REGISTERING_CIRCUIT = ITEMS.register("redstinite_registering_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAYSTINITE_INGOT = ITEMS.register("graystinite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GRAYSTINITE = ITEMS.register("raw_graystinite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASIC_GRAYSTINITE_COMPUTATIONAL_BOARD = ITEMS.register("basic_graystinite_computational_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIQUEFIED_REDSTINITE_BUCKET = ITEMS.register("liquefied_redstinite_bucket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINECHOKE_CHERRY = ITEMS.register("minechoke_cherry",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAYSTINITE_COPYING_CIRCUIT = ITEMS.register("graystinite_copying_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_CORE_CIRCUIT = ITEMS.register("redstinite_core_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXTREMELY_CONDUCTIVE_INGOT = ITEMS.register("extremely_conductive_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CONDUCTIVE_CLUMP = ITEMS.register("raw_conductive_clump",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXTREMELY_CONDUCTIVE_NUGGET = ITEMS.register("extremely_conductive_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTINITE_PLATE = ITEMS.register("redstinite_plate",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

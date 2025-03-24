package com.greenwyverngames.startech.item;

import com.greenwyverngames.startech.StarTech;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StarTech.MODID);

    public static final DeferredItem<Item> NEVONIUM = ITEMS.register("nevonium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_NEVONIUM = ITEMS.register("raw_nevonium", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package com.greenwyverngames.startech.item;

import com.greenwyverngames.startech.StarTech;
import com.greenwyverngames.startech.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarTech.MODID);

    public static final Supplier<CreativeModeTab> TECH_TAB = CREATIVE_MODE_TAB.register("tech_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.NEVONIUM.get()))
                    .title(Component.translatable("creativetab.startech.tech_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NEVONIUM);
                        output.accept(ModItems.RAW_NEVONIUM);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> BLOCK_TAB = CREATIVE_MODE_TAB.register("block_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.NEVONIUM_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(StarTech.MODID, "tech_tab"))
                    .title(Component.translatable("creativetab.startech.block_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.NEVONIUM_BLOCK);
                        output.accept(ModBlocks.NEVONIUM_ORE);
                        output.accept(ModBlocks.NEVONIUM_DEEPSLATE_ORE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

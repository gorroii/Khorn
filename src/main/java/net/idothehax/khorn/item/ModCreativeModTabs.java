package net.idothehax.khorn.item;

import net.idothehax.khorn.Khorn;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Khorn.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("khorn_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRAUGR_BONE.get()))
                    .title(Component.translatable("creativetab.khorn_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DRAUGR_BONE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

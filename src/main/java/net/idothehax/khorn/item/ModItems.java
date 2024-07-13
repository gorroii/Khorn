package net.idothehax.khorn.item;

import net.idothehax.khorn.Khorn;
import net.idothehax.khorn.item.custom.DraugrAxe;
import net.idothehax.khorn.item.custom.DraugrBow;
import net.idothehax.khorn.item.custom.DraugrLongsword;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Khorn.MOD_ID);

    public static final RegistryObject<Item> DRAUGR_BONE = ITEMS.register("draugr_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAUGR_LONGSWORD = ITEMS.register("draugr_longsword",
            DraugrLongsword::new);

    public static final RegistryObject<Item> DRAUGR_BOW = ITEMS.register("draugr_bow",
            DraugrBow::new);

    public static final RegistryObject<Item> DRAUGR_AXE = ITEMS.register("draugr_axe",
            DraugrAxe::new);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

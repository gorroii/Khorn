package net.idothehax.khorn.events;

import net.idothehax.khorn.Khorn;
import net.idothehax.khorn.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Khorn.MOD_ID)
public class ModEventHandler {

    @SubscribeEvent
    public static void onLivingDrops(LivingDropsEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity instanceof Mob mob) {

            // Logic to determine if the mob should drop the weapon
            ItemStack weapon = getWeaponDrop(mob);
            weapon.enchant(Enchantments.UNBREAKING, 1);
            mob.spawnAtLocation(weapon);
        }
    }

    private static ItemStack getWeaponDrop(Mob mob) {
        // Define your logic for which weapon to drop
        // For demonstration purposes, this always drops a draugr_longsword
        return new ItemStack(ModItems.DRAUGR_LONGSWORD.get());
    }
}

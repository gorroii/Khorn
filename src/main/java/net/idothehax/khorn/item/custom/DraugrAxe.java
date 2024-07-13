package net.idothehax.khorn.item.custom;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class DraugrAxe extends AxeItem {
    public DraugrAxe() {
        super(Tiers.IRON, 6.0f, -3.1f, new Item.Properties().durability(250));
    }
}
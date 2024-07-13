package net.idothehax.khorn.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class DraugrLongsword extends SwordItem {
    public DraugrLongsword() {
        super(Tiers.IRON,
                7 - 1,
                -2.6f,
                new Item.Properties().durability(312).fireResistant());
    }
}
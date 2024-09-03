package com.decimation.item;

import com.decimation.ProjectDecimation;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CROWBAR = registerItem("crowbar", new Item(new Item.Settings()));
    public static final Item LOCKPICK = registerItem("lockpick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ProjectDecimation.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        ProjectDecimation.LOGGER.info("Registering mod Items for" + ProjectDecimation.MOD_ID);

    }
}

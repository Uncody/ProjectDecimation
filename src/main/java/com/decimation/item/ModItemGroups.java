package com.decimation.item;

import com.decimation.ProjectDecimation;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ProjectDecimation.MOD_ID, "items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.items"))
                    .icon(() -> new ItemStack(ModItems.CROWBAR)).entries((displayContext, entries) -> {
                            entries.add(ModItems.CROWBAR);
                            entries.add(ModItems.LOCKPICK);
                    }).build());


    public static void registerItemGroups() {
        ProjectDecimation.LOGGER.info("Registring Item Groups for" + ProjectDecimation.MOD_ID);
    }
}

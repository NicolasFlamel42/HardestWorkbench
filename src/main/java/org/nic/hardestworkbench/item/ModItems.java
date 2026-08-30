package org.nic.hardestworkbench.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.nic.hardestworkbench.HardestWorkbench;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HardestWorkbench.MOD_ID);

    public static final RegistryObject<Item> CRUDE_HAMMER = ITEMS.register("crude_hammer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUDE_CHISEL = ITEMS.register("crude_chisel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUDE_FILE = ITEMS.register("crude_file",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package org.nic.hardestworkbench.block.BlockEntities;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.nic.hardestworkbench.HardestWorkbench;
import org.nic.hardestworkbench.block.ModBlocks;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HardestWorkbench.MOD_ID);

    public static final RegistryObject<BlockEntityType<CrudeWorkbenchBlockEntity>> CRUDE_WORKBENCH_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("crude_workbench_block_entity", () ->
                    BlockEntityType.Builder.of(CrudeWorkbenchBlockEntity::new,
                            ModBlocks.CRUDE_WORKBENCH.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}

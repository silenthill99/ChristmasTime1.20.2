package fr.silenthill99.christmas_time.utils;

import fr.silenthill99.christmas_time.Main;
import fr.silenthill99.christmas_time.init.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            Main.MODID);

    public static final RegistryObject<CreativeModeTab> CHRISTMAS_SONGS = TABS.register("christmas_songs",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.WHEN_CHRISTMAS_COMES_TO_TOWN.get()))
                    .title(Component.translatable("creative_tabs.christmas_songs"))
                    .displayItems((pInput, pOutput) -> pOutput.accept(ModItems.WHEN_CHRISTMAS_COMES_TO_TOWN.get()))
                    .build());

}

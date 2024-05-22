package fr.silenthill99.christmas_time;

import fr.silenthill99.christmas_time.init.ModBlocks;
import fr.silenthill99.christmas_time.init.ModItems;
import fr.silenthill99.christmas_time.utils.ModCreativeTabs;
import fr.silenthill99.christmas_time.utils.ModSoundEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "christmas_time";

    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::addCreativeTab);
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModSoundEvents.SOUNDS.register(bus);
        ModCreativeTabs.TABS.register(bus);
    }

    public void setup(FMLCommonSetupEvent event) {

    }

    public void clientSetup(FMLClientSetupEvent event) {

    }

    public void addCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.GINGERBREAD_SUGAR);
        }
    }
}

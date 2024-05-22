package fr.silenthill99.christmas_time.init;

import fr.silenthill99.christmas_time.Main;
import fr.silenthill99.christmas_time.utils.ModSoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> WHEN_CHRISTMAS_COMES_TO_TOWN = ITEMS.register(
            "when-christmas-comes-to-town", () -> new RecordItem(0, ModSoundEvents.WHEN_CHRISTMAS_COMES_TO_TOWN,
                    new Item.Properties().stacksTo(1), 4920));
}

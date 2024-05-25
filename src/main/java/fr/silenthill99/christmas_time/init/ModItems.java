package fr.silenthill99.christmas_time.init;

import fr.silenthill99.christmas_time.Main;
import fr.silenthill99.christmas_time.utils.ModSoundEvents;
import fr.silenthill99.christmas_time.utils.ModToolTiers;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> WHEN_CHRISTMAS_COMES_TO_TOWN = ITEMS.register(
            "when-christmas-comes-to-town", () -> new RecordItem(0, ModSoundEvents.WHEN_CHRISTMAS_COMES_TO_TOWN,
                    new Item.Properties().stacksTo(1), 4920));

    public static final RegistryObject<Item> BARLEY = ITEMS.register("barley",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .alwaysEat()
                    .build()
            )));

    public static final RegistryObject<Item> BARLEY_SWORD = ITEMS.register("barley_sword",
            () -> new SwordItem(ModToolTiers.BARLEY, 3, -3, new Item.Properties()));
    public static final RegistryObject<Item> BARLEY_PICKAXE = ITEMS.register("barley_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BARLEY, 3, 3, new Item.Properties()));
}

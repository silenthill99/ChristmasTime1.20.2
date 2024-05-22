package fr.silenthill99.christmas_time.data.models_and_blockstates;

import fr.silenthill99.christmas_time.Main;
import fr.silenthill99.christmas_time.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemModelGenerator extends ItemModelProvider {

    private String path;

    public ItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        cdItem((RecordItem) ModItems.WHEN_CHRISTMAS_COMES_TO_TOWN.get());
    }
    
    private void cdItem(RecordItem item) {
        path = ForgeRegistries.ITEMS.getKey(item).getPath();
        withExistingParent(path, mcLoc("item/generated"))
                .texture("layer0", mcLoc("item/music_disc_mellohi"));
    }
}

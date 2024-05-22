package fr.silenthill99.christmas_time.data;

import fr.silenthill99.christmas_time.Main;
import fr.silenthill99.christmas_time.data.models_and_blockstates.ItemModelGenerator;
import fr.silenthill99.christmas_time.data.tags.BlockTagsGenerator;
import fr.silenthill99.christmas_time.data.tags.ItemTagsGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.*;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
public class DataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        boolean client = event.includeClient();
        boolean server = event.includeServer();

        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(client, new ItemModelGenerator(packOutput, existingFileHelper));

        BlockTagsGenerator blockTagsGenerator = generator.addProvider(server, new BlockTagsGenerator(packOutput,
                lookupProvider, existingFileHelper));
        generator.addProvider(server, new ItemTagsGenerator(packOutput, lookupProvider,
                blockTagsGenerator.contentsGetter(), existingFileHelper));
    }

}

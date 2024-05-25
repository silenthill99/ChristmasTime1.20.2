package fr.silenthill99.christmas_time.data.models_and_blockstates;

import fr.silenthill99.christmas_time.Main;
import fr.silenthill99.christmas_time.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockStateGenerator extends BlockStateProvider {

    private ResourceLocation path;

    public BlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.GINGERBREAD_SUGAR.get(),
                models().cube(ForgeRegistries.BLOCKS.getKey(ModBlocks.GINGERBREAD_SUGAR.get()).getPath(),
                        modLoc("block/pain"), modLoc("block/sucre"), modLoc("block/paindepice"),
                        modLoc("block/paindepice"), modLoc("block/paindepice"), modLoc("block/paindepice")
                ));
    }
}

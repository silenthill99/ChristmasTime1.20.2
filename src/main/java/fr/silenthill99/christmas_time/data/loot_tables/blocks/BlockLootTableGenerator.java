package fr.silenthill99.christmas_time.data.loot_tables.blocks;

import fr.silenthill99.christmas_time.init.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class BlockLootTableGenerator extends BlockLootSubProvider {
    public BlockLootTableGenerator() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.GINGERBREAD_SUGAR.get());
        dropSelf(ModBlocks.TEST.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries()
                .stream().map(RegistryObject::get)::iterator;
    }
}

package fr.silenthill99.christmas_time.data.loot_tables;

import fr.silenthill99.christmas_time.data.loot_tables.blocks.BlockLootTableGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class LootTableGenerator extends LootTableProvider {
    public LootTableGenerator(PackOutput pOutput) {
        super(pOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(BlockLootTableGenerator::new,
                LootContextParamSets.BLOCK)));
    }
}

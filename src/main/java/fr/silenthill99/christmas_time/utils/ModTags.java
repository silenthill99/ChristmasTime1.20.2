package fr.silenthill99.christmas_time.utils;

import fr.silenthill99.christmas_time.Main;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class ModBlockTags {

        public static final TagKey<Block> NEEDS_BARLEY_TOOLS = createTag("needs_barley_tools");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(new ResourceLocation(Main.MODID, name));
        }
    }
}

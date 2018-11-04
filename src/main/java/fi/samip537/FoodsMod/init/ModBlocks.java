package fi.samip537.FoodsMod.init;

import fi.samip537.FoodsMod.blocks.CheeseBlock;
import fi.samip537.FoodsMod.blocks.SaltBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // Blocks
    public static final Block CHEESE_BLOCK = new CheeseBlock("cheese_block", Material.CAKE);
    public static final Block SALT_BLOCK = new SaltBlock("salt_block", Material.AIR);
}

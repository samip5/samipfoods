package fi.samip.mod.blocks;

import java.util.Random;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.init.creativetabs.AllTabs;
import fi.samip.mod.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockSalt extends Block{

	public BlockSalt() {
		super(Material.IRON);
		setCreativeTab(AllTabs.SamipFoodsBlocks);
		setHardness(10.0f);
		setResistance(14.0f);
		setHarvestLevel("showel", 1);
	}
	
	@Override
	public String getUnlocalizedName() {
		
		return "tile." + SamipFoods.RESOURCE_PREFIX + "tile." + Names.SaltBlock;
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.Salt;
	}
	
	public int quantityDropped(Random random)
    {
        return 4;
    }
	
}

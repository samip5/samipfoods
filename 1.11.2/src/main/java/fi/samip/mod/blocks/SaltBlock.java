package fi.samip.mod.blocks;

import java.util.Random;

import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SaltBlock extends Block {

	public SaltBlock() {
		super(Material.IRON);
		setCreativeTab(SamipFoods.SamipFoodsTab);
		setHardness(3.0f);
		setResistance(5.0f);
		setHarvestLevel("shovel", 1);
	}
	
	@Override
	public String getUnlocalizedName() {
		
		return SamipFoods.RESOURCE_PREFIX + "tile." + Names.SaltBlock;
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.Salt;
	}
	
	public int quantityDropped(Random random)
    {
        return 4;
    }
	
}

package fi.samip.mod.blocks;

import java.util.Random;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.items.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SaltBlock extends Block implements ItemModelProvider{

	public SaltBlock() {
		super(Material.IRON);
		setUnlocalizedName(Reference.Blocks.Salt.getUnlocalizedName());
		setRegistryName(Reference.Blocks.Salt.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
		setHardness(10.0f);
		setResistance(14.0f);
		setHarvestLevel("showel", 1);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.Salt;
	}
	
	public int quantityDropped(Random random)
    {
        return 4;
    }

	@Override
	public void registerItemModel(Item item) {
		SamipFoods.proxy.registerItemRenderer(item, 0, "SaltBlock");
	}
	
}

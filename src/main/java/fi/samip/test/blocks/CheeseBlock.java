package fi.samip.test.blocks;

import fi.samip.test.InitCreativeTabs;
import fi.samip.test.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CheeseBlock extends Block {

	public CheeseBlock() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TestBlocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.TestBlocks.CHEESE.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

}

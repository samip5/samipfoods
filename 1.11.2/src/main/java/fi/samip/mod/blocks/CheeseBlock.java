package fi.samip.mod.blocks;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CheeseBlock extends Block {

	public CheeseBlock() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.Blocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.Blocks.CHEESE.getRegistryName());
		setCreativeTab(InitCreativeTabs.TestTab);
	}

}
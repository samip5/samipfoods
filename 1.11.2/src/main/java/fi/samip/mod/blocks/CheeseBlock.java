package fi.samip.mod.blocks;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CheeseBlock extends Block {

	public CheeseBlock() {
		super(Material.CAKE);
		setCreativeTab(SamipFoods.SamipFoodsTab);
	}

	@Override
	public String getUnlocalizedName() {
		
		return "tile." + SamipFoods.RESOURCE_PREFIX + Names.CheeseBlock;
		
	}
	
}
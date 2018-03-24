package fi.samip.mod.blocks.growables;

import fi.samip.mod.Reference;
import fi.samip.mod.SamipFoods;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.lib.Names;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;

public class BlockCropStrawberry extends BlockCrops{

	public BlockCropStrawberry() {
		setSoundType(SoundType.PLANT);
	}
	
	@Override
	public String getUnlocalizedName() {
		
		return SamipFoods.RESOURCE_PREFIX + "crop." + Names.cropStrawberry;
		
	}
	
	@Override
	protected Item getSeed() {
		
		return ModItems.strawberrySeed;
	}
	
	@Override
	protected Item getCrop() {
		
		return ModItems.strawberry;
	}
}

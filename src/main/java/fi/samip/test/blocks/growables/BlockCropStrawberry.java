package fi.samip.test.blocks.growables;

import fi.samip.test.Reference;
import fi.samip.test.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;

public class BlockCropStrawberry extends BlockCrops{

	public BlockCropStrawberry() {
		setUnlocalizedName(Reference.TestBlocks.CropStrawberry.getUnlocalizedName());
		setRegistryName(Reference.TestBlocks.CropStrawberry.getRegistryName());
		setSoundType(SoundType.PLANT);
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

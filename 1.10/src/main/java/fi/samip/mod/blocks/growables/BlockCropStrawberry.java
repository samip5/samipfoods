package fi.samip.mod.blocks.growables;

import fi.samip.mod.Reference;
import fi.samip.mod.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;

public class BlockCropStrawberry extends BlockCrops{

	public BlockCropStrawberry() {
		setUnlocalizedName(Reference.Blocks.CropStrawberry.getUnlocalizedName());
		setRegistryName(Reference.Blocks.CropStrawberry.getRegistryName());
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

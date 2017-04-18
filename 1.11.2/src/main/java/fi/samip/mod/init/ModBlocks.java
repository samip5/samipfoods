package fi.samip.mod.init;

import fi.samip.mod.blocks.BlockTinOre;
import fi.samip.mod.blocks.SaltBlock;
import fi.samip.mod.blocks.growables.BlockCropStrawberry;

public class ModBlocks {

	public static BlockCropStrawberry cropStrawberry;
	public static SaltBlock saltBlock;
	public static BlockTinOre tinOre;
	
	
	public static void init() {
		cropStrawberry = new BlockCropStrawberry();
		saltBlock = new SaltBlock();
		tinOre = new BlockTinOre();
	}

}

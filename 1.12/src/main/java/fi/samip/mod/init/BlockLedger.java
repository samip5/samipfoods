package fi.samip.mod.init;

import fi.samip.mod.blocks.BlockTinOre;
import fi.samip.mod.blocks.CheeseBlock;
import fi.samip.mod.blocks.SaltBlock;
import fi.samip.mod.blocks.growables.BlockCropStrawberry;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockLedger {

	public static BlockCropStrawberry cropStrawberry;
	public static SaltBlock saltBlock;
	public static CheeseBlock cheeseBlock;
	public static BlockTinOre tinOre;
	
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		saltBlock = (SaltBlock)registerBlock(event.getRegistry(), new SaltBlock(), "cheese_block");
		CheeseBlock = 
		
	}
	
	private static Block registerBlock(IForgeRegistry<Block> registry, Block newBlock, String Name) {
	
	}
	
}
	

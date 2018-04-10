package fi.samip.mod.init;

import fi.samip.mod.blocks.BlockTinOre;
import fi.samip.mod.blocks.CheeseBlock;
import fi.samip.mod.blocks.SaltBlock;
import fi.samip.mod.blocks.growables.BlockCropStrawberry;
import fi.samip.mod.lib.Names;
import fi.samip.mod.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockLedger {

	public static BlockCropStrawberry cropStrawberry;
	public static SaltBlock saltBlock;
	public static CheeseBlock cheeseBlock;
	public static BlockTinOre tinOre;
	
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		cropStrawberry = (BlockCropStrawberry)registerBlock(event.getRegistry(), new BlockCropStrawberry(), Names.cropStrawberry);
		saltBlock = (SaltBlock)registerBlock(event.getRegistry(), new SaltBlock(), Names.SaltBlock);
		cheeseBlock = (CheeseBlock)registerBlock(event.getRegistry(), new CheeseBlock(), Names.CheeseBlock);
		tinOre = (BlockTinOre)registerBlock(event.getRegistry(), new BlockTinOre(), Names.BlockTinOre);
	}
	
	private static Block registerBlock(IForgeRegistry<Block> registry, Block newBlock, String Name) {
		newBlock.setUnlocalizedName(ModUtil.MOD_ID + "." + Name);
		newBlock.setRegistryName(ModUtil.MOD_ID, Name);
		registry.register(newBlock);
		return newBlock;
	}
	
}
	

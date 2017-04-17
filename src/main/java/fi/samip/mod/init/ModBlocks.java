package fi.samip.mod.init;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.blocks.growables.BlockCropStrawberry;
import fi.samip.mod.items.ItemModelProvider;
import fi.samip.mod.blocks.BlockBase;
import fi.samip.mod.blocks.BlockTinOre;
import fi.samip.mod.blocks.SaltBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	/*
	 * 
	 * Old code
	 * 
	 * 
    public static Block cheese;

	
	public static void init() {
		cheese = new BlockCheese();
	}

	public static void register() {
		registerBlock(cheese);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	} 
	
	*/
	
	public static BlockBase cheeseblock;
	public static BlockCropStrawberry cropStrawberry;
	public static SaltBlock saltBlock;
	public static BlockTinOre tinOre;
	
	
	public static void init() {
		cheeseblock = register(new BlockBase(Material.ROCK, "CheeseBlock").setCreativeTab(InitCreativeTabs.TestTab));
		cropStrawberry = register(new BlockCropStrawberry(), null);
		saltBlock = register(new SaltBlock());
		tinOre = register(new BlockTinOre());
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		
		GameRegistry.register(block);
		if(itemBlock == null) {
			return block;
		}else {
			GameRegistry.register(itemBlock);

			if (block instanceof ItemModelProvider) {
				((ItemModelProvider)block).registerItemModel(itemBlock);
			}
			

			return block;
		}
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

	

}

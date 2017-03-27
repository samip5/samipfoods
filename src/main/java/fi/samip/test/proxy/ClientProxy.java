package fi.samip.test.proxy;

import fi.samip.test.Reference;
import fi.samip.test.init.ModBlocks;
import fi.samip.test.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements CommonProxy{

	
	@Override
	public void init() {
		/* ModItems.registerRenders(); 
		ModBlocks.registerRenders(); */
	}
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + id, "inventory"));
	}
}

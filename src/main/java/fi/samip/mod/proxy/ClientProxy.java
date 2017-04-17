package fi.samip.mod.proxy;

import java.util.HashMap;
import java.util.Map;

import fi.samip.mod.Reference;
import fi.samip.mod.handlers.MyGuiHandler;
import fi.samip.mod.init.ModBlocks;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.util.ModUtil;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy implements CommonProxy{
	
	private static final Map<ItemStack, ModelResourceLocation> MODEL_LOCATIONS_FOR_REGISTERING = new HashMap<ItemStack, ModelResourceLocation>();

	@Override
	public void init(FMLInitializationEvent e) {
		/* ModItems.registerRenders(); 
		ModBlocks.registerRenders(); */
	}
	
	@Override
	public void preInit() {
		ModUtil.LOGGER.info("PreInitializing ClientProxy...");
		
		 for(Map.Entry<ItemStack, ModelResourceLocation> entry : MODEL_LOCATIONS_FOR_REGISTERING.entrySet()){
	            ModelLoader.setCustomModelResourceLocation(entry.getKey().getItem(), entry.getKey().getItemDamage(), entry.getValue());
	        }
		
	}
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ModUtil.MOD_ID + ":" + id, "inventory"));
	}

	@Override
	public void addRenderRegister(ItemStack stack, ResourceLocation location, String variant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		
	}

	
}

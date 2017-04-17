package fi.samip.mod.proxy;

import java.util.HashMap;
import java.util.Map;
import fi.samip.mod.util.ItemUtil;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ServerProxy implements CommonProxy {
	
	private static final Map<ItemStack, ModelResourceLocation> MODEL_LOCATIONS_FOR_REGISTERING = new HashMap<ItemStack, ModelResourceLocation>();

	@Override
	public void init(FMLInitializationEvent e) {
	}

	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
	
	@Override
	public void addRenderRegister(ItemStack stack, ResourceLocation location, String variant) {
		MODEL_LOCATIONS_FOR_REGISTERING.put(stack, new ModelResourceLocation(location, variant));
		
	}
	
	@Override
	public void preInit()  {
		
	}

	@Override
	public void postInit() {
		
	}
}

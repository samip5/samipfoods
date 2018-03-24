package fi.samip.mod.proxy;

import java.util.HashMap;
import java.util.Map;

import fi.samip.mod.Reference;
import fi.samip.mod.handlers.MyGuiHandler;
import fi.samip.mod.util.ModUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ClientProxy extends CommonProxy{

	@Override
	  public void preInit(FMLPreInitializationEvent event) {
	    super.preInit(event);
	  }
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		ModUtil.LOGGER.info("PreInitializing ClientProxy...");
		super.postInit(event);
	}
	
	@SubscribeEvent
	public static void registerItemModels(final ModelRegistryEvent event){
	
	}

}

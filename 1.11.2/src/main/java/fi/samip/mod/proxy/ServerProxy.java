package fi.samip.mod.proxy;

import fi.samip.mod.handlers.GenHandler;
import fi.samip.mod.handlers.RecipeHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ServerProxy extends CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {

	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new GenHandler(), 1);
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
	}
	
	@Override
	  public void postInit(FMLPostInitializationEvent event) {
		
	  }
	@Override
	public void serverStarting(FMLServerStartingEvent event) {
		
	}

}

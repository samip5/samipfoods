package fi.samip.mod.proxy;

import fi.samip.mod.handlers.RecipeHandler;
import fi.samip.mod.init.ModBlocks;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.util.ModUtil;
import fi.samip.mod.worldgen.GenHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		ModUtil.LOGGER.info("Starting PreInitialization Phase...");
		
		// Register blocks (not models)
		ModBlocks.init();
		// Register items (not models)
		ModItems.init();
		
		ModUtil.LOGGER.info("PreInitialization Finished.");
	}
	public void init(FMLInitializationEvent event) {
		ModUtil.LOGGER.info("Starting Initialization Phase...");
		GameRegistry.registerWorldGenerator(new GenHandler(), 1);
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
		ModUtil.LOGGER.info("Initialization Finished.");
	}
	public void postInit(FMLPostInitializationEvent event) {
		ModUtil.LOGGER.info("Starting PostInitialization Phase...");
		ModUtil.LOGGER.info("PostInitialization Finished.");
	}
	
	public void loadConfiguration() {
		//general.saltPerChunk = SamipFoods.configuration.get(Configuration.CATEGORY_GENERAL, "saltPerChunk", 4);
	}
	
}

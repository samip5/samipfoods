package fi.samip.mod.proxy;

import fi.samip.mod.handlers.ConfigHandler;
import fi.samip.mod.handlers.RecipeHandler;
import fi.samip.mod.init.ModBlocks;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.util.ModUtil;
import fi.samip.mod.worldgen.ItemGen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public static ConfigHandler config;
	
	public void preInit(FMLPreInitializationEvent event) {
		ModUtil.LOGGER.info("Starting PreInitialization Phase...");
		config = new ConfigHandler(new Configuration(event.getSuggestedConfigurationFile()));
		// Register blocks (not models)
		ModBlocks.init();
		// Register items (not models)
		ModItems.init();
		
		ModUtil.LOGGER.info("PreInitialization Finished.");
	}
	public void init(FMLInitializationEvent event) {
		ModUtil.LOGGER.info("Starting Initialization Phase...");
		GameRegistry.registerWorldGenerator(new ItemGen(), 0);
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
		ModUtil.LOGGER.info("Initialization Finished.");
	}
	public void postInit(FMLPostInitializationEvent event) {
		ModUtil.LOGGER.info("Starting PostInitialization Phase...");
		ModUtil.LOGGER.info("PostInitialization Finished.");
	}
	
}

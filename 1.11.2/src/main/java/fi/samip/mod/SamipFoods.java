package fi.samip.mod;

import fi.samip.mod.handlers.ConfigHandler;
import fi.samip.mod.handlers.RecipeHandler;
import fi.samip.mod.init.ModBlocks;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.proxy.CommonProxy;
import fi.samip.mod.util.ModUtil;
import fi.samip.mod.worldgen.ItemGen;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod (modid = ModUtil.MOD_ID, name = ModUtil.NAME, version = ModUtil.VERSION, acceptedMinecraftVersions = ModUtil.ACCEPTED_VERSIONS)
public class SamipFoods {
	
	public static ConfigHandler config;

	 /**
	   * Resource prefix is used for ModelResourceLocations and some other things. It's just the mod ID followed by a colon.
	   */
	  public static final String RESOURCE_PREFIX = ModUtil.MOD_ID.toLowerCase() + ":";
	
	
	/**
	 * Used for GUI stuff
	 */
	@Mod.Instance(ModUtil.MOD_ID)
	public static SamipFoods instance;
	
	
	/**
	 * Proxy so that we register the correct things on server and client side.
	 * Client side handles the model bakery
	 * Server side handles tile entities and world generation
	 */
	@SidedProxy(clientSide = ModUtil.CLIENT_PROXY_CLASS, serverSide = ModUtil.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	/**
	 * Called first. Should initialize everything and register everything
	 * @param event The event (you probably wont use this)
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModUtil.LOGGER.info("Starting PreInitialization Phase...");
		config = new ConfigHandler(new Configuration(event.getSuggestedConfigurationFile()));
		
		ModBlocks.init();
		ModItems.init();
		
		/*ModBlocks.register();
		 ModItems.register(); */
		
		ModUtil.LOGGER.info("PreInitialization Finished.");
	}
	
	/**
	 * Called to register recipes and events
	 * @param event The event (you probably wont use this)
	 */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModUtil.LOGGER.info("Starting Initialization Phase...");
		proxy.init(event);
		GameRegistry.registerWorldGenerator(new ItemGen(), 0);
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
		
		ModUtil.LOGGER.info("Initialization Finished.");
	}
	
	/**
	 * Called after everything. Should be used for mod integration
	 * @param event The event (you probably wont use this)
	 */
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		ModUtil.LOGGER.info("Starting PostInitialization Phase...");
		proxy.postInit();
		ModUtil.LOGGER.info("PostInitialization Finished.");
	}
}
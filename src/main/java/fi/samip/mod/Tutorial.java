package fi.samip.mod;

import fi.samip.mod.handlers.ConfigHandler;
import fi.samip.mod.handlers.RecipeHandler;
import fi.samip.mod.init.ModBlocks;
import fi.samip.mod.init.ModItems;
import fi.samip.mod.proxy.CommonProxy;
import fi.samip.mod.util.ModUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = ModUtil.MOD_ID, name = ModUtil.NAME, version = ModUtil.VERSION, acceptedMinecraftVersions = ModUtil.ACCEPTED_VERSIONS)
public class Tutorial {
	
	public static ConfigHandler config;

	@Instance(value = ModUtil.MOD_ID)
	public static Tutorial instance = new Tutorial();
	
	@SidedProxy(clientSide = ModUtil.CLIENT_PROXY_CLASS, serverSide = ModUtil.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
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
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModUtil.LOGGER.info("Starting Initialization Phase...");
		proxy.init();
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
		ModUtil.LOGGER.info("Initialization Finished.");
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		ModUtil.LOGGER.info("Starting PostInitialization Phase...");
		proxy.postInit();
		ModUtil.LOGGER.info("PostInitialization Finished.");
	}
}
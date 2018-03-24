package fi.samip.mod;

import java.io.File;
import java.util.logging.Logger;

import fi.samip.mod.proxy.CommonProxy;
import fi.samip.mod.util.ModUtil;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod (modid = ModUtil.MOD_ID, guiFactory = ModUtil.GuiFactory_CLASS, name = ModUtil.NAME, version = ModUtil.VERSION, acceptedMinecraftVersions = ModUtil.ACCEPTED_VERSIONS)
public class SamipFoods {
	
	
	
	 /**
	   * Resource prefix is used for ModelResourceLocations and some other things. It's just the mod ID followed by a colon.
	   */
	  public static final String RESOURCE_PREFIX = ModUtil.MOD_ID.toLowerCase() + ":";
	
	
	/**
	 * Used for GUI stuff
	 */
	@Mod.Instance(ModUtil.MOD_ID)
	public static SamipFoods instance;
	
	public static org.apache.logging.log4j.Logger logger;
	
	
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
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		logger = event.getModLog();
		proxy.preInit(event);
	}
	
	/**
	 * Called to register recipes and events
	 * @param event The event (you probably wont use this)
	 */
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		
	}
	
	/**
	 * Called after everything. Should be used for mod integration
	 * @param event The event (you probably wont use this)
	 */
	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		proxy.serverStarting(event);
	}
	
}
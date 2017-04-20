package fi.samip.mod;

import java.io.File;

import fi.samip.mod.proxy.CommonProxy;
import fi.samip.mod.util.ModUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = ModUtil.MOD_ID, name = ModUtil.NAME, version = ModUtil.VERSION, acceptedMinecraftVersions = ModUtil.ACCEPTED_VERSIONS)
public class SamipFoods {

	public static Configuration configuration;
	
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
		File config = event.getSuggestedConfigurationFile();
		configuration = new Configuration(config);
		proxy.preInit(event);
	}
	
	/**
	 * Called to register recipes and events
	 * @param event The event (you probably wont use this)
	 */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		
	}
	
	/**
	 * Called after everything. Should be used for mod integration
	 * @param event The event (you probably wont use this)
	 */
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
	public static final CreativeTabs SamipFoodsTab = new CreativeTabs("SamipFoodsTab") {
		
		@Override 
		public ItemStack getTabIconItem() {
		    return new ItemStack(Items.DIAMOND);
		}
		public int getItemIconDamage() {
		    return 4;
		}
	};
}
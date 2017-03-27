package fi.samip.test;

import fi.samip.test.init.ModBlocks;
import fi.samip.test.init.ModItems;
import fi.samip.test.proxy.CommonProxy;
import fi.samip.test.config.ConfigHandler;
import fi.samip.test.crafting.ItemRecipes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Tutorial {
	
	public static ConfigHandler config;

	@Instance
	public static Tutorial instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new ConfigHandler(new Configuration(event.getSuggestedConfigurationFile()));
		System.out.println(Reference.NAME + " is loading!");
		
		ModBlocks.init();
		ModItems.init();
		
		
		/*ModBlocks.register();
		 ModItems.register(); */
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		ItemRecipes.addRecipes();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}
}
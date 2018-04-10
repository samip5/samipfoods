package fi.samip.mod.proxy;

import java.io.File;

import fi.samip.mod.handlers.GenHandler;
import fi.samip.mod.handlers.RecipeHandler;
import fi.samip.mod.init.BlockLedger;
import fi.samip.mod.init.ItemLedger;
import fi.samip.mod.util.ModUtil;
import net.minecraft.item.ItemLead;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		
		ModUtil.LOGGER.info("PreInitialization Finished.");
	}
	
	public void init(FMLInitializationEvent event) {
		ModUtil.LOGGER.info("Starting Initialization Phase...");
		
		ModUtil.LOGGER.info("Initialization Finished.");
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		ModUtil.LOGGER.info("Starting PostInitialization Phase...");
		ModUtil.LOGGER.info("PostInitialization Finished.");
	}
	
	public void serverStarting(FMLServerStartingEvent event) {
	}
	
}

package fi.samip.mod.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModUtil {
	
	public static final String MOD_ID = "samipfoods";
	public static final String NAME = "Samip's Test Mod";
	public static final String VERSION = "Alpha";
	public static final String ACCEPTED_VERSIONS = "[1.12]";
	public static final Logger LOGGER = LogManager.getLogger(NAME);
	
	public static final String CLIENT_PROXY_CLASS = "fi.samip.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "fi.samip.mod.proxy.ServerProxy";
	public static final String GuiFactory_CLASS = "fi.samip.mod.handlers.gui.GuiConfigFactorySamipFoods";


}

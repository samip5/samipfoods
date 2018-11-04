package fi.samip537.FoodsMod;

import fi.samip537.FoodsMod.proxy.CommonProxy;
import fi.samip537.FoodsMod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {


    /**
     * Resource prefix is used for ModelResourceLocations and some other things. It's just the mod ID followed by a colon.
     */
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

    @Mod.Instance(Reference.MOD_ID)
    public static Main instance;

    public static org.apache.logging.log4j.Logger logger;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }

}

package fi.samip.mod.util;

import java.util.*;

import fi.samip.mod.Reference;
import fi.samip.mod.client.TestTab;
import fi.samip.mod.util.compact.IMCHandler;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ItemUtil {
	
		private static final Map<String, String> UNDERSCORELESS_TO_UNDERSCORED_NAMES = new HashMap<String, String>();
		
		private static void addUnderscoreNameToMapUnderscorelessName(ResourceLocation name){
	        String underscoreless = name.toString().replaceAll("_", "");
	        UNDERSCORELESS_TO_UNDERSCORED_NAMES.put(underscoreless, name.toString());
	    }
		
		public static void registerItem(Item item, String name, boolean addTab){
	        item.setUnlocalizedName(ModUtil.MOD_ID+"."+name);

	        item.setRegistryName(ModUtil.MOD_ID, name);
	        GameRegistry.register(item);

	        item.setCreativeTab(addTab ? TestTab.INSTANCE : null);

	        IMCHandler.doItemIMC(item);

	        addUnderscoreNameToMapUnderscorelessName(item.getRegistryName());
	    }

}

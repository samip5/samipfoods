package fi.samip.test.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLLog;

public class ConfigHandler {

	private final Configuration config;
	
	private static final String CATEGORY_FOOD = "food";
	
	
	/**
     * Defaults
     */
	 private static final double defaultSaturationSmall = 0.6000000238418579D;
	 private static final double defaultSaturationMeal = 1.2000000476837158D;
	 private static final double defaultSaturationMeatyMeal = 1.600000023841858D;
	 
	 /**
	  * Config
	  */
	 public float snacksaturation;
	 public float mealsaturation;
	 public float meatymealsaturation;
	 
	 public ConfigHandler(Configuration config) {
	        this.config = config;

	        initSettings();
	    }
	 
	 private void initSettings() {
	        config.load();

	        initCropSettings();

	        if (config.hasChanged()) {
	            config.save();
	        }
	    }

	private void initCropSettings() {
			snacksaturation = (float) config.get(CATEGORY_FOOD,"snacksaturation", defaultSaturationSmall).getDouble();
			mealsaturation = (float) config.get(CATEGORY_FOOD,"mealsaturation", defaultSaturationMeal).getDouble();
		
	}
}

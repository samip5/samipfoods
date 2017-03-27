package fi.samip.test;

import net.minecraft.client.resources.I18n;

public class Reference {
	public static final String MOD_ID = "samiptest";
	public static final String NAME = "Samip's Test Mod";
	public static final String VERSION = "Alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "fi.samip.test.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "fi.samip.test.proxy.ServerProxy";
	
	public static final String ITALIC = (char) 167 + "o";
    public static final String BRIGHT_BLUE = (char) 167 + "b";

	
	public static enum TestItems {
		CHEESE("cheese", "ItemCheese" ),
		CRACKER("cracker", "ItemCracker"),
		CHEESECRACKER("cheesecracker", "ItemCheeseCracker"),
		StrawberrySeed("strawberrySeed", "strawberrySeed"),
		Strawberry("strawberry", "strawberry"),
		LASAGNA("lasagna", "lasagna"),
		PASTA("pasta", "pasta");
		
		private String unlocalizedName;
		private String registryName;
		
		TestItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum TestBlocks {
		CHEESE("cheese", "BlockCheese"),
		CropStrawberry("cropStrawberry", "cropStrawberry");
		
		private String unlocalizedName;
		private String registryName;
		
		TestBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}

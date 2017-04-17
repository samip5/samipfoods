package fi.samip.mod;

import net.minecraft.client.resources.I18n;

public class Reference {
	
	public static enum TestItems {
		CHEESE("cheese", "Cheese" ),
		CRACKER("cracker", "Cracker"),
		CHEESECRACKER("cheesecracker", "CheeseCracker"),
		StrawberrySeed("strawberrySeed", "strawberrySeed"),
		Strawberry("strawberry", "strawberry");
		
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
	
	public static enum Foods {
		Raw_Lasagna("lasagna", "lasagna"),
		Cooked_Lasagna("Cooked_Lasagna", "Cooked_Lasagna"),
		ChocolateBar("ChocolateBar", "ChocolateBar"),
		PASTA("pasta", "pasta");
		
		private String unlocalizedName;
		private String registryName;
		
		Foods(String unlocalizedName, String registryName) {
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
	
	public static enum Ingredients {
		Flour("Flour", "Flour"),
		Salt("Salt", "Salt");
		
		private String unlocalizedName;
		private String registryName;
		
		Ingredients(String unlocalizedName, String registryName) {
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
	
	public static enum Blocks {
<<<<<<< HEAD
		CHEESE("cheese", "CheeseBlock"),
		CropStrawberry("cropStrawberry", "cropStrawberry"),
		Salt("Salt", "SaltBlock"),
		Tin_Ore("BlockTinOre", "TinBlock");
=======
		CHEESE("cheese", "BlockCheese"),
		CropStrawberry("cropStrawberry", "cropStrawberry"),
		Salt("Salt", "BlockSalt");
>>>>>>> b663f19939a9b5e61d4145cbd3f55a1bd3d06244
		
		private String unlocalizedName;
		private String registryName;
		
		Blocks(String unlocalizedName, String registryName) {
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

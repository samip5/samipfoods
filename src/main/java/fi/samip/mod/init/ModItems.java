package fi.samip.mod.init;

import fi.samip.mod.SamipFoods;
import fi.samip.mod.items.Cheese;
import fi.samip.mod.items.CheeseCracker;
import fi.samip.mod.items.Cracker;
import fi.samip.mod.items.ItemStrawberry;
import fi.samip.mod.items.ItemStrawberrySeed;
import fi.samip.mod.items.food.ChocolateBar;
import fi.samip.mod.items.food.Cooked_Lasagna;
import fi.samip.mod.items.food.Pasta;
import fi.samip.mod.items.food.Raw_Lasagna;
import fi.samip.mod.items.food.ingredients.Flour;
import fi.samip.mod.items.food.ingredients.Salt;
import fi.samip.mod.lib.Names;
import fi.samip.mod.util.ModUtil;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	/*
	* Item references for easy access.
	*/
	
	public static Cheese cheese;
	public static Cracker cracker;
	public static CheeseCracker cheesecracker;
	public static ItemStrawberrySeed strawberrySeed;
	public static ItemStrawberry strawberry;
	public static Pasta Pasta;
	public static Raw_Lasagna Raw_Lasagna;
	public static Cooked_Lasagna Cooked_Lasagna;
	public static ChocolateBar ChocolateBar;
	public static Flour Flour;
	public static Salt Salt;
	
	public static void init() {
		
		// Initialization of the items
		cheese = new Cheese();
		cracker = new Cracker();
		cheesecracker = new CheeseCracker();
		strawberrySeed = new ItemStrawberrySeed();
		strawberry = new ItemStrawberry();
		Pasta = new Pasta();
		Raw_Lasagna = new Raw_Lasagna();
		Cooked_Lasagna = new Cooked_Lasagna();
		ChocolateBar = new ChocolateBar();
		Flour = new Flour();
		Salt = new Salt();
		
		// Set registry name for the items
		cheese.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.Cheese));
		cracker.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.Cracker));
		cheesecracker.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.CheeseCracker));
		strawberrySeed.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.StrawberrySeed));
		strawberry.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.Strawberry));
		Pasta.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.Pasta));
		Raw_Lasagna.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.RawLasagna));
		Cooked_Lasagna.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.CookedLasagna));
		ChocolateBar.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.ChocolateBar));
		Flour.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.Flour));
		Salt.setRegistryName(new ResourceLocation(ModUtil.MOD_ID, Names.Salt));
		
		// Register the items, but no models
		
		
		
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		GameRegistry.register(cheesecracker);
		GameRegistry.register(strawberrySeed);
		GameRegistry.register(strawberry);
		GameRegistry.register(Pasta);
		GameRegistry.register(Raw_Lasagna);
		GameRegistry.register(Cooked_Lasagna);
		GameRegistry.register(ChocolateBar);
		GameRegistry.register(Flour);
		GameRegistry.register(Salt);
	}


	/*
	 * Registering the models for the items
	 */
	@SideOnly(Side.CLIENT)
	public static void InitTextures(ItemModelMesher mesher) {
		ModelResourceLocation cheese_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.Cheese, "inventory");
		ModelLoader.registerItemVariants(cheese, cheese_model);
		mesher.register(cheese, 0, cheese_model);
		
		ModelResourceLocation cracker_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.Cracker, "inventory");
		ModelLoader.registerItemVariants(cracker, cracker_model);
		mesher.register(cracker, 0, cracker_model);
		
		ModelResourceLocation cheesecracker_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.CheeseCracker, "inventory");
		ModelLoader.registerItemVariants(cheesecracker, cheesecracker_model);
		mesher.register(cheesecracker, 0, cheesecracker_model);
		
		ModelResourceLocation strawberry_seed_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.StrawberrySeed, "inventory");
		ModelLoader.registerItemVariants(strawberrySeed, strawberry_seed_model);
		mesher.register(strawberrySeed, 0, strawberry_seed_model);
		
		ModelResourceLocation strawberry_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.Strawberry, "inventory");
		ModelLoader.registerItemVariants(strawberry, strawberry_model);
		mesher.register(strawberry, 0, strawberry_model);
		
		ModelResourceLocation pasta_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.Pasta, "inventory");
		ModelLoader.registerItemVariants(Pasta, pasta_model);
		mesher.register(Pasta, 0, pasta_model);
		
		ModelResourceLocation RawLasagne_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.RawLasagna, "inventory");
		ModelLoader.registerItemVariants(Raw_Lasagna, RawLasagne_model);
		mesher.register(Raw_Lasagna, 0, RawLasagne_model);
		
		ModelResourceLocation CookedLasagna_model= new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.CookedLasagna, "inventory");
		ModelLoader.registerItemVariants(Cooked_Lasagna, CookedLasagna_model);
		mesher.register(Cooked_Lasagna, 0, CookedLasagna_model);
		
		ModelResourceLocation ChocolateBar_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.ChocolateBar, "inventory");
		ModelLoader.registerItemVariants(ChocolateBar, ChocolateBar_model);
		mesher.register(ChocolateBar, 0, ChocolateBar_model);
		
		ModelResourceLocation Flour_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.Flour, "inventory");
		ModelLoader.registerItemVariants(Flour, Flour_model);
		mesher.register(Flour, 0, Flour_model);
		
		ModelResourceLocation Salt_model = new ModelResourceLocation(SamipFoods.RESOURCE_PREFIX + Names.Salt, "inventory");
		ModelLoader.registerItemVariants(Salt, Salt_model);
		mesher.register(Salt, 0, Salt_model);
		
	}
}

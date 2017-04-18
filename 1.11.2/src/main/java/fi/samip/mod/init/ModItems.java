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
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	/*public static Item cheese;
	public static Item cracker;
	public static Item cheesecracker;
	
	public static void init() {
		cheese = new ItemCheese();
		cracker = new ItemCracker();
		cheesecracker = new ItemCheeseCracker();
	}

	public static void register() {
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		GameRegistry.register(cheesecracker);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(cracker);
		registerRender(cheesecracker);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	} */
	
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
		
		// Initialization of items
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


	@SideOnly(Side.CLIENT)
	public static void InitTextures(ItemModelMesher mesher) {
		ModelResourceLocation model = new ModelResourceLocation(
				SamipFoods.RESOURCE_PREFIX + Names.Cheese, "inventory");
		
		ModelLoader.registerItemVariants(cheese, model);
		
		mesher.register(cheese, 0, model);
	}
}

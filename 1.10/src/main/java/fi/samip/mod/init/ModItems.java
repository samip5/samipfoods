package fi.samip.mod.init;

import fi.samip.mod.InitCreativeTabs;
import fi.samip.mod.items.Cheese;
import fi.samip.mod.items.CheeseCracker;
import fi.samip.mod.items.Cracker;
import fi.samip.mod.items.ItemModelProvider;
import fi.samip.mod.items.ItemStrawberry;
import fi.samip.mod.items.ItemStrawberrySeed;
import fi.samip.mod.items.food.ChocolateBar;
import fi.samip.mod.items.food.Cooked_Lasagna;
import fi.samip.mod.items.food.Pasta;
import fi.samip.mod.items.food.Raw_Lasagna;
import fi.samip.mod.items.food.ingredients.Flour;
import fi.samip.mod.items.food.ingredients.Salt;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
		cheese = register(new Cheese());
		cracker = register(new Cracker());
		cheesecracker = register(new CheeseCracker());
		strawberrySeed = register(new ItemStrawberrySeed());
		strawberry = register(new ItemStrawberry());
		Pasta = register(new Pasta());
		Raw_Lasagna = register(new Raw_Lasagna());
		Cooked_Lasagna = register(new Cooked_Lasagna());
		ChocolateBar = register(new ChocolateBar());
		Flour = register(new Flour());
		Salt = register(new Salt());
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}
}

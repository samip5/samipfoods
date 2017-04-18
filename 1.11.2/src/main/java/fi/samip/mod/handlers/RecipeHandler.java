package fi.samip.mod.handlers;

import fi.samip.mod.init.ModItems;
import fi.samip.mod.util.ModUtil;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerCraftingRecipes() {
		 
		/*
		 * Shapeless recipes have no specific layout, so we just list each ingredient. If you have more than one of some
		 * ingredient, you must list it that many times.
		*/
		
		// Todo: Make an item with cheese in a bucket and right clicking it would make it place an block of cheese.
		
		
		 GameRegistry.addRecipe(new ItemStack(ModItems.cheesecracker, 8), new Object[]{
		            "RRR",
		            "RCR",
		            "RRR",
		                  'R', ModItems.cracker,
		                  'C', ModItems.cheese
		    });
		 
		 GameRegistry.addRecipe(new ItemStack(ModItems.Raw_Lasagna, 4), new Object[] {
				 "CEC",
				 "PPP",
				 "BBB",
				 	'C',ModItems.cheese,
				 	'E',Items.EGG,
				 	'P',ModItems.Pasta,
				 	'B',Items.COOKED_BEEF
		 });
		 
		 GameRegistry.addRecipe(new ItemStack(ModItems.Flour, 4), new Object[] {
				 "WWW",
				 "WWW",
				 "WWW",
				 	'W', Items.WHEAT
		 });
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Pasta), ModItems.Flour, ModItems.Salt);
		 
		 ModUtil.LOGGER.info("Registered Crafting Recipes.");
	}
	
	public static void registerFurnaceRecipes() {
		
		GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(ModItems.cheese), 0);
		GameRegistry.addSmelting(ModItems.Raw_Lasagna, new ItemStack(ModItems.Cooked_Lasagna), 0.7f);
		
		ModUtil.LOGGER.info("Registered Furnace Recipes.");
	}
}

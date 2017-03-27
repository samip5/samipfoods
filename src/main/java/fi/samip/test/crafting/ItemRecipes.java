package fi.samip.test.crafting;

import fi.samip.test.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRecipes {
	
	 public static void addRecipes() {
		 
		  /*
		   * Shapeless recipes have no specific layout, so we just list each ingredient. If you have more than one of some
		   * ingredient, you must list it that many times. In this case, it's 2 bones and 1 birch wood log.
		  */
		 
		/* GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cheesecracker), ModItems.cheese, ModItems.cracker); */
		 
		 GameRegistry.addRecipe(new ItemStack(ModItems.cheesecracker, 8), new Object[]{
		            "RRR",
		            "RCR",
		            "RRR",
		                  'R', ModItems.cracker,
		                  'C', ModItems.cheese
		    });
		 
		 
	 }
}

package fi.samip.mod.handlers;

import fi.samip.mod.init.BlockLedger;
import fi.samip.mod.init.ItemLedger;
import fi.samip.mod.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class RegistryEventHandler {

		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			BlockLedger.registerBlocks(event);
			ModUtil.LOGGER.info("Finished registering Blocks");
		}
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			ItemLedger.registerItems(event);
		}
		
		@SubscribeEvent
		public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
			
		}
}

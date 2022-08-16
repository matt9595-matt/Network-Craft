
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.netcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.netcraft.block.SwitchBlockBlock;
import net.mcreator.netcraft.NetcraftMod;

public class NetcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NetcraftMod.MODID);
	public static final RegistryObject<Block> SWITCH_BLOCK = REGISTRY.register("switch_block", () -> new SwitchBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SwitchBlockBlock.registerRenderLayer();
		}
	}
}

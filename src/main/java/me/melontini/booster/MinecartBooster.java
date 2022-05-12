package me.melontini.booster;

import me.melontini.booster.config.MinecartBoosterConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class MinecartBooster implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Minecarts are now faster!");
		AutoConfig.register(MinecartBoosterConfig.class, Toml4jConfigSerializer::new);
	}
}

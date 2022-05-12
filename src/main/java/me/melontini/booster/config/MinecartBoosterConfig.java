package me.melontini.booster.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "linkart")
public class MinecartBoosterConfig implements ConfigData{
    double minecartSpeed = 0.7;
    double furnaceMinecartSpeed = 0.7;

    public double getMinecartSpeed() {
        return minecartSpeed;
    }
    public double getFurnaceMinecartSpeed() {
        return furnaceMinecartSpeed;
    }
}

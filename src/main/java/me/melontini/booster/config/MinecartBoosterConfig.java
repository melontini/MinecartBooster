package me.melontini.booster.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "linkart")
public class MinecartBoosterConfig implements ConfigData{
    double minecartSpeed = 0.4;
    double furnaceMinecartSpeed = 0.4;
    boolean fasterFuelConsumption = true;
    int fastFuelMultiplier = 2;

    public double getMinecartSpeed() {
        return minecartSpeed;
    }
    public double getFurnaceMinecartSpeed() {
        return furnaceMinecartSpeed;
    }
    public boolean getFasterFuel() {
        return fasterFuelConsumption;
    }
    public int getFuelMultiplier() {
        return fastFuelMultiplier;
    }
}

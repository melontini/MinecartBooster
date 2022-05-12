package me.melontini.booster.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import me.melontini.booster.config.MinecartBoosterConfig;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.world.World;

@Mixin(AbstractMinecartEntity.class)
public abstract class AbstractMinecartEntityMixin extends Entity{
    private static final MinecartBoosterConfig config = AutoConfig.getConfigHolder(MinecartBoosterConfig.class).getConfig();

    protected AbstractMinecartEntityMixin(EntityType<?> entityType, World world) {
        super(entityType, world);
    }
    @Inject(at = @At("RETURN"), method = "getMaxOffRailSpeed()D", cancellable = true)
    public void getMaxOffRailSpeed(CallbackInfoReturnable<Double> cir) {
        cir.setReturnValue(config.getMinecartSpeed());
    }
    
}

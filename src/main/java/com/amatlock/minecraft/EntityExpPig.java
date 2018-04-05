package com.amatlock.minecraft;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityExpPig extends EntityPig {
    private boolean isExploded = false;

    public EntityExpPig(World world) {
        super(world);
    }

    @Override
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {

        if (this.isEntityInvulnerable(p_70097_1_))
        {
            return false;
        }
        else
        {
            if(!isExploded){
                isExploded = true;
                this.world.createExplosion(null, this.posX, this.posY, this.posZ,
                        3.0f, true);
            }
            return super.attackEntityFrom(p_70097_1_, p_70097_2_);
        }
    }
}

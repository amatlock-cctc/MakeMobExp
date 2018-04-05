package com.amatlock.minecraft;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;

public class RenderExpPig extends RenderPig {
    private static final ResourceLocation EXPLODING_PIG_TEXTURES = new ResourceLocation("textures/entity/pig/pig.png");

    public RenderExpPig(RenderManager rManager)
    {
        super(rManager);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityPig entity)
    {
        return EXPLODING_PIG_TEXTURES;
    }
}

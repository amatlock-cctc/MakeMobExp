package com.amatlock.minecraft;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = MakeMobExp.MODID, version = MakeMobExp.VERSION)
public class MakeMobExp
{
    public static final String MODID = "exploding";
    public static final String EXPLODING_PIG = "pig";
    public static final String VERSION = "1.0";

    @Mod.Instance(MODID)
    public static MakeMobExp instance;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        int entityID = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(MakeMobExp.MODID, EXPLODING_PIG), EntityExpPig.class, EXPLODING_PIG, entityID, MakeMobExp.instance, 80, 3, true);


    }
}

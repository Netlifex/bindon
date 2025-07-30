package com.example.bindon.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = "bindon", value = Dist.CLIENT)
public class ClientEvents {
    public static void init() {
        // Пока пусто dindon bindon
    }
}
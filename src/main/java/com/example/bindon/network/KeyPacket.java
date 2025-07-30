package com.example.bindon.network;

import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;
import org.lwjgl.glfw.GLFW;

import java.util.function.Supplier;

public class KeyPacket {
    public final int keyCode;

    public KeyPacket(int keyCode) {
        this.keyCode = keyCode;
    }

    public static void encode(KeyPacket pkt, FriendlyByteBuf buf) {
        buf.writeInt(pkt.keyCode);
    }

    public static KeyPacket decode(FriendlyByteBuf buf) {
        return new KeyPacket(buf.readInt());
    }

    public static void handle(KeyPacket pkt, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            Minecraft mc = Minecraft.getInstance();
            long window = mc.getWindow().getWindow();
            GLFW.glfwPostEmptyEvent();
            mc.keyboardHandler.keyPress(window, pkt.keyCode, 0, GLFW.GLFW_PRESS, 0);
            mc.keyboardHandler.keyPress(window, pkt.keyCode, 0, GLFW.GLFW_RELEASE, 0);
        });
        ctx.get().setPacketHandled(true);
    }
}

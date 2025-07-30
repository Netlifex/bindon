package com.example.bindon.commands;

import com.example.bindon.network.GLFWKeyHelper;
import com.example.bindon.network.KeyPacket;
import com.example.bindon.network.PacketHandler;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkDirection;
import org.lwjgl.glfw.GLFW;

import java.util.Collection;

@Mod.EventBusSubscriber
public class ServerCommands {

    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        event.getDispatcher().register(
                Commands.literal("bindon")
                        .then(Commands.argument("key", StringArgumentType.word())
                                .then(Commands.argument("targets", EntityArgument.players())
                                        .executes(context -> {
                                            String keyName = StringArgumentType.getString(context, "key");
                                            Collection<ServerPlayer> players = EntityArgument.getPlayers(context, "targets");

                                            System.out.println("Executing /bindon with key: " + keyName + " for players: " + players.size());

                                            Integer keyCode = GLFWKeyHelper.getKeyCode(keyName);
                                            if (keyCode == null) {
                                                context.getSource().sendFailure(Component.literal("Unknown key: " + keyName));
                                                return 0;
                                            }

                                            for (ServerPlayer player : players) {
                                                PacketHandler.sendToClient(new KeyPacket(keyCode), player);
                                                System.out.println("Sent KeyPacket to: " + player.getName().getString());
                                            }

                                            return 1;
                                        })

                                )
                        )
        );
    }
}

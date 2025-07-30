package com.example.bindon.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraft.ChatFormatting.*;

@Mod.EventBusSubscriber
public class BindHelpCommand {

    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        event.getDispatcher().register(
                (Commands.literal("bindhelp")
                   .requires(source -> source.hasPermission(0))
                      .executes(ctx -> {
                        CommandSourceStack source = ctx.getSource();
                         source.sendSystemMessage(Component.literal(GREEN + "supported keys:"));

                            String keys1 = "F1–F12, 0–9, A–Z";
                        String keys2 = "SPACE, ENTER, ESCAPE, TAB, BACKSPACE, INSERT, DELETE";
                      String keys3 = "UP, DOWN, LEFT, RIGHT, LSHIFT, RSHIFT, LCTRL, RCTRL, LALT, RALT";
                     String keys4 = "CAPSLOCK, SCROLLLOCK, NUMLOCK, PRINTSCREEN, PAUSE, MENU";
                    String keys5 = "KP_0–KP_9, KP_ADD, KP_SUBTRACT, KP_MULTIPLY, KP_DIVIDE, KP_ENTER, KP_DECIMAL";

                    source.sendSystemMessage(Component.literal(YELLOW + keys1));
                    source.sendSystemMessage(Component.literal(YELLOW + keys2));
                    source.sendSystemMessage(Component.literal(YELLOW + keys3));
                    source.sendSystemMessage(Component.literal(YELLOW + keys4));
                    source.sendSystemMessage(Component.literal(YELLOW + keys5));

                    source.sendSystemMessage(Component.literal(GRAY + "example: /bindon f5 @a"));
                    return 1;
                })));

    }
}

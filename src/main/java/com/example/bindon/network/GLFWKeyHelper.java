package com.example.bindon.network;

import org.lwjgl.glfw.GLFW;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GLFWKeyHelper {
    private static final Map<String, Integer> NAME_TO_KEY = new HashMap<>();

    static {
        NAME_TO_KEY.put("f1", GLFW.GLFW_KEY_F1);
        NAME_TO_KEY.put("f2", GLFW.GLFW_KEY_F2);
        NAME_TO_KEY.put("f3", GLFW.GLFW_KEY_F3);
        NAME_TO_KEY.put("f4", GLFW.GLFW_KEY_F4);
        NAME_TO_KEY.put("f5", GLFW.GLFW_KEY_F5);
        NAME_TO_KEY.put("f6", GLFW.GLFW_KEY_F6);
        NAME_TO_KEY.put("f7", GLFW.GLFW_KEY_F7);
        NAME_TO_KEY.put("f8", GLFW.GLFW_KEY_F8);
        NAME_TO_KEY.put("f9", GLFW.GLFW_KEY_F9);
        NAME_TO_KEY.put("f10", GLFW.GLFW_KEY_F10);
        NAME_TO_KEY.put("f11", GLFW.GLFW_KEY_F11);
        NAME_TO_KEY.put("f12", GLFW.GLFW_KEY_F12);

    }

    public static Integer getKeyCode(String name) {
        return NAME_TO_KEY.get(name.toLowerCase(Locale.ROOT));
    }
}

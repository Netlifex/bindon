package com.example.bindon.network;

import org.lwjgl.glfw.GLFW;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GLFWKeyHelper {
    private static final Map<String, Integer> NAME_TO_KEY = new HashMap<>();

    static {
        // Функциональные клавиши
        for (int i = 1; i <= 12; i++) {
            NAME_TO_KEY.put("f" + i, GLFW.GLFW_KEY_F1 + (i - 1));
        }

        // Цифры
        for (int i = 0; i <= 9; i++) {
            NAME_TO_KEY.put(String.valueOf(i), GLFW.GLFW_KEY_0 + (i % 10));
        }

        // Буквы
        for (char c = 'a'; c <= 'z'; c++) {
            NAME_TO_KEY.put(String.valueOf(c), GLFW.GLFW_KEY_A + (c - 'a'));
        }

        // Прочие клавиши
        NAME_TO_KEY.put("space", GLFW.GLFW_KEY_SPACE);
        NAME_TO_KEY.put("enter", GLFW.GLFW_KEY_ENTER);
        NAME_TO_KEY.put("escape", GLFW.GLFW_KEY_ESCAPE);
        NAME_TO_KEY.put("tab", GLFW.GLFW_KEY_TAB);
        NAME_TO_KEY.put("backspace", GLFW.GLFW_KEY_BACKSPACE);
        NAME_TO_KEY.put("insert", GLFW.GLFW_KEY_INSERT);
        NAME_TO_KEY.put("delete", GLFW.GLFW_KEY_DELETE);
        NAME_TO_KEY.put("right", GLFW.GLFW_KEY_RIGHT);
        NAME_TO_KEY.put("left", GLFW.GLFW_KEY_LEFT);
        NAME_TO_KEY.put("down", GLFW.GLFW_KEY_DOWN);
        NAME_TO_KEY.put("up", GLFW.GLFW_KEY_UP);

        // Shift, Ctrl, Alt
        NAME_TO_KEY.put("lshift", GLFW.GLFW_KEY_LEFT_SHIFT);
        NAME_TO_KEY.put("rshift", GLFW.GLFW_KEY_RIGHT_SHIFT);
        NAME_TO_KEY.put("lctrl", GLFW.GLFW_KEY_LEFT_CONTROL);
        NAME_TO_KEY.put("rctrl", GLFW.GLFW_KEY_RIGHT_CONTROL);
        NAME_TO_KEY.put("lalt", GLFW.GLFW_KEY_LEFT_ALT);
        NAME_TO_KEY.put("ralt", GLFW.GLFW_KEY_RIGHT_ALT);

        // Другие полезные
        NAME_TO_KEY.put("capslock", GLFW.GLFW_KEY_CAPS_LOCK);
        NAME_TO_KEY.put("scrolllock", GLFW.GLFW_KEY_SCROLL_LOCK);
        NAME_TO_KEY.put("numlock", GLFW.GLFW_KEY_NUM_LOCK);
        NAME_TO_KEY.put("printscreen", GLFW.GLFW_KEY_PRINT_SCREEN);
        NAME_TO_KEY.put("pause", GLFW.GLFW_KEY_PAUSE);
        NAME_TO_KEY.put("menu", GLFW.GLFW_KEY_MENU);

        // Клавиши на цифровой клавиатуре
        NAME_TO_KEY.put("kp_0", GLFW.GLFW_KEY_KP_0);
        NAME_TO_KEY.put("kp_1", GLFW.GLFW_KEY_KP_1);
        NAME_TO_KEY.put("kp_2", GLFW.GLFW_KEY_KP_2);
        NAME_TO_KEY.put("kp_3", GLFW.GLFW_KEY_KP_3);
        NAME_TO_KEY.put("kp_4", GLFW.GLFW_KEY_KP_4);
        NAME_TO_KEY.put("kp_5", GLFW.GLFW_KEY_KP_5);
        NAME_TO_KEY.put("kp_6", GLFW.GLFW_KEY_KP_6);
        NAME_TO_KEY.put("kp_7", GLFW.GLFW_KEY_KP_7);
        NAME_TO_KEY.put("kp_8", GLFW.GLFW_KEY_KP_8);
        NAME_TO_KEY.put("kp_9", GLFW.GLFW_KEY_KP_9);
        NAME_TO_KEY.put("kp_add", GLFW.GLFW_KEY_KP_ADD);
        NAME_TO_KEY.put("kp_subtract", GLFW.GLFW_KEY_KP_SUBTRACT);
        NAME_TO_KEY.put("kp_multiply", GLFW.GLFW_KEY_KP_MULTIPLY);
        NAME_TO_KEY.put("kp_divide", GLFW.GLFW_KEY_KP_DIVIDE);
        NAME_TO_KEY.put("kp_enter", GLFW.GLFW_KEY_KP_ENTER);
        NAME_TO_KEY.put("kp_decimal", GLFW.GLFW_KEY_KP_DECIMAL);
    }

    public static Integer getKeyCode(String name) {
        return NAME_TO_KEY.get(name.toLowerCase(Locale.ROOT));
    }
}

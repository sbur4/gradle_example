package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello EPAM!");
    }

    public static String printer(String... data) {
        return Arrays.toString(data);
    }
}

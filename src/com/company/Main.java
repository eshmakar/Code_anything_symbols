package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите символ для получения его кода");
            String s = scanner.next();
            char c = s.charAt(0);
            System.out.println(s + " -> " + (c + 0));
            System.out.println();
        }
    }
}
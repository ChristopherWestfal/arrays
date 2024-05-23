package org.example;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.println("Bitte Text eingeben: ");

        String text = sr.nextLine();

        System.out.println("\n");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}

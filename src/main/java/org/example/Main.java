package org.example;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] array3 = new int[10];

        // Aufgabe 1 - 2
        int sum = 0;

        for(int i = 0; i < array1.length; i++){
            sum += array1[i];
        }

        System.out.println("Summe: " + sum + "\n\n");

        // Aufgabe 3
        int temp = array1[0];

        for(int i = 0; i < array1.length; i++){
            if(temp <= array1[i]){
                temp = array1[i];
            }
        }

        System.out.println("Größte Zahl im Array: " + temp + "\n\n");

        // Aufgabe 4 - 5
        for(int i = 0; i < array1.length; i++){
            array3[i] = array1[i] + array2[i];
        }

        for(int i = 0; i < array3.length; i++) {
            System.out.println("Summe: " + array3[i]);
        }
    }
}
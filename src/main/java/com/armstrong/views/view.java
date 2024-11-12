package com.armstrong.views;

public class view {
    public void showResult(int number, boolean isArmstrong) {
        if (isArmstrong) {
            System.out.println("El número " + number + " es un número de Armstrong.");
        } else {
            System.out.println("El número " + number + " no es un número de Armstrong.");
        }
    }

    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}

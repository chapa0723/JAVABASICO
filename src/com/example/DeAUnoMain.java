package com.example;

public class DeAUnoMain {
    public static void main(String[] args) {
        String[] frase = {"Hola mundo", "Mundo Hola", "A veces pasa"};
        mostrar (frase);
    }

    public static void mostrar (String [] arreglo) {
        for (String vector: arreglo){
            System.out.println(vector);
        }
    }

}

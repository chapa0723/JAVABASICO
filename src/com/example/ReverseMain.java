package com.example;

public class ReverseMain {
    public static void main(String[] args) {
        String frase = "Hola mundo";

        System.out.println(reverse(frase));

    }

    public static String reverse (String texto) {
        StringBuilder sb=new StringBuilder(texto); //creo un obeto de tipo StringBuilder
        sb.reverse(); //llamo a funcion reverso
        return sb.toString(); //devuelvo el String que me da como resultado la funcion
    }

}

package com.example;
import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream ("D:/pytexto.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try {
                int datos = ficheroBuffer.read();
                while (datos != -1) { //cuando el fichero se lee por completo da como resultado -1 = EoF (end of file)
                    System.out.print((char)datos);
                    datos = ficheroBuffer.read();
                }
            } catch (IOException f) {
                System.out.println("No se puede leer el fichero" + f.getMessage());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("El programa no puede encontrar el archivo" + e.getMessage());
            System.out.println("El programa no puede encontrar el archivo" + e.getLocalizedMessage());
        }

    }

}

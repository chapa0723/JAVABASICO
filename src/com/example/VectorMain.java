package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class VectorMain {
    public static void main(String[] args) {
        ArrayList vector = new ArrayList();
        //int indice = 1;
        vector.add("cero");
        vector.add("uno");
        vector.add("dos");
        vector.add("tres");
        vector.add("cuatro");

        mostrar(vector);
        vector.remove(1);
        mostrar(vector);
        vector.remove(1);
        mostrar(vector);

    }
    public static void mostrar (ArrayList vec){
        Iterator it = vec.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
    }
}
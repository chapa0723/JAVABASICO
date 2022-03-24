package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Seis {
    public static void main(String[] args) {
        ArrayList<Integer> listado = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            listado.add(i);
        }
        mostrar(listado);

        for (int i=1;i<11;i++){
            listado.removeIf(n -> (n%2 == 0));
        }
        mostrar(listado);
    }
    public static void mostrar (ArrayList<Integer> lista){
        Iterator<Integer> lis = lista.iterator();
        while(lis.hasNext())
            System.out.print(lis.next() + " ");
        System.out.println();
    }
}

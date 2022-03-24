package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Cinco {
    public static void main(String[] args) {
        ArrayList cinco = new ArrayList();
        cinco.add("Primero");
        cinco.add("Segundo");
        cinco.add("tercero");
        cinco.add("cuarto");

        LinkedList<Object> lista = new LinkedList<>();
        for (Object lista1 : cinco ){
            lista.add(lista1);
        }

        mostrarTodo(cinco, lista);
    }

    public static void mostrarTodo (ArrayList listaArray, LinkedList listaLinked){
        Iterator it = listaArray.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println(" ------  Esta lista pertenece al 'ArrayList'");

        Iterator it1 = listaLinked.iterator();
        while(it1.hasNext())
            System.out.print(it1.next() + " ");
        System.out.println(" ------  Esta lista pertenece al 'LinkedList'");
    }
}

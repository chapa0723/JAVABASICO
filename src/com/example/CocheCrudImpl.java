package com.example;

public class CocheCrudImpl implements CocheCrud{

    @Override
    public Coche crearCoche() {
        System.out.println("Coche creado");
        return null;
    }

    @Override
    public Coche save() {
        System.out.println("Coche guardado");
        return null;
    }

    @Override
    public Coche findAll() {
        System.out.println("Buscando todos los coches");
        return null;
    }

    @Override
    public Coche delete() {
        System.out.println("Coche eliminado");
        return null;
    }
}

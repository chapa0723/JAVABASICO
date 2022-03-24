package com.example;

public class Coche {
    //variables
    String marca, modelo, motor, color;


    //Contrusctores

    public Coche() {
    }

    public Coche(String marca, String modelo, String motor, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

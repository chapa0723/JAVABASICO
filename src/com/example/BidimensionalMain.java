package com.example;

public class BidimensionalMain {
    public static void main(String[] args) {

        String[][] bidi = {{"cero cero", "cero uno", "cero dos"}, {"uno cero", "uno uno", "uno dos"}};

        mostrar (bidi);
    }

    //la matriz se recorre de izquierda a derecha y de arriba a abajo
    public static void mostrar (String [][] tabla) {
        for(int i = 0; i < tabla.length; i++){          //la variable i hace refencia a las filas
            for(int j = 0; j < tabla[i].length; j++)    //la variable j hace referncia a las columnas
                System.out.print(i +" "+ j + " " + tabla[i][j] + " " + "|| ");
            System.out.println();
        }
    }
}


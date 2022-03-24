package com.example;

public class Cero {

        static void dividePorCero() {
            try {
                throw new ArithmeticException ( "division por cero" );
            } catch( ArithmeticException  e ) {
                System.out.println( "Esto no puede hacerse" );
                throw e;
            }
        }

        public static void main( String args[] ) {
            try {
                dividePorCero();
            } catch(Exception e ) {
                System.out.println( "Demo de código - " + e );
            }
        }

}

package es.itrafa.b12.prog_ev1_u2_b12_e1;
/*
    Ejercicio U2_B12_E1
    Escribe algo similar a la prueba anterior para obtener tiradas aleatorias de un dado de 6
    caras. Como nextInt(6) genera números
    de 0 a 5 súmale 1 al valor que te de este
    método para obtener números aleatorios en el rango 1-6.
    Ejemplos de ejecución
 */


import java.util.Random;

class Unidad2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int jug = rand.nextInt(6);

        System.out.print(rand.nextInt(6) + 1 + ", ");
        System.out.print(rand.nextInt(6) + 1 + ", ");
        System.out.print(rand.nextInt(6) + 1 + ", ");
        System.out.print(rand.nextInt(6) + 1 + ", ");
        System.out.print(rand.nextInt(6) + 1 + ", ");
        System.out.print(rand.nextInt(6) + 1);
    }
}
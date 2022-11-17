package es.itrafa.b6.prog_ev1_u2_b6_e3;

/*
    EJERCICIO: U2_B6_E3
    Repite el EJERCICIO: U2_B6_E1 pero ahora con Console.
    Consulta en el API
    Integer.parseInt() para resolver el ejercicio.

    class Unidad1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un número para saber si es par o no: ");
            int x = sc.nextInt();
            System.out.println(x % 2 == 0 ? x + " es par" : x + " es impar");
        }
    }
 */

import java.io.Console;

/**
 * Ejercico para probar fuera de IDE, por uso consola.
 * "número" saldrá con error por no usar mismo código.
 */
class Unidad1 {
    public static void main(String[] args) {
        Console cons = System.console();
        int x = Integer.parseInt(
                cons.readLine("Introduce un número para saber si es par o no: "));
        System.out.println((x % 2 == 0) ?
                x + " es par" : x + " es impar");
    }
}
package es.itrafa.b8.prog_ev1_u2_b8_e2;
/*
    EJERCICIO U2_B8_E2
    Ahora probamos la clase Complejo desde la consola manejándola desde un main por ejemplo de
    una clase llamada Unidad2. Para gestionar la entrada por teclado usamos Scanner. En el equipo
    que se hizo esta prueba los números con parte decimal hay que teclearlos con coma “,” decimal
    Ejemplo salida:
    Número a
        parte real: 1,1
        parte imaginaria: 3,3
    Número b
        parte real: 4,4
        parte imaginaria: 0,0

    Suma de a y b: 5.5 + 3.3i
 */

import es.itrafa.b8.prog_ev1_u2_b8_e1.Complejo;
import java.util.Scanner;

public class Init{
    public static void main(String[] args){
        double r, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Número a");
        System.out.print("\tparte real: ");
        r = sc.nextDouble();
        System.out.print("\tparte imaginaria: ");
        i = sc.nextDouble();
        Complejo complejoA = new Complejo(r, i);

        System.out.println("Número b");
        System.out.print("\tparte real: ");
        r = sc.nextDouble();
        System.out.print("\tparte imaginaria: ");
        i = sc.nextDouble();
        Complejo complejoB = new Complejo(r, i);

        System.out.println("suma de a y b: " + complejoA.sumar(complejoB));

    }
}
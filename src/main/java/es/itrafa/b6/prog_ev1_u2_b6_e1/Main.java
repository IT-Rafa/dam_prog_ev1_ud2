package es.itrafa.b6.prog_ev1_u2_b6_e1;

import java.util.Scanner;

/*
    EJERCICIO: U2_B6_E1
    En la unidad 1 hicimos un ejercicio que indicaba si un número es par o impar

    class Unidad1{
        public static void main(String[] args){
            int x=8;
            System.out.println(x%2==0?x+" es par": x + " es impar");
        }
    }
    SE PIDE: mejóralo introduciendo un número por teclado
 */
class Unidad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es par o no: ");
        int x = sc.nextInt();
        System.out.println(x % 2 == 0 ? x + " es par" : x + " es impar");
    }
}
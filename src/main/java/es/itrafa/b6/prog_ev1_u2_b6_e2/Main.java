package es.itrafa.b6.prog_ev1_u2_b6_e2;

import java.util.Scanner;

/*
    EJERCICIO: U2_B6_E2
    En la unidad 1 hicimos un ejercicio que calculaba el IMC
    class Unidad1{
        public static void main(String[] args){
            float peso=71.5f;
            float altura = 1.67f;
            float imc=peso/(altura*altura);
            System.out.println("peso: "+ peso);
            System.out.println("altura: "+ altura);
            System.out.println("IMC: "+ imc);
            System.out.println("\n\nTABLA IMC");
            System.out.println("Delgado: <18.5");
            System.out.println("Normal: entre 18.5 y 24.9");
            System.out.println("Sobrepeso: entre 25 y 29.9");
            System.out.println("Obeso: 30 o más");
        }
    }
    SE PIDE: mejóralo introduciendo los datos por teclado
 */
class Unidad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el peso (coma con ,): ");
        float peso = sc.nextFloat();
        System.out.print("Introduce el altura (coma con ,): ");
        float altura = sc.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("peso: " + peso);
        System.out.println("altura: " + altura);
        System.out.println("IMC: " + imc);
        System.out.println("\nTABLA IMC");
        System.out.println("Delgado: <18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");
    }
}
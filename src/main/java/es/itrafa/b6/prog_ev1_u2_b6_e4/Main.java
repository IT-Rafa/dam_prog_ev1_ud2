package es.itrafa.b6.prog_ev1_u2_b6_e4;

/*
    EJERCICIO: U2_B6_E4
    Repite el EJERCICIO: U2_B6_E2 pero ahora con Console.
    Consulta en el API Integer.parseInt() para resolver el ejercicio.

    class Unidad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el peso (coma con .): ");
        float peso = sc.nextFloat();
        System.out.print("Introduce el altura (coma con .): ");
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
 */

import java.io.Console;

class Unidad1 {
    public static void main(String[] args) {
        Console cons = System.console();

        float peso = Float.parseFloat(
                cons.readLine("Introduce el peso (coma con .): "));

        float altura = Float.parseFloat(
                cons.readLine("Introduce el altura (coma con .): "));

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
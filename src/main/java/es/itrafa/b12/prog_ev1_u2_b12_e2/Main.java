package es.itrafa.b12.prog_ev1_u2_b12_e2;

/*
    Ejercicio U2_B12_E2
    Modifica el ejemplo de cara cruz para que interactúe con el usuario (que elija cara o cruz
    y le informamos si acertó o no). El usuario especifica con teclado su elección “cara” o
    “cruz”.
    Ejemplos de ejecución
 */


import java.util.Scanner;
import java.util.Random;

class Unidad2 {
    public static void main(String[] args) {
        // cara == 0; cruz == 1
        Scanner sc = new Scanner(System.in);
        System.out.print("¿ Cara o Cruz ?: ");
        String eleccion = sc.nextLine();
        System.out.println(eleccion);

        int elecNum;
        if (eleccion.toLowerCase().equals("cara")) {
            elecNum = 0;
        } else if (eleccion.toLowerCase().equals("cruz")) {
            elecNum = 1;
        } else {
            elecNum = -1;
        }

        if (elecNum < 0) {
            System.out.println("Error al seleccionar. Reintente");
        } else {
            int tirada = new Random().nextInt(2);
            System.out.println((tirada == elecNum) ? "ACIERTO" : "FRACASO");
        }
    }
}
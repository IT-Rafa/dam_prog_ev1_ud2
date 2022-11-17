package es.itrafa.b11.prog_ev1_u2_b11_e2;

/*
    EJERCICIO U2_B11_E2:
    Vuelve a resolver el ejercicio anterior, pero ahora basándote en
    el método substring(),  teniendo en cuenta que el usuario siempre
    va a teclear exactamente dos decimales (y cualquier parte entera).

    Ejercicio anterior:
    class Unidad2 {
        public static void main(String[] args) {
            // Console para entrada sistema (NO IDE)
            Console con = System.console();
            System.out.print("Introduce un número con parte entera, coma y parte decimal (ej. -2,78): ");
            // Creamos scanner usando la entrada en consola asociada al sistema
            Scanner scan = new Scanner(con.readLine());
            // preparamos el limitador para separar tokens en scanner
            scan.useDelimiter(",");
            // Mostramos mensaje. Cada scan.next() muestra el token hasta llegar a ','
            System.out.println("Parte entera: " + scan.next() + " Parte decimal: " + scan.next());

            // Creamos scanner usando la entrada del sistema. Este scanner ya no tiene useDelimiter
            scan = new Scanner(System.in);

            System.out.print("Introduce un número con parte entera, coma y parte decimal (ej. -2,78): ");
            // Capturamos el token. Frase entera
            String input = scan.next();
            // Creamos nuevo scanner al string
            scan = new Scanner(input);
            // preparamos delimitador para separar tokens
            scan.useDelimiter(",");
            // Mostramos mensajes. Cada scan.next() muestra el token hasta llegar a ','
            System.out.println("Parte entera: " + scan.next() + " Parte decimal: " + scan.next());
        }
    }
 */

import java.io.Console;
import java.util.Scanner;

class Unidad2 {
    public static void main(String[] args) {
        System.out.print("Introduce un número con parte entera, coma y parte decimal (ej. -2,78): ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int i = input.indexOf(',');
        System.out.println("Parte entera: " + input.substring(0, i) + " Parte decimal: " +
                input.substring(i + 1));
    }
}
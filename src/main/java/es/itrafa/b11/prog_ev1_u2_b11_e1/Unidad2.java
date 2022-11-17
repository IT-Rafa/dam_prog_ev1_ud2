package es.itrafa.b11.prog_ev1_u2_b11_e1;
/*
    EJERCICIO U2_B11_E1:
    Recuerda que la clase Scanner usa el concepto de delimitador para separar
    los tokens entre sí. Por defecto Scanner usa el delimitador
    whitespace(blanco+tab+salto línea) pero podemos cambiar esto con el método
    useDelimiter().
    Observa en este ejemplo el uso de useDelimiter()

    import java.util.Scanner;
        public class Unidad2 {
            public static void main(String[] args){
            String s="HOLA,ADIOS,CHAO";
            Scanner sc = new Scanner(s);
            sc.useDelimiter(",");
            System.out.println(sc.next() + " "+ sc.next()+ " "+sc.next());
        }
    }
    SE PIDE: Escribir un programa que lea del teclado un string que contenga un
    número con coma decimal y obtener su parte entera y decimal usando un
    scanner (no pasando a double).

    Introduce un número con parte entera, coma y parte decimal (ej. -2,78): -5,34
    Parte entera -5 parte decimal: 34

    Hacerlo de 2 formas:
    1. Usando Console para leer de teclado y el string leído luego lo analizas con
        un objeto Scanner

    2. Usando Scanner para leer de teclado(por lo tanto, manejas dos objetos
        Scanner en el programa, uno para leer de teclado y otro para analizar el texto)
 */

import java.io.Console;
import java.util.Scanner;

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
package es.itrafa.b11.prog_ev1_u2_b11_e4;


import java.util.Scanner;

/*
    EJERCICIO U2_B11_E4:
    introducimos por teclado 3 líneas de venta. Cada línea de venta consta de:
    ● precio del artículo que tiene exactamente 5 caracteres incluyendo el punto
        decimal si se usa
    ● un espacio en blanco
    ● número de unidades del artículo que se escribe exactamente con dos caracteres,
        puede haber un cero a la izquierda
    ● un espacio en blanco
    ● una descripción del artículo

    Tras introducir las tres líneas se imprime un comprobante de cada línea y el importante
    total de la venta (ojo, a lo mejor en tu sistema tienes que teclear los double con coma)

    Resuelve el problema de dos formas
    1. leyendo cada línea y procesándola con substring. Aquí es importante tener en
        cuenta la estructura fija de cada línea de venta
    2. Obteniendo los campos directamente con los métodos next de Scanner
 */
class Unidad2 {
    public static void main(String[] args) {
        double p1, p2, p3;
        int c1, c2, c3;
        String d1, d2, d3;
        double precioTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Contenido línea:");
        System.out.println("\t- Precio (5 caracteres, incluyendo .), mas espacio");
        System.out.println("\t- Cantidad (2 caracteres, incluyendo 0), mas espacio");
        System.out.println("\t- Descripción");

        System.out.print("Introduce línea venta 1: ");
        // String line1 = sc.nextLine();

        p1 = sc.nextDouble();
        c1 = sc.nextInt();
        d1 = sc.nextLine();

        System.out.print("Introduce línea venta 2: ");
        // String line2 = sc.nextLine();
        p2 = sc.nextDouble();
        c2 = sc.nextInt();
        d2 = sc.nextLine();

        System.out.print("Introduce línea venta 3: ");
        // String line3 = sc.nextLine();
        p3 = sc.nextDouble();
        c3 = sc.nextInt();
        d3 = sc.nextLine();

        // 1. leyendo cada línea y procesándola con substring
        /*
        p1 = Double.parseDouble(line1.substring(0, 5));
        c1 = Integer.parseInt(line1.substring(6, 8));
        d1 = line1.substring(9);

        p2 = Double.parseDouble(line2.substring(0, 5));
        c2 = Integer.parseInt(line2.substring(6, 8));
        d2 = line2.substring(9);

        p3 = Double.parseDouble(line3.substring(0, 5));
        c3 = Integer.parseInt(line3.substring(6, 8));
        d3 = line3.substring(9);
*/
        // 2. Obteniendo los campos directamente con los métodos next de Scanner







        System.out.println("| ----------- | ------ | -------- | ------------ |");
        System.out.println("| Descripción | Precio | Cantidad | Precio total |");
        System.out.println("| ----------- | ------ | -------- | ------------ |");

        System.out.println("|    " + d1 + " |  " + p1 + " |        " + c1 + " |        " +
                (p1 * c1) + " | ");
        System.out.println("|    " + d2 + " |  " + p2 + " |        " + c2 + " |        " +
                (p2 * c2) + " | ");
        System.out.println("|    " + d3 + " |  " + p3 + " |        " + c3 + " |        " +
                (p3 * c3) + " | ");
        System.out.println("| ----------- | ------ | -------- | ------------ |");
        System.out.println("|                                 |       " +
                ((p1 * c1) + (p2 * c2) + (p3 * c3)) + " |");
        System.out.println("| ----------- | ------ | -------- | ------------ |");
    }
}
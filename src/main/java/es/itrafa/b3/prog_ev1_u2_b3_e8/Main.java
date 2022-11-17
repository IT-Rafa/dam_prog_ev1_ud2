package es.itrafa.b3.prog_ev1_u2_b3_e8;

/*
    Ejercicio U2_B3_E8:
    Crea la clase UtilidadesMate (en estático) para que responda al siguiente main


    lozano@infol06:~/programacion$ java Unidad2
    3x1=3
    3x2=6
    3x3=9
    3x4=12
    etc .......
    5x1=5
    5x2=10
    5x3=15
    5x4=20
    etc .......
    El cuadrado de 6 es 36
    El cuadrado de 8 es 64
    10 es múltiplo de 2
    10 NO es múltiplo de 3
    lozano@infol06:~/programacion$

 */
class UtilidadesMate {
    static void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 4; i++) {
            System.out.println(numero + "x" + i + "=" + numero * i);
        }
        System.out.println("etc .......");
    }

    static int calcularCuadrado(int numero) {
        return numero * numero;
    }

    static String aEsMultiploDeb(int a, int b) {
        String st = a + "";
        if (a % b == 0) {
            st += " es múltiplo de ";
        } else {
            st += " NO es múltiplo de ";
        }
        return st + b;
    }
}

class Unidad2 {
    public static void main(String[] args) {
        UtilidadesMate.imprimirTablaMultiplicar(3);
        UtilidadesMate.imprimirTablaMultiplicar(5);
        System.out.println("El cuadrado de 6 es " + UtilidadesMate.calcularCuadrado(6));
        System.out.println("El cuadrado de 8 es " + UtilidadesMate.calcularCuadrado(8));
        System.out.println(UtilidadesMate.aEsMultiploDeb(10, 2));
        System.out.println(UtilidadesMate.aEsMultiploDeb(10, 3));
    }
}
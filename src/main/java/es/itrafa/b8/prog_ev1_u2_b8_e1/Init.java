package es.itrafa.b8.prog_ev1_u2_b8_e1;
/*
    EJERCICIO U2_B8_E1
    Escribe la siguiente clase Complejo
   ----------------
    Complejo
    ---------------
    -double real
    -double imag
    ---------------
    -Complejo()
    -Complejo(double real, double imag)
    -void setReal(double real)
    -double getReal()
    -void setImag(double imag)
    -double getImag()
    -String toString()
    -Complejo sumar(Complejo b)

    Además, a la descripción gráfica de arriba añade las siguientes consideraciones:
    ● Los atributos son private
    ● Complejo(): Constructor que inicializa los atributos a cero.
    ● toString(): Convierte a String el número complejo, mediante la concatenación de los
    valores de sus atributos. Ejemplo,
    si 3 es la parte real y 4 la parte imaginaria. Devuelve
    como resultado la cadena de texto 3 + 4i. Otro ejemplo, si 3 es la parte real y -4 la parte
    imaginaria. Devuelve como resultado la cadena de texto 3 - 4i.
    ● sumar(Complejo b): Devuelve un nuevo número complejo resultado de sumar el número
    complejo “this” con el número complejo b. Para esto calcula la parte real del nuevo
    número sumando la parte real de this y b y calcula la imaginaria sumando la imaginaria
    de this y b. Ej. 2 +3i sumado con 2 + 1i es 4 +4i
    Y debemos conseguir SIN ESCRIBIR NINGÚN MAIN en el entorno bluej sumar dos complejos
    como en el ejemplo:
    ● complejoA 10+12i
    ● complejoB 1+1i
    ● y al sumarlos obtengo un nuevo complejo con valor 11+13i
 */
public class Init{
    public static void main(String[] args){
        Complejo complejoA = new Complejo(10, 12);
        Complejo complejoB = new Complejo(1, 1);

        System.out.println("" + complejoA + " + " + complejoB);
        System.out.println("Resultado: " + complejoA.sumar(complejoB));
    }
}
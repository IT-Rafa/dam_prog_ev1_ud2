package es.itrafa.b8.prog_ev1_u2_b8_e1;

/*
    EJERCICIO U2_B8_E1
    Enunciado en clase Init
 */
public class Complejo {
    // ATTRIBUTES
    private double real;
    private double imag;

    // GETTER SETTER
    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // CONSTRUCTOR
    /**
     * Constructor que inicializa los atributos a cero
     */
    public Complejo() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    /**
     * Constructor que inicializa los atributos con los parámetros
     */
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // METHODS

    /**
     * Convierte a String el número complejo, mediante la concatenación de los
     * valores de sus atributos.
     * Ejemplos:
     * - si 3 es la parte real y 4 la parte imaginaria. Devuelve como resultado
     * la cadena de texto 3 + 4i.
     * - Otro ejemplo, si 3 es la parte real y -4 la parte imaginaria.
     * Devuelve como resultado la cadena de texto 3 - 4i.
     *
     * @return El número complejo en formato String
     */
    public String toString() {
        String result = String.valueOf(this.real);
        if (this.imag >= 0) {
            result += " + " + this.imag;
        } else {
            result += " - " + -this.imag;
        }
        return result + 'i';
    }

    /**
     * Devuelve un nuevo número complejo resultado de sumar el número
     * complejo “this” con el número complejo b.
     * Para esto calcula la parte real del nuevo número sumando la parte
     * real de this y b y calcula la imaginaria sumando la imaginaria
     * de this y b.
     * Ejemplo:
     * 2 +3i sumado con 2 + 1i es 4 +4i
     *
     * @param b número Complejo a sumarle
     * @return numero Complejo sumado
     */
    public Complejo sumar(Complejo b) {
        double r = this.real + b.getReal();
        double i = this.imag + b.getImag();
        return new Complejo(r, i);
    }
}


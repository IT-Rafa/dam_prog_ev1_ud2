package es.itrafa.codeRunner.e4;

/*
    LA CLASE CUENTA
    Crea una clase Cuenta con los siguientes atributos privados:
    • String numeroCuenta;
    • String titular;
    • double saldo;
    Observa casos de prueba ejemplo para deducir constructores y métodos
 */
class Complejo {
    // ATTRIBUTES
    double real;
    double imag;

    // GETTER / SETTER
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

    // CONSTRUCTORS
    public Complejo() {
        this.real = 0;
        this.imag = 0;
    }

    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // METHODS
    public Complejo sumar(Complejo c) {
        return new Complejo(this.real + c.getReal(), this.imag + c.getImag());
    }

    public String toString() {
        return this.imag >= 0 ? this.real + " + " + this.imag + "i" :
                this.real + " " + this.imag + "i";
    }
}

class Unidad1 {
    public static void main(String[] args) {

        Complejo a_1 = new Complejo(1.1, 2.2);
        Complejo b_1 = new Complejo(3.3, 0.0);
        Complejo c_1 = a_1.sumar(b_1);
        System.out.println(c_1);
        // 4.4 + 2.2i

        Complejo a_2 = new Complejo(8, -9);
        System.out.println(a_2);
        // 8.0 -9.0i

        Complejo a_3 = new Complejo(8, -9);
        Complejo b_3 = new Complejo();
        Complejo c_3 = b_3.sumar(a_3);
        System.out.println(c_3);
        // 8.0 -9.0i
    }
}
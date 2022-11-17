package es.itrafa.b11.prog_ev1_u2_b11_e3;

/*
    EJERCICIO U2_B11_E3:
    Se pide mejorar el main() que pide un número complejo al usuario de forma
    que admita introducirlo en su forma binomial.
    El código que utilizamos anteriormente era más o menos:

    import java.util.Scanner;
    class Complejo{
        private double real;
        private double imag;

        Complejo(){
            this.real=0;
            this.imag=0;
            //o mejor
            //this(0,0);
        }
        Complejo(double real,double imag){
            this.real=real;
            this.imag=imag;
        }
        void setReal(double real){
            this.real=real;
        }
        double getReal(){
            return this.real;
        }
        void setImag(double imag){
            this.imag=imag;
        }
        double getImag(){
            return this.imag;
        }
        public String toString(){
            //return this.real + " + " + this.imaginaria+"i";//falla si la parte imaginaria es negativa
            return this.real +(this.imag<0?" ":" + ")+this.imag+"i";
        }
        Complejo sumar(Complejo b){
            return new Complejo(this.real+b.real,this.imag+b.imag);
        }
    }
    class Unidad2{
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            double parteReal;
            double parteImaginaria;

            //creamos número a
            System.out.println("Número a");
            System.out.print("\tparte real:");
            parteReal=sc.nextDouble();
            System.out.print("\tparte imaginaria:");
            parteImaginaria=sc.nextDouble();
            Complejo a= new Complejo(parteReal,parteImaginaria);

            //creamos número b
            System.out.println("Número b");
            System.out.print("\tparte real:");
            parteReal=sc.nextDouble();
            System.out.print("\tparte imaginaria:");
            parteImaginaria=sc.nextDouble();
            Complejo b= new Complejo(parteReal,parteImaginaria);

            //probar suma a y b
            Complejo c= a.sumar(b);
            System.out.println("\nsuma de a y b: "+ c);
        }
    }

    ahora debes utilizar la capacidad de la clase Scanner para escanear double con
    nextDouble() y conseguir algo similar a lo siguiente:

    Introduce números complejos en formato binomial, por ejemplo -3 +4i
    Observa restricciones: signos pegados a números y al menos un espacio entre real
    e imaginaria
        Número a: -3 +4i
        Numero b: 2 -2i
    suma de a y b: -1.0 + 2.0i

    Observa que con lo que sabemos imponemos al usuario un formato concreto de
    entrada ya que el programa es “delicado” por ejemplo si no dejamos espacio en
    blanco en el medio rompe.

    Introduce números complejos en formato binomial, por ejemplo -3 +4i
    Observa restricciones: signos pegados a números y al menos un espacio entre real
    e imaginaria
        Número a: -3+3i
        Exception in thread "main" java.util.InputMismatchException

    Igual que en el ejercicio 1 puedes utilizar 2 objetos Scanner o bien un objeto Console y
    otro Scanner
 */

import java.util.Scanner;

class Complejo {
    // ATTRIBUTES
    private double real;
    private double imag;

    // CONSTRUCTORS
    Complejo() {
        this(0, 0);
    }

    Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // GETTER SETTER
    void setReal(double real) {
        this.real = real;
    }

    double getReal() {
        return this.real;
    }

    void setImag(double imag) {
        this.imag = imag;
    }

    double getImag() {
        return this.imag;
    }

    // METHODS
    public String toString() {
        //return this.real + " + " + this.imaginaria+"i";//falla si la parte imaginaria es negativa
        return this.real + (this.imag < 0 ? " " : " + ") + this.imag + "i";
    }

    Complejo sumar(Complejo b) {
        return new Complejo(this.real + b.real, this.imag + b.imag);
    }
}

class Unidad2 {
    public static void main(String[] args) {
        //  -3+3i, -3 + 4i, 2 -2i, -3+3i
        Scanner sc = new Scanner(System.in);
        String n;

        System.out.print("Número a: ");
        n = sc.nextLine();
        n = n.replace('i', ' ');

        sc = new Scanner(n);
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        System.out.println("Parte real:" + p1 + "; Parte imaginaria: " + p2);
        Complejo a= new Complejo(p1,p2);

        //creamos número b
         sc = new Scanner(System.in);

        System.out.print("Número b: ");
        n = sc.nextLine();
        n = n.replace('i', ' ');

        sc = new Scanner(n);
        p1 = sc.nextDouble();
        p2 = sc.nextDouble();
        System.out.println("Parte real:" + p1 + "; Parte imaginaria: " + p2);
        Complejo b= new Complejo(p1,p2);

        //probar suma a y b
        Complejo c= a.sumar(b);
        System.out.println("\nsuma de a y b: "+ c);
    }
}
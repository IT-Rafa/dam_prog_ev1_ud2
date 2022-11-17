package es.itrafa.b5.prog_ev1_u2_b5_e7;

/*
    EJERCICIO U2_B5_E7:
    Crea una clase Cuenta con los siguientes atributos privados
    public class Cuenta {
        String numeroCuenta;
        String titular;
        double saldo;
    }

    La clase cuenta debe de ser manejada por la clase Unidad2 de la siguiente forma:

    public class Unidad2 {
        public static void main(String[] args) {
            Cuenta c1 = new Cuenta("111-222", "Epi", 50.0);
            System.out.println("el saldo inicial de Epi es: " + c1.getSaldo());
            Cuenta c2 = new Cuenta("999-888", "Blas", 100.0);
            System.out.println("Datos de la cuenta c2: " + c2);
            c1.setSaldo(250.0);
            System.out.println("el nuevo saldo de Epi es: " + c1.getSaldo());
            Cuenta c3 = new Cuenta();
            System.out.println("datos de cuenta creada sin parámetros: " + c3);
        }
    }
    SALIDA obligatoria
    el saldo inicial de Epi es: 50.0
    Datos de la cuenta c2: (999-888, Blas, 100.0)
    el nuevo saldo de Epi es: 250.0
    datos de cuenta creada sin parámetros: (sin número, sin titular, 0.0)


    Al escribir tu solución ¡utilizar this para practicar!
 */

 class Cuenta {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public String getNumeroCuenta(){
       return this.numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public Cuenta() {
        this.numeroCuenta = "sin número";
        this.titular = "sin titular";
        this.saldo = 0.0;
    }
    public Cuenta(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

     @Override
     public String toString() {
         return "(" + this.numeroCuenta + ", " + this.titular + ", " + this.saldo + ")";
     }
 }
 class Unidad2 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("111-222", "Epi", 50.0);
        System.out.println("el saldo inicial de Epi es: " + c1.getSaldo());
        Cuenta c2 = new Cuenta("999-888", "Blas", 100.0);
        System.out.println("Datos de la cuenta c2: " + c2);
        c1.setSaldo(250.0);
        System.out.println("el nuevo saldo de Epi es: " + c1.getSaldo());
        Cuenta c3 = new Cuenta();
        System.out.println("datos de cuenta creada sin parámetros: " + c3);
    }
}
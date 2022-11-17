package es.itrafa.codeRunner.e3;
/*
    LA CLASE CUENTA
    Crea una clase Cuenta con los siguientes atributos privados:
    • String numeroCuenta;
    • String titular;
    • double saldo;
    Observa casos de prueba ejemplo para deducir constructores y métodos
 */
class Cuenta{
    // ATTRIBUTES
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // GETTER / SETTER
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

    // CONSTRUCTORS
    public Cuenta(){
        this.numeroCuenta = "sin numero";
        this.titular = "sin titular";
        this.saldo = 0.0;
    }
    public Cuenta(String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // METHODS
    public String toString(){
        return "(" + this.numeroCuenta + ", " +  this.titular + ", " + this.saldo + ")";
    }
}
class Unidad1 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("111-222", "Epi", 50.0);
        System.out.println("el saldo inicial de Epi es: " +
                c1.getSaldo());
        // el saldo inicial de Epi es: 50.0

        Cuenta c2 = new Cuenta("999-888", "Blas", 100.0);
        System.out.println("Datos de la cuenta c2: " + c2);
        // Datos de la cuenta c2: (999-888, Blas, 100.0)

        Cuenta c1_1 = new Cuenta("111-222", "Epi", 50.0);
        c1_1.setSaldo(250.0);
        System.out.println("el nuevo saldo de Epi es: " +
                c1_1.getSaldo());
        // el nuevo saldo de Epi es: 250.0

        Cuenta c3 = new Cuenta();
        System.out.println("datos de cuenta creada sin parámetros: " +
                c3);
        // datos de cuenta creada sin parámetros: (sin numero, sin titular, 0.0)
    }
}
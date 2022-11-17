package es.itrafa.b10.prog_ev1_u2_b10_e5;

/*
    Ejercicio U2_B8_E5:
    Recuerda el siguiente ejemplo
    class Cuenta {
        private String numeroCuenta;
        private String titular;
        private double saldo;

        Cuenta(String numeroCuenta, String titular, double saldo) {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldo;
        }
        Cuenta() {
            this("sin numero", "sin titular", 0.0);
        }
        void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        double getSaldo() {
            return saldo;
        }
        public String toString() {
            return "("+numeroCuenta + ", " + titular + ", " + saldo+")";
        }
    }
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

    Actualiza el ejemplo anterior sustituyendo
    private double saldo;
    Por
    private BigDecimal saldo;

    lo que implica diversos cambios en el código. Como el ejemplo no hace
    operaciones con el saldo no te preocupes en este caso por escala y redondeo.
 */

import java.math.BigDecimal;

class Cuenta {
    private String numeroCuenta;
    private String titular;
    private BigDecimal saldo;

    Cuenta(String numeroCuenta, String titular, BigDecimal saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    Cuenta() {
        this("sin numero", "sin titular", new BigDecimal("0.0"));
    }

    void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    BigDecimal getSaldo() {
        return saldo;
    }

    public String toString() {
        return "(" + numeroCuenta + ", " + titular + ", " + saldo + ")";
    }
}

public class Unidad2 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("111-222", "Epi", new BigDecimal("50.0"));
        System.out.println("el saldo inicial de Epi es: " + c1.getSaldo());
        Cuenta c2 = new Cuenta("999-888", "Blas",  new BigDecimal("100.0"));
        System.out.println("Datos de la cuenta c2: " + c2);
        c1.setSaldo( new BigDecimal("250.0"));
        System.out.println("el nuevo saldo de Epi es: " + c1.getSaldo());
        Cuenta c3 = new Cuenta();
        System.out.println("datos de cuenta creada sin parámetros: " + c3);
    }
}
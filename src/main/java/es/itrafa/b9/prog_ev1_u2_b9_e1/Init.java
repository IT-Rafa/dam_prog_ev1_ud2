package es.itrafa.b9.prog_ev1_u2_b9_e1;
/*

    EJERCICIO U2_B9_E1:
    Comprueba en el api que Scanner tiene un método nextBigIntegerl(). Modifica el ejemplo
    anterior pidiendo los valores de numberA y numberB por teclado.


    import java.math.BigInteger;
    class Unidad2{
        public static void main(String[] args) {
            BigInteger numberA = new BigInteger("20");
            BigInteger numberB = BigInteger.TEN;
            System.out.println("numberA antes de add() vale: " + numberA);
            numberA.add(numberB);//esto no modifica numberA si no que devuelve un nuevo BigInteger
            System.out.println("numberA después de hacer numberA.add(numberB) NO CAMBIA. numberA=" + numberA);
            numberA=numberA.add(numberB);//numberA apunta a un nuevo objeto devuelto por add()
            System.out.println("numberA ahora referencia a un nuevo bigInteger que tiene la suma de A y B. " + numberA);
        }
    }
 */
import java.math.BigInteger;
import java.util.Scanner;

class Unidad2{
    public static void main(String[] args) {
        BigInteger numberA;
        BigInteger numberB;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numberA: ");
        numberA = sc.nextBigInteger();
        System.out.print("Introduce numberB: ");
        numberB = sc.nextBigInteger();

        System.out.println("numberA antes de add() vale: " + numberA);
        numberA.add(numberB);//esto no modifica numberA si no que devuelve un nuevo BigInteger
        System.out.println("numberA después de hacer numberA.add(numberB) NO CAMBIA. numberA=" + numberA);
        numberA=numberA.add(numberB);//numberA apunta a un nuevo objeto devuelto por add()
        System.out.println("numberA ahora referencia a un nuevo bigInteger que tiene la suma de A y B. " + numberA);
    }
}
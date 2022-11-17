package es.itrafa.b2.prog_ev1_u2_b2_e2;
/*
    Ejercicio U2_B2_E2
    Igual que sabes intercambiar el valor de variables tipo primitivo
        int x=3,y=9;
        int temp;
        temp=x;
        x=y;
        y=temp;
    Debes saber intercambiar el valor de la variables referencia.
    Se pide completar el siguiente código para generar la salida ejemplo:
    class Persona{
        String nombre;
        int edad;
    }
    class DemoPersona {
        public static void main(String[] args) {
            Persona p1= new Persona();
            Persona p2= new Persona();
            p1.nombre="Ana";
            p1.edad=3;
            p2.nombre="David";
            p2.edad=5;
            System.out.println("ANTES DE INTERCAMBIO etc.
            ETC…..
        }
    }
 */
class Persona{
    String nombre;
    int edad;
}
class DemoPersona {
    public static void main(String[] args) {
        Persona p1= new Persona();
        Persona p2= new Persona();
        p1.nombre="Ana";
        p1.edad=3;
        p2.nombre="David";
        p2.edad=5;
        System.out.println("ANTES DE INTERCAMBIO: ");
        System.out.println("\tNombre asociado a variable p1 = " + p1.nombre);
        System.out.println("\tNombre asociado a variable p2 = " + p2.nombre);
        Persona pBack = p1;
        p1 = p2;
        p2 = pBack;
        System.out.println("DESPUÉS DE INTERCAMBIO: ");
        System.out.println("\tNombre asociado a variable p1 = " + p1.nombre);
        System.out.println("\tNombre asociado a variable p2 = " + p2.nombre);
    }
}
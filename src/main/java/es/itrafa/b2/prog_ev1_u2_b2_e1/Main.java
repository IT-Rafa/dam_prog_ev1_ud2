package es.itrafa.b2.prog_ev1_u2_b2_e1;
/*
    Ejercicio U2__B2_E1
    Con la clase Persona
        Persona
           - String Nombre
           - int edad

    Crea en blueJ un proyecto DemoPersona, que contiene dos clases:
    ● la clase persona
    ● Una clase DemoPersona que contiene un main() que usa la clase Persona.

    ● DemoPersona hace lo siguiente:
        ○ crea un objeto persona con nombre “Ana” y edad 3 y asigna este objeto a
            la variable referencia p1.
        ○ Crea un objeto persona con nombre “David” y edad 5 y asigna este objeto
            a la variable referencia p2.
        ○ Imprime los nombres de los objetos Persona asociados a p1 y p2 para
            comprobar que se hizo correctamente
 */
class Persona{
    String nombre;
    int edad;
}
class DemoPersona{
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Ana";
        p1.edad = 3;

        Persona p2 = new Persona();
        p2.nombre = "David";
        p2.edad = 5;

        System.out.println("persona1=" + p1.nombre + "; persona2="+p2.nombre);
    }
}
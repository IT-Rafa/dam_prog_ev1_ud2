package es.itrafa.b1.prog_ev1_u2_b1_e3;

/*
    Ejercicio U2_B1_E3.
    Con la siguiente clase Persona
        Persona
            - String Nombre
            - int edad

    Escribe el código necesario para:
        1. Crear dos personas p1 y p2.
        2. La persona p1 tiene como nombre “yo” y edad 45 años.
        3. La persona p2 tiene como nombre “tu” y edad 37 años.
        4. Tras crear los objetos suma las edades de p1 y p2 e imprímelas por pantalla.
 */
class Persona {
    String nombre;
    int edad;
}

class Init {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.nombre = "yo";
        p1.edad = 45;

        p2.nombre = "tu";
        p2.edad = 37;

        System.out.println("Suma edades de personas: " + p1.nombre + " y " + p2.nombre +
                " = " + (p1.edad + p2.edad));
    }
}
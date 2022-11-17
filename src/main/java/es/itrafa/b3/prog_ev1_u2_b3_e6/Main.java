package es.itrafa.b3.prog_ev1_u2_b3_e6;

/*
    Ejercicio U2_B3_E6:
    Escribe un constructor para la clase Persona
    class Persona{
        String nombre;
        int edad;
        //falta constructor
    }
    class Unidad2{
        public static void main(String[] args) {
            Persona persona= new Persona("Telma",11´);
            System.out.println(persona.nombre+" tiene "+ persona.edad+" años");
        }
    }
 */
class Persona{
    String nombre;
    int edad;
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
class Unidad2{
    public static void main(String[] args) {
        Persona persona= new Persona("Telma",11);
        System.out.println(persona.nombre+" tiene "+ persona.edad+" años");
    }
}
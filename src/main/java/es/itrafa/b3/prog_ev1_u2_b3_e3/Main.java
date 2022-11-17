package es.itrafa.b3.prog_ev1_u2_b3_e3;

/*
    Ejercicio U2_B3_E3:
    Añade a la clase Persona los get/set necesarios para que funcione el main de Unidad2
    class Persona{
        private String nombre;
        private int edad;
        //añadir métodos
    }
    class Unidad2{
        public static void main(String[] args) {
            Persona persona1= new Persona();
            Persona persona2= new Persona();
            //persona1.nombre="Ana" //¡error!
            persona1.setNombre("Ana");
            persona1.setEdad(11);
            persona2.setNombre("Julio");
            persona2.setEdad(-16);
            System.out.println(persona1.getNombre()+" tiene "+ persona1.getEdad()+" años");
            System.out.println(persona2.getNombre()+" tiene "+ persona2.getEdad()+" años");
        }
    }
    Observa que el método setEdad() corrige las edades negativas.
    Si recibe un valor negativo asigna como edad 0
 */
class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0){
            this.edad = edad;
        }else{
            this.edad = 0;
        }

    }
}

class Unidad2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        //persona1.nombre="Ana" //¡error!
        persona1.setNombre("Ana");
        persona1.setEdad(11);
        persona2.setNombre("Julio");
        persona2.setEdad(-16);
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años");
        System.out.println(persona2.getNombre() + " tiene " + persona2.getEdad() + " años");
    }
}
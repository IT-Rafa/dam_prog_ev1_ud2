package es.itrafa.b4.prog_ev1_u2_b4_e2;

/*
    Ejercicio U2_B4_E2: Escribe los constructores de la clase Persona para que
    el main produzca la salida indicada
    class Persona {
        String nombre;
        int edad;
    }
    class Unidad2{
        public static void main(String args[]) {
        Persona p1= new Persona();//crea una persona con nombre "don nadie" y edad 0 años
        Persona p2= new Persona("Juan");//se crea una persona con el nombre indicado y edad 27 años
        Persona p3= new Persona("Juan",30);//se crea persona con nombre y edad indicados
        System.out.println("p1.nombre: "+ p1.nombre+" p1.edad: "+p1.edad);
        System.out.println("p2.nombre: "+ p2.nombre+" p2.edad: "+p2.edad);
        System.out.println("p3.nombre: "+ p3.nombre+" p3.edad: "+p3.edad);
        }
    }
    SALIDA
    p1.nombre: Don Nadie p1.edad: 0
    p2.nombre: Juan p2.edad: 27
    p3.nombre: Juan p3.edad: 30
 */
class Persona {
    String nombre;
    int edad;

    Persona(){
        this.nombre = "Don Nadie";
        this.edad = 0;
    }
    Persona(String nombre){
        this.nombre = nombre;
        this.edad = 27;
    }
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
class Unidad2{
    public static void main(String args[]) {
        Persona p1= new Persona();//crea una persona con nombre "don nadie" y edad 0 años
        Persona p2= new Persona("Juan");//se crea una persona con el nombre indicado y edad 27 años
        Persona p3= new Persona("Juan",30);//se crea persona con nombre y edad indicados
        System.out.println("p1.nombre: "+ p1.nombre+" p1.edad: "+p1.edad);
        System.out.println("p2.nombre: "+ p2.nombre+" p2.edad: "+p2.edad);
        System.out.println("p3.nombre: "+ p3.nombre+" p3.edad: "+p3.edad);
    }
}
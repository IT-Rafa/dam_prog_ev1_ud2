package es.itrafa.codeRunner.e2;
/*
    Escribe una clase Persona con dos atributos:
    • nombre de tipo String
    • edad de tipo int
    A menudo el enunciado es más extenso y descriptivo, en este caso,
    simplemente, los constructores y métodos necesarios debes de
    deducirlos de los casos de prueba ejemplo
 */
class Persona{
    // ATTRIBUTES
    public String nombre;
    public int edad;

    // GETTER / SETTER
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
         this.edad = edad;
    }

    // CONSTRUCTORS
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(Persona p){
        this.nombre = p.nombre;
        this.edad = p.edad;
    }

    // METHODS
    public String toString(){
        return "" + this.nombre + " "+ this.edad;
    }
}
class Unidad1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Yo", 55);
        System.out.println("p1 es " + p1.nombre + " y su edad es " + p1.edad);
        // p1 es Yo y su edad es 55

        Persona miAmigo = new Persona("kosky", 47);
        System.out.println(miAmigo.getNombre() + ", el año que viene tendrás " +
                (miAmigo.getEdad()+1));
        //kosky, el año que viene tendrás 48

        Persona miAmigo1 = new Persona("kosky", 47);
        Persona copiaDeMiAmigo = new Persona(miAmigo1);
        System.out.println(copiaDeMiAmigo.getNombre()+", "+copiaDeMiAmigo.getEdad());
        // kosky, 47

        Persona miAmigo2 = new Persona("chischas", 47);
        System.out.println(miAmigo2);
        // chischas 47
    }
}
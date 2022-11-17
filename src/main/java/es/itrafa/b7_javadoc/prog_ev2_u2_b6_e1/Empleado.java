package es.itrafa.b7_javadoc.prog_ev2_u2_b6_e1;

import java.util.Scanner;

/*
    EJERCICIO: U2_B6_E1
    En la unidad 1 hicimos un ejercicio que indicaba si un número es par o impar

    class Unidad1{
        public static void main(String[] args){
            int x=8;
            System.out.println(x%2==0?x+" es par": x + " es impar");
        }
    }
    SE PIDE: mejóralo introduciendo un número por teclado
 */
/**
 * Representa un empleado de un departamento de la empresa
 * no se permite que un empleado pertenezca a varios departamentos
 */
public class Empleado{
    /**
     * el nombre completo del Empleado. Este comentario es inútil por ser nombre private
     */
    private String nombre;
    private int sueldo;
    /**
     * el nombre del departamento en que trabaja el empleado.
     */
    public String departamento;
    /**
     * Crea un nuevo empleado a partir de su nombre.
     * @param nombre nombre completo del empleado.
     */
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve el sueldo de un empleado.
     * @return el sueldo como un valor int.
     */
    public int getSueldo(){
        return sueldo;
    }
}
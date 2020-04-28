/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.fundamentals;

import co.edu.ut.ingsistemas.epoo.people.Employee;
import co.edu.ut.ingsistemas.epoo.people.Person;

/**
 * Ejemplo de Programación en Java: fundamentos.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class Basic {

    /**
     * d - Representa una variable global a todos los objetos de esta clase.
     */
    private static int d;

    // Esto es un comentario en línea o inline.
    /*
    Esto es un comentario 
    multilínea.
     */
    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Representa variables locales primitivas.
        d = 10;
        int counter;
        float f;
        char c;
        // Representa variables locales objeto.
        String s;
        Integer io;
        Person p;
        Employee e;
        // Literales.
        counter = 1_000_000_000;// 1000000000 
        f = 12_5.0_7f;//125.07f
        s = "AAA";
        c = 'Q';
        // Operadores aritméticos.
        float operation = 2 + 2; // Suma.
        operation = 3 * 2; // Multiplicación.
        operation = (float) 2 / 5; // División.

        // Operadores de comparación.
        boolean gtet = (operation >= 0.4); // Mayor o igual que.

        // Operadores lógicos.
        boolean or = true || false; // or
        boolean and = true && false; // and
        boolean neg = !true; // negación: operador unario.

        System.out.println("operation result: " + operation);
        System.out.println("greater than or equal to: " + gtet);
        System.out.println("or operation result: " + or);
        System.out.println("and operation result: " + and);
        System.out.println("negation operation result: " + neg);

        int age = 25;
        String adulthood = (age > 18) ? "adult" : "minor";
        System.out.println("adulthood: " + adulthood);
    }

    /**
     * Declaración de un método miembro de clase de ejemplo.
     */
    public static void m1() {
    }
}

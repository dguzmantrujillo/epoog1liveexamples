/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.syntax;

/**
 * Ejemplo de programación en Java, donde se muestra la sintaxis básica de
 * variables locales, estructuras de control y utilerías (librerías).
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class JavaSyntaxExample {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Se declara e inicializa una variable local con el valor absoluto de un número decimal.
        double numberAbs = Math.abs(-1.36548798);
        System.out.println("numberAbs: " + numberAbs);

        // 2. Se declara una variable local tipo char.
        char op;
        // 3. Se asigna el caracter '2'.
        op = '2';
        // 4. Se usa la estructura de control de decisión switch
        switch (op) {
            case '1':
                System.out.println("Option one");
                ;  // more sentences // execute sentences; break;
            case '2':
                System.out.println("Option two");
                ;
            default:
                System.out.println("Unknown Option");
                ;
        }
        // 5. Se usa la estructura de control de decisión if elseif
        if (op == '1') {
            System.out.println("Option one");
        } else if (op == '2') {
            System.out.println("Option two");
        } else {
            System.out.println("Unknown Option");
        }

        // 6. Se usa la estructura de control de bucle while
        int i = 10;
        while (i >= 1) {
            System.out.println("i: " + i);
            i--;
        }

        // 7. Se usa la estructura de control de bucle while
        int j = 10;
        do {
            System.out.println("j: " + j);
            j--;
        } while (j >= 1);

        // 8. Se usa la estructura de control de bucle for
        /*for (init; condition; action) {
        }*/
        for (int k = 10; k >= 1; k--) {
            System.out.println("k: " + k);
        }
        // foreach
    }

    /**
     * Declaración de un método miembro de clase de ejemplo.
     */
    public static void m1() {
    }
}

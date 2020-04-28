/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.people.geometry;

/**
 * Lanzador del programa de ejemplo.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class RectangleMain {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea un objeto rectángulo de 10x2.
        Rectangle rectangle = new Rectangle(10, 2);

        /*
        |----------|
        |----------|
         */
        // Se obtiene el área y se asigna a una variable local.
        double area = rectangle.getArea();
        // Se obtiene el perímetro y se asigna a una variable local.
        double perimeter = rectangle.getPerimeter();

        // Se muestran área y perímetro.
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);

        // Se modifica el ancho.
        rectangle.setWidth(3);

        /*
        |----------|
        |          |
        |----------|
         */
        
        // Se muestran la nueva área y perímetro.
        System.out.println("new area: " + rectangle.getArea());
        System.out.println("new perimeter: " + rectangle.getPerimeter());
    }

}

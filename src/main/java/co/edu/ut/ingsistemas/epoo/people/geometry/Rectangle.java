/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.people.geometry;

/**
 * Representa a un rectángulo.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class Rectangle {

    /**
     * length - Largo.
     */
    private float length;

    /**
     * width - Ancho.
     */
    private float width;

    /**
     * Método constructor para inicializar un objeto Rectangle (Rectángulo).
     */
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    /**
     * Método constructor para inicializar un objeto Rectangle (Rectángulo).
     *
     * @param length Largo.
     * @param width Ancho.
     */
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Obtiene el largo de un rectángulo.
     *
     * @return Largo.
     */
    public float getLength() {
        return length;
    }

    /**
     * Establece el largo de un rectángulo.
     *
     * @param length Largo.
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * Obtiene el ancho de un rectángulo.
     *
     * @return Ancho.
     */
    public float getWidth() {
        return width;
    }

    /**
     * Establece el ancho de un rectángulo.
     *
     * @param width Ancho.
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * Obtiene el área de un rectángulo.
     *
     * @return Área.
     */
    public double getArea() {
        return this.width * this.length;
    }

    /**
     * Obtiene el perímetro de un rectángulo.
     *
     * @return Perímetro.
     */
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Rectangle[length=" + this.length + ", width=" + this.width + "]";
    }
}

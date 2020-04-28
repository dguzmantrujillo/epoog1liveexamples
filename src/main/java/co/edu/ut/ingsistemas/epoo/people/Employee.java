/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.people;

/**
 * Representa a un empleado de ejemplo.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class Employee {

    /**
     * id - Identificador.
     */
    private int id;

    /**
     * firstName - Primer nombre.
     */
    private String firstName;

    /**
     * lastName - Primer apellido.
     */
    private String lastName;

    /**
     * salary - Salario.
     */
    private int salary;

    /**
     * Método constructor para inicializar un objeto tipo Employee.
     *
     * @param id Identificador.
     * @param firstName Primer nombre.
     * @param lastName Primer apellido.
     * @param salary Salario
     */
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /**
     * Obtiene el identificador de un empleado.
     *
     * @return Identificador.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador de un empleado.
     *
     * @param id Identificador.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el primer nombre de un empleado.
     *
     * @return Primer nombre.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece el primer nombre de un empleado.
     *
     * @param firstName Primer nombre.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtiene el primer apellido de un empleado.
     *
     * @return Primer apellido.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece el primer apellido de un empleado.
     *
     * @param lastName Primer apellido.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtiene el salario de un empleado.
     *
     * @return Salario.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Establece el salario de un empleado.
     *
     * @param salary Salario.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Obtiene el salario anual de un empleado.
     *
     * @return Salario anual: salario * 12.
     */
    public int getAnnualSalary() {
        return this.salary * 12;
    }

    /**
     * Incrementa en un porcentaje el salario de un empleado.
     *
     * @param percent Porcentaje.
     * @return Salario incrementado.
     */
    public int raiseSalary(int percent) {
        this.salary = ((this.salary * percent) / 100) + this.salary;
        return this.salary; // Acá ya está modificado del salario.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", name=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ']';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.people;

/**
 * Lanzador del programa de ejemplo.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class EmployeeMain {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1. Se crea un objeto Employee (Empleado).
        Employee employee = new Employee(0, "PEPITO", "PEREZ", 3000);
        // 2. Se muestra el objeto Employee con su método toString (llamado implícitamente).
        System.out.println("employee: " + employee);
        // 3. Se muestra el salario anual.
        System.out.println("employee's annual salary: " + employee.getAnnualSalary());
        // 4. Se incrementa el salario.
        employee.raiseSalary(10);
        // 5. Se muestra el objeto Employee después de haberse incrementado su salario.
        System.out.println("employee after raising salary: " + employee);
    }
}

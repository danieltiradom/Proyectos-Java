/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Daniel
 */
public class Estudiante extends Persona {
    private double promedio;
    
    public Estudiante(String nombre,String apellido, int edad, double promedio){
        super(nombre,apellido, edad);
        this.promedio=promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Promedio: " + promedio;
    }
}

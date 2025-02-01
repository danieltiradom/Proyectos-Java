/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Controlador {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
    }
    
    public Estudiante buscarEstudiante(String nombre){
        for (Estudiante e : estudiantes){
            if(e.getNombre().equalsIgnoreCase(nombre)){
                return e;
            }
        }
        return null;
    }
    
    public ArrayList<Estudiante>obtenerTodos(){
        return estudiantes;
    }
}

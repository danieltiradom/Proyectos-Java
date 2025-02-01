package Paquete;

import javax.swing.JOptionPane;

public class Alumnos1 {
    public String Nombre;
    public String Carrera;
    public double Cali1;
    public double Cali2;
    public double Cali3;

    /*public Alumnos1(String Nombre, String Carrera, double Cali1, double Cali2, double Cali3) {
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.Cali1 = Cali1;
        this.Cali2 = Cali2;
        this.Cali3 = Cali3;
    }*/

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public double getCali1() {
        return Cali1;
    }

    public void setCali1(double Cali1) {
        this.Cali1 = Cali1;
    }

    public double getCali2() {
        return Cali2;
    }

    public void setCali2(double Cali2) {
        this.Cali2 = Cali2;
    }

    public double getCali3() {
        return Cali3;
    }

    public void setCali3(double Cali3) {
        this.Cali3 = Cali3;
    }
    
    public void Promedio(){
        double Prom=(Cali1+Cali2+Cali3)/3;
        JOptionPane.showMessageDialog(null, "El promedio es: "+Prom);
    }
}

package Paquete;
import javax.swing.JOptionPane;

public class Profesor{
    Escuela objE = new Escuela();
    String NombreProf=null;
    String Domicilio=null;
    String Procedencia=null;
    String NoGrupo=null;
    int Edad=0;
    int Antiguedad=0;

    public String getNombreProf() {
        return NombreProf;
    }

    public void setNombreProf(String NombreProf) {
        this.NombreProf = NombreProf;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }

    public String getNoGrupo() {
        return NoGrupo;
    }

    public void setNoGrupo(String NoGrupo) {
        this.NoGrupo = NoGrupo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    /*public Escuela getObj() {
        return objE;
    }

    public void setObj(Escuela obj) {
        this.objE = obj;
    }*/
    
    public void setNombreEscuela(String NombreEscuela){
        this.objE.NombreEscuela=NombreEscuela;
    }
    
    public void setDomicilioE(String DomicilioE){
        this.objE.DomicilioE=DomicilioE;
    }
    
    public void imprimirTodo(){
        JOptionPane.showMessageDialog(null, "La escuela perteneciente: "+objE.getNombreEscuela()+"\n"+
                                          "Domicilio de la escuela: "+objE.getDomicilioE()+"\n"+
                                          "Profesor: "+NombreProf+"\n"+
                                          "Domicilio: "+Domicilio+"\n"+
                                          "Procede de: "+Procedencia+"\n"+
                                          "Grupo: "+NoGrupo+"\n"+
                                          "Edad: "+Edad+"\n"+
                                          "Antiguedad: "+Antiguedad);
    }
}

package Paquete;
import javax.swing.JOptionPane;

public class Ventas1 {
    public int Codigo;
    public int Precio;
    public int Cantidad;
    String Producto;
    

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
    
    public void Calcular(){
        int totalCompra = (Precio*Cantidad);
        JOptionPane.showMessageDialog(null, "Producto comprado: " +Producto+"\n"+
                                            //"Codigo del producto: "+Codigo+"\n"+
                                            "Cantidad comprada: " +Cantidad+"\n"+
                                            "Precio del producto: " +Precio+"\n"+
                                            "Total a pagar: "+totalCompra);
    }
}

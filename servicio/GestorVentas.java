package servicio;

import modelo.Venta;
import java.util.ArrayList;


public class GestorVentas {
    private ArrayList<Venta> ventas = new ArrayList<>();
   
    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }
    
    
    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    
    public void listarVentas() {
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
    
    
}

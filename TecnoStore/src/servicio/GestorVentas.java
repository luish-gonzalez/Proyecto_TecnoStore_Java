package servicio;

import modelo.Venta;
import java.util.ArrayList;



public class GestorVentas {
    private ArrayList<Venta> ventas = new ArrayList<>();

   
    public void registrarVenta(Venta venta) {
        
        
        for (modelo.ItemVenta item : venta.getItems()) {
                modelo.Celular celular = item.getCelular();
                if (item.getCantidad() > celular.getStock()) {
                    throw new IllegalArgumentException("Stock insuficiente para " + celular.getModelo());
                    }
               celular.setStock(celular.getStock() - item.getCantidad());
                
                
            }
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

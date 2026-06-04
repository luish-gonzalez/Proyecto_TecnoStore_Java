package modelo;

public class ItemVenta {
    private Celular celular;
    private int cantidad;
    private double subtotal;
    
    
    public ItemVenta(Celular celular, int cantidad) {
        this.celular = celular;
        this.cantidad = cantidad;
        this.subtotal = celular.getPrecio() * cantidad;
    }
    
}

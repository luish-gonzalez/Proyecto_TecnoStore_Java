package main;

import modelo.CategoriaGama;
import modelo.Celular;
import util.Validador;
import modelo.Cliente;
import servicio.GestorClientes;
import servicio.GestorCelulares;
import modelo.ItemVenta;
import modelo.Venta;
import servicio.GestorVentas;
import util.ReporteUtils;
import util.ArchivoUtils;


public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a TecnoStore");

        Celular celular = new Celular(1, "Samsung", "A55", 1500000, 10, "Android", CategoriaGama.BAJA);
        System.out.println(celular);
        
        System.out.println(Validador.correoValido("juan@gmail.com"));
        System.out.println(Validador.correoValido("juan@gmail"));
        
        GestorClientes gestorClientes = new GestorClientes();
        Cliente cliente1 = new Cliente(1, "Ana Pérez", "123", "ana@gmail.com", "3001111111");
        Cliente cliente2 = new Cliente(2, "Luis Gómez", "123", "luis@gmail.com", "3002222222");
        
        try {
            gestorClientes.registrarCliente(cliente1);
            gestorClientes.listarClientes();
            gestorClientes.registrarCliente(cliente2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        
        GestorCelulares gestorCelulares = new GestorCelulares();
        Celular celular1 = new Celular(1, "Samsung", "A55", 1500000, 10, "Android", CategoriaGama.MEDIA);
        Celular celular2 = new Celular(2, "Xiaomi", "Redmi Note 13", 1200000, 8, "Android", CategoriaGama.MEDIA);
        
        gestorCelulares.registrarCelular(celular1);
        gestorCelulares.registrarCelular(celular2);
        gestorCelulares.listarCelulares();
        //gestorCelulares.eliminarCelular(1);
        System.out.println("Inventario después de eliminar:");
        gestorCelulares.listarCelulares();
        //gestorCelulares.actualizarPrecioYStock(1, 1800000, 15);
        System.out.println("Inventario actualizado:");
        gestorCelulares.listarCelulares();
        
        GestorVentas gestorVentas = new GestorVentas();
        Venta venta = new Venta(1, cliente1);
        ItemVenta item = new ItemVenta(celular1, 7);
        //ItemVenta item = new ItemVenta(celular1, 20);
        venta.agregarItem(item);
        gestorVentas.registrarVenta(venta);
        gestorVentas.listarVentas();
        Celular celular3 = new Celular(3, "Motorola", "G54", 900000, 3, "Android", CategoriaGama.BAJA);
        gestorCelulares.registrarCelular(celular3);
        System.out.println("Celulares con stock bajo:");
        gestorCelulares.mostrarStockBajo();
        ReporteUtils.mostrarStockBajo(gestorCelulares.getCelulares());
        System.out.println("Top 3 celulares más vendidos:");
        ReporteUtils.mostrarTop3CelularesMasVendidos(gestorVentas.getVentas());
        System.out.println("Ventas totales por mes:");
        ReporteUtils.mostrarVentasTotalesPorMes(gestorVentas.getVentas());
        ArchivoUtils.generarReporteVentas(gestorVentas.getVentas());

        
        
        
        
        

    }
}

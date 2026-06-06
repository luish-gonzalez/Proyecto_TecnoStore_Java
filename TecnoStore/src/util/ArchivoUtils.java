package util;

import modelo.Venta;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoUtils {
    
    public static void generarReporteVentas(ArrayList<Venta> ventas) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("reporte_ventas.txt"))) {
            writer.println("REPORTE DE VENTAS - TecnoStore");
            writer.println("------------------------------");
            for (Venta venta : ventas) {
                writer.println(venta);
            }
            
        }catch (IOException e) {
            System.out.println("Error al generar el reporte: " + e.getMessage());
            }
    }
    
}

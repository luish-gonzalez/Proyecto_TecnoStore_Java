/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import util.ScannerManager;
import java.util.Scanner;
import servicio.GestorCelulares;
import servicio.GestorVentas;

/**
 *
 * @author PC_WIN11
 */
public class MenuReportes {
    private final Scanner scanner;
    private final GestorCelulares gestorCelulares;
    private final GestorVentas gestorVentas;
    
    public MenuReportes(GestorCelulares gestorCelulares, GestorVentas gestorVentas) {
        this.scanner = ScannerManager
                .getInstancia()
                .getScanner();
        this.gestorCelulares = gestorCelulares;
        this.gestorVentas = gestorVentas;
    }
    
    public void mostrar() {
        int opcion;

        do {
            System.out.println("=== MENÚ REPORTES ===");
            System.out.println("1. Celulares con stock bajo");
            System.out.println("2. Top 3 celulares más vendidos");
            System.out.println("3. Ventas totales por mes");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 0);
    }
}

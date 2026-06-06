/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import util.ScannerManager;
import java.util.Scanner;
import controlador.VentaController;

/**
 *
 * @author PC_WIN11
 */
public class MenuVentas {
    private final Scanner scanner;
    private final VentaController ventaController;
    
    public MenuVentas(VentaController ventaController) {
        this.scanner = ScannerManager.getInstancia().getScanner();
        this.ventaController = ventaController;
    }
    
    public void mostrar() {
        int opcion;

        do {
            System.out.println("=== MENÚ VENTAS ===");
            System.out.println("1. Registrar venta");
            System.out.println("2. Listar ventas");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 2:
                    ventaController.listarVentas();
                    break;
            }

        } while (opcion != 0);
    }
}

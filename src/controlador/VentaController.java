
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import servicio.GestorVentas;
import servicio.GestorClientes;
import servicio.GestorCelulares;

/**
 *
 * @author camper
 */
public class VentaController {
    private final GestorVentas gestorVentas;
    private final GestorClientes gestorClientes;
    private final GestorCelulares gestorCelulares;
    
    public VentaController(GestorVentas gestorVentas,
                       GestorClientes gestorClientes,
                       GestorCelulares gestorCelulares) {
        this.gestorVentas = gestorVentas;
        this.gestorClientes = gestorClientes;
        this.gestorCelulares = gestorCelulares;
    }
    
    public void listarClientes() {
        gestorClientes.listarClientes();
    }
    
    public void listarCelulares() {
        gestorCelulares.listarCelulares();
    }
    
    public void listarVentas() {
        gestorVentas.listarVentas();
    }
}

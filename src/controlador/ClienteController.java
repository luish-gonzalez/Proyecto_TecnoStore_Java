/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cliente;
import servicio.GestorClientes;

/**
 *
 * @author camper
 */
public class ClienteController {
    private final GestorClientes gestorClientes;
    
    public ClienteController(GestorClientes gestorClientes) {
        this.gestorClientes = gestorClientes;
    }
    
    public void registrarCliente(Cliente cliente) {
        gestorClientes.registrarCliente(cliente);
    }
    
    public void listarClientes() {
        gestorClientes.listarClientes();
    }
}

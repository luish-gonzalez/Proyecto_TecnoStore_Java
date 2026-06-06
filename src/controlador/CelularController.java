/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import servicio.GestorCelulares;
import modelo.Celular;
import java.util.ArrayList;

/**
 *
 * @author camper
 */
public class CelularController {
    private final GestorCelulares gestorCelulares;
    
    
    public CelularController(GestorCelulares gestorCelulares) {
        this.gestorCelulares = gestorCelulares;
    }
    
    public void registrarCelular(Celular celular) {
        gestorCelulares.registrarCelular(celular);
    }
    
    public void listarCelulares() {
        gestorCelulares.listarCelulares();
    }
    
    public void actualizarPrecioYStock(int id, double precio, int stock) {
        gestorCelulares.actualizarPrecioYStock(id, precio, stock);
    }
    
    public void eliminarCelular(int id) {
        gestorCelulares.eliminarCelular(id);
    }
    
    public ArrayList<Celular> getCelulares() {
        return gestorCelulares.getCelulares();
    }
}

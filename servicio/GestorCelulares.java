/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Celular;
import java.util.ArrayList;

/**
 *
 * @author PC_WIN11
 */
public class GestorCelulares {
    private ArrayList<Celular> celulares = new ArrayList<>();
    
    public void registrarCelular(Celular celular) {
    celulares.add(celular);
    }
    
    public Celular buscarPorId(int id) {
        for (Celular celular : celulares) {
            if (celular.getId() == id) {
                return celular;
            }
        }
        return null;
    }
    
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Celular;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author PC_WIN11
 */
public class CelularDAO {
    public void insertarCelular(Celular celular) {
        String sql = "INSERT INTO celulares (id, marca, modelo, sistema_operativo, gama, precio, stock) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (   Connection conn = ConexionDB.obtenerConexion(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, celular.getId());
            stmt.setString(2, celular.getMarca());
            stmt.setString(3, celular.getModelo());
            stmt.setString(4, celular.getSistemaOperativo());
            stmt.setString(5, celular.getGama().name());
            stmt.setDouble(6, celular.getPrecio());
            stmt.setInt(7, celular.getStock());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar celular: " + e.getMessage());
        }
    }
}

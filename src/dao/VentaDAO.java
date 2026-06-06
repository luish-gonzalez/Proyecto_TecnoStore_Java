/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ItemVenta;

/**
 *
 * @author PC_WIN11
 */
public class VentaDAO {
    public void insertarVenta(Venta venta) {
        String sqlVenta = "INSERT INTO ventas (id, id_cliente, fecha, total) VALUES (?, ?, ?, ?)";
        String sqlDetalle = "INSERT INTO detalle_ventas (id_venta, id_celular, cantidad, subtotal) VALUES (?, ?, ?, ?)";
        
        try (   Connection conn = ConexionDB.obtenerConexion();
                PreparedStatement stmtVenta = conn.prepareStatement(sqlVenta)) {
            stmtVenta.setInt(1, venta.getId());
            stmtVenta.setInt(2, venta.getCliente().getId());
            stmtVenta.setDate(3, java.sql.Date.valueOf(venta.getFecha()));
            stmtVenta.setDouble(4, venta.getTotalConIva());
            stmtVenta.executeUpdate();
            try (PreparedStatement stmtDetalle = conn.prepareStatement(sqlDetalle)) {
                for (ItemVenta item : venta.getItems()) {
                    stmtDetalle.setInt(1, venta.getId());
                    stmtDetalle.setInt(2, item.getCelular().getId());
                    stmtDetalle.setInt(3, item.getCantidad());
                    stmtDetalle.setDouble(4, item.getSubtotal());
                    stmtDetalle.executeUpdate();
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar venta: " + e.getMessage());
        }
    }
}

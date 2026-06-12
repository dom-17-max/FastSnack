/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.DAOException;

/**
 *
 * @author
 * noemi
 */

public class UsuarioDAO {
    private static UsuarioDAO instance;
    private Conexion conexion;

    private UsuarioDAO() throws DAOException {
        conexion = Conexion.getInstance(); 
    }

    public static UsuarioDAO getInstance() throws DAOException {
        if (instance == null) {
            instance = new UsuarioDAO(); 
        }
        return instance;
    }

    // Método para validar login
public boolean validarUsuario(String usuario, String contrasena) throws DAOException, SQLException {
    String sql = "SELECT * FROM Persona WHERE usuario = ? AND contrasena = ?";
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = conexion.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, contrasena);
        rs = ps.executeQuery();
        return rs.next();
    } catch (SQLException e) {
        throw new DAOException("Error al validar el usuario", e);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
        } catch (SQLException e) {
            // Ignorar
        }
    }
}
// Método para obtener el ID del usuario
    public int obtenerIdUsuario(String nombre) throws DAOException {
        String sql = "SELECT id_persona FROM Persona WHERE nombre = ?";
        try (Connection con = conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_persona");
            }
            return -1; // Si no encuentra el usuario
        } catch (Exception e) {
            throw new DAOException("Error al obtener ID", e);
        }
    }

public boolean registrarUsuario(String nombres, String apellidos, String correo, 
                                String direccion, String usuario, String contrasena) throws DAOException {
    String sql = "INSERT INTO Persona (nombres, apellidos, correo, direccion, usuario, contrasena) VALUES (?, ?, ?, ?, ?, ?)";
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
        con = conexion.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombres);
        ps.setString(2, apellidos);
        ps.setString(3, correo);
        ps.setString(4, direccion);
        ps.setString(5, usuario);
        ps.setString(6, contrasena);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        throw new DAOException("Error al registrar el usuario", e);
    } finally {
        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            // Ignorar
            }
        }
    }
}
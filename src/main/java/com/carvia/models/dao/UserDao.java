package com.carvia.models.dao;
/*
 
 import com.carvia.controllers.;
 import com.skibidypaintproject.Entities.User;
 * 
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.List;
 import java.util.ArrayList;
 
 import org.apache.logging.log4j.LogManager;
 import org.apache.logging.log4j.Logger;
 import org.mindrot.jbcrypt.BCrypt;
 
 import com.carvia.models.conexion.conexion;
 
 public class UserDAO extends conexion {
 
     public List<Usuario> listar() throws Exception {
         ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
         try {
             this.abrirConexion();
             PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM usuarios");
             ResultSet rs = st.executeQuery();
 
             while (rs.next()) {
                 Usuario usuario = new Usuario();
                 usuario.setIdUsuario(rs.getInt("idUsuario"));
                 usuario.setUser(rs.getString("user"));
                 usuario.setPassword(rs.getString("password"));
                 usuario.setTipo(TipoDeUsuario.valueOf(rs.getString("Tipo")));
                 listaUsuarios.add(usuario);
             }
 
             this.cerrarConexion();
         } catch (Exception e) {
             throw new Exception("Listar usuarios: " + e.getMessage());
         }
         return listaUsuarios;
     }
 
     public void eliminar(Usuario usuario) throws Exception {
         try {
             this.abrirConexion();
             PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM usuarios WHERE idUsuario=?");
             st.setInt(1, usuario.getIdUsuario());
             st.executeUpdate();
         } catch (Exception e) {
             throw new Exception("Método Eliminar un usuario: " + e.getMessage());
         } finally {
             try {
                 this.cerrarConexion();
             } catch (Exception e) {
                 throw new Exception("Método Eliminar un usuario: " + e.getMessage());
             }
         }
     }
 }
 */

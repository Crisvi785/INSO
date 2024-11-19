/*
 * 
 * 
 * 
 package com.carvia.models.conexion;
 
 import java.sql.Connection;
 import java.sql.DriverManager;
 
 public class conexion {
     private String dataBaseURL;
     private String driverName;
     private String user;
     private String password;
     private Connection conexion;
 
     public String getDataBaseURL() {
         return dataBaseURL;
 
     }
 
     // AQUÍ VAN TODOS LOS GETTERS & SETTERS DE LOS PARÁMETROS DE LA CLASE
 
     public Conexion(){
 
     this.dataBaseURL = "jdbc:mysql://localhost:3306/instituto?autoReconnect=true&useSSL=true";
     this.driverName = "com.mysql.jdbc.Driver";
     this.user = "softwareI";
     this.password = "softwareI";
     
     }
 
     public void abrirConexion() throws Exception {
         if ((dataBaseURL == "") || (user == "") || (password == "") || (driverName == "")) {
             System.out.println("Error al crear la conexión (¿están inicializados?) con estos valores:");
             this.mostrarValoresConexion();
         } else {
             try {
                 Class.forName(this.driverName);
                 this.conexion = DriverManager.getConnection(this.dataBaseURL, this.user, this.pass);
             }
 
             catch (Exception e) {
 
                 throw new Exception("Al abrir la base de datos " + e.getMessage());
             }
         }
     }
 
     public void cerrarConexion() throws Exception {
         try {
             this.conexion.close();
             System.out.println("Cierre correcto de la conexión con la base de datos");
         } catch (Exception e) {
             throw new Exception("Al cerrar la conexión de la base de datos. " + e.getMessage());
         }
     }
 }
 */
 
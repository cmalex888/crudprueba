/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.PreparedStatement;

/**
 *
 * @author acamacho
 */

//atributos
public class Proveedor {
    private int idProv;
    private String nombreProv;
    private String dirProv;
    private int telProv;
    private String emailProv;

//Constructor
    public Proveedor() {
    }
    
//encapsulamiento
    
    public int getIdProv() {
        return idProv;
    }

    public void setIdProv(int idProv) {
        this.idProv = idProv;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getDirProv() {
        return dirProv;
    }

    public void setDirProv(String dirProv) {
        this.dirProv = dirProv;
    }

    public int getTelProv() {
        return telProv;
    }

    public void setTelProv(int telProv) {
        this.telProv = telProv;
    }

    public String getEmailProv() {
        return emailProv;
    }

    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }
    
//metodos
    
    public void crearProveedor(){
        
        Conexion objconexion = new Conexion();
        objconexion.conectar();
        
        try{
            String sql = "INSERT INTO proveedor VALUES(?,?,?,?,?);";
            PreparedStatement stmt;
            stmt = objconexion.conn.prepareStatement(sql);
            stmt.setInt(1, this.idProv);
            stmt.setString(2,this.nombreProv);
            stmt.setString(3,this.dirProv);
            stmt.setInt(4,this.telProv);
            stmt.setString(5,this.emailProv);
            
            stmt.execute();
            
            objconexion.desconectar();
            
        }catch(Exception error){
            System.out.println("Error del modelo!"+error);
        }
        
        
    } 
    
    public void consultarProveedor(){
        
    }
    
    public void listarProveedor(){
        
    }
    
    public void actualizarProveedor(){
        
    }
    
    public void eliminarProveedor(){
        
    }


    
    
}

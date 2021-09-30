/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.sql.Connection; 
import java.sql.DriverManager;

        
/**
 *
 * @author acamacho
 */
public class Conexion {

    //atributos
    public Connection conn;
    private String host = "localhost:3306";
    private String dataBase = "tiendagrupo6";
    private String user = "root";
    private String password = "";
    
    //metodos
    
    public void conectar (){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.dataBase+"?zeroDateTimeBehavior=CONVERT_TO_NULL",this.user,this.password);
            System.out.println("Conexion Exitosa!!");
        }catch (Exception error)  {
            System.out.print("Error en la conexión"+error);
            System.out.print(error);
           
        }
       
    }
    
    public void desconectar (){
        conn = null;
    }
    
    



    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author acamacho
 */
public class Producto {
    //atributos
    private int codigoProducto;
    private String nombreProducto;
    private int cantidadProducto;
    private int precioProducto;
    private String categoriaProducto;
    
    //constructor

    public Producto() {
    }

    //encapsular
    
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
    
    
    //Metodos
    
    public void crearProducto(){
        
    } 
    
    public void consultarProducto(){
        
    }
    
    public void listarProducto(){
        
    }
    
    public void actualizarProducto(){
        
    }
    
    public void eliminarProducto(){
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabase;

/**
 * @since 10 de marzo de 2017
 * @author Johan Quiñonez
 * @version 1.0
 */
public class Predeterminada {
    private int precio;
    private String nombre;
/**
    * constructor 
    * @param precio precio de la pizza predeterminada
    * @param nombre nombre de la pizza predeterminada
    */
    public Predeterminada(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
    /**
    *@return el precio
    */
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /**
    *@return el nombre
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

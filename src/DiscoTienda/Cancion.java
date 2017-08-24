/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscoTienda;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private String nombre;
    private double precio;
    private double duracion;
    private double tamano;
    private double calidad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public void setCalidad(double calidad) {
        this.calidad = calidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDuracion() {
        return duracion;
    }

    public double getCalidad() {
        return calidad;
    }

    public Cancion(String nombre, double precio, double duracion, double tamano, double calidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
        this.tamano = tamano;
        this.calidad = calidad;
    }
    
}

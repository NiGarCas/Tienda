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
public class DiscoTienda {
    private String nombre;
    private int cantidad_discos;
    private Disco[] discos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int setCantidad_discos() {
        return cantidad_discos;
    }

    public void setDiscos(Disco[] discos) {
        this.discos = discos;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getCantidad_discos() {
        return cantidad_discos;
    }

    public Disco[] getDiscos() {
        return discos;
    }

    public DiscoTienda(String nombre) {
        this.nombre = nombre;
        this.cantidad_discos = 0;
        this.discos = new Disco [100];
    }
    
    public boolean agregar_disco(String nombre, String artista, String genero, String imagen_caratula) {
        if (this.cantidad_discos < 100){
            this.discos[this.cantidad_discos] = new Disco (nombre, artista, genero, imagen_caratula);
            this.cantidad_discos = this.cantidad_discos + 1;
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean agregar_cancion(String nombre_disco, String nombre, double precio, double duracion, double tamano, double calidad) {
        Disco disco = null;
        for (int i = 0; i < this.cantidad_discos; i = i + 1){
            if (this.discos[i].getNombre().equals(nombre_disco)){
                disco = this.discos[i];
                this.discos[i].agregar_cancion(nombre, precio, duracion, tamano, calidad);
            }
        }
        if (disco.agregar_cancion(nombre, precio, duracion, tamano, calidad) == true){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean info_cancion(String nombre_disco, String nombre_cancion){
        Disco disco = null;
        for (int i = 0; i < this.cantidad_discos; i = i + 1){
            if (this.discos[i].getNombre().equals(nombre_disco)){
                disco = this.discos[i];
                this.discos[i].info_cancion(nombre_cancion);
                break;
            }
        }
        if (disco.info_cancion(nombre_cancion) == true){
            return true;
        }else{
            return false;
        }
    }
    
}


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
    
    public void agregar_disco(String nombre, String artista, String genero, String imagen_caratula) {
        this.discos[this.cantidad_discos] = new Disco (nombre, artista, genero, imagen_caratula);
        this.cantidad_discos = this.cantidad_discos + 1;
    }
    
    public void agregar_cancion(int numero_disco, String nombre, double precio, double duracion, double tamano, double calidad) {
        this.discos[numero_disco - 1].getCanciones()[this.discos[numero_disco - 1].getCantidad_canciones()] = new Cancion (nombre, precio, duracion, tamano, calidad);
        this.discos[numero_disco - 1].setCantidad_canciones(this.discos[numero_disco - 1].getCantidad_canciones() + 1);
    }
    
    public void info_cancion (int numero_disco, int numero_cancion){
        System.out.println("Nombre:" + this.discos[numero_disco - 1].getCanciones()[numero_cancion - 1].getNombre());
        System.out.println("Precio:$" + this.discos[numero_disco - 1].getCanciones()[numero_cancion - 1].getPrecio());
        System.out.println("Duracion:" + this.discos[numero_disco - 1].getCanciones()[numero_cancion - 1].getDuracion() + "minutos");
        System.out.println("Tamano:" + this.discos[numero_disco - 1].getCanciones()[numero_cancion - 1].getTamano() + "MB");
        System.out.println("Calidad:" + this.discos[numero_disco - 1].getCanciones()[numero_cancion - 1].getCalidad() + "Kbps");
    }
}


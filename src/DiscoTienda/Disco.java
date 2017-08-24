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
public class Disco {
    
    private String nombre;
    private String artista;
    private String genero;
    private String imagen_caratula;
    private Cancion[] canciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setImagen_caratula(String imagen_caratula) {
        this.imagen_caratula = imagen_caratula;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public String getImagen_caratula() {
        return imagen_caratula;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }

    public Disco(String nombre, String artista, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
    }
 
    
}

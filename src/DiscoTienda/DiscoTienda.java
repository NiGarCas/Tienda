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
    private Disco[] discos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscos(Disco[] discos) {
        this.discos = discos;
    }

    public String getNombre() {
        return nombre;
    }

    public Disco[] getDiscos() {
        return discos;
    }

    public DiscoTienda(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregar_disco(String nombre, String artista, String genero) {
    }
}


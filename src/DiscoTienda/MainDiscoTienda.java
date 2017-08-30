/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscoTienda;
import java.util.*;

/**
 *
 * @author nicol
 */
public class MainDiscoTienda {
    public static void main (String [] args){
        Scanner flujoEntrada = new Scanner(System.in);
        DiscoTienda miDiscoTienda = new DiscoTienda ("miDiscoTienda");
        System.out.println("Bienvenido a miDiscoTienda");
        int salir = 0;
        while (salir == 0){
        System.out.println("");
        System.out.println("MENU");
        System.out.println("");
        System.out.println("1. Agregar disco");
        System.out.println("2. Agregar cancion");
        System.out.println("3. Ver informacion de una cancion");
        System.out.println("");
        int opcion = flujoEntrada.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Escriba el nombre del disco: ");
                String nombredisco = flujoEntrada.next();
                System.out.println("Escriba el nombre del artista del disco: ");
                String artista = flujoEntrada.next();
                System.out.println("Escriba el genero del disco: ");
                String genero = flujoEntrada.next();
                System.out.println("Describa la caratula del disco: ");
                String imagen_caratula = flujoEntrada.next();
                System.out.println(" ");
                miDiscoTienda.agregar_disco(nombredisco, artista, genero, imagen_caratula);
                if (miDiscoTienda.agregar_disco(nombredisco, artista, genero, imagen_caratula) == true){
                    System.out.println("Disco agregado exitosamente");
                }else{
                    System.out.println("Maxima cantidad de discos alcanzada. No fue posible agregar disco.");
                }
                break;
            case 2:
                System.out.println("LISTA DE DISCOS");
                System.out.println(" ");
                Disco[] discos = miDiscoTienda.getDiscos();
                for (int i = 0; i < miDiscoTienda.getCantidad_discos(); i++) {
                    System.out.println((i+1) + " " + discos[i].getNombre());
                }
                System.out.println("Ingrese nombre de disco donde desea agregar la cancion: ");
                String nombre_disco = flujoEntrada.next();
                System.out.println("Escriba el nombre de la cancion: ");
                String nombrecancion = flujoEntrada.next();
                System.out.println("Escriba el precio de la cancion ($): ");
                double precio = flujoEntrada.nextDouble();
                System.out.println("Escriba la duracion de la cancion (minutos): ");
                double duracion = flujoEntrada.nextDouble();
                System.out.println("Escriba el tamano de la cancion (MB): ");
                double tamano = flujoEntrada.nextDouble();
                System.out.println("Escriba la calidad de la cancion (Kbps): ");
                double calidad = flujoEntrada.nextDouble();
                System.out.println(" ");
                miDiscoTienda.agregar_cancion(nombre_disco, nombrecancion, precio, duracion, tamano, calidad);
                if (miDiscoTienda.agregar_cancion(nombre_disco, nombrecancion, precio, duracion, tamano, calidad)== true){
                    System.out.println("Cancion agregada exitosamente");
                }else{
                    System.out.println("No fue posible agregar cancion");
                    System.out.println("Posibles causas: ");
                    System.out.println("1. Disco no existente");
                    System.out.println("2. Maxima cantidad de canciones alcanzada");
                }
                break;
            case 3:
                System.out.println("LISTA DE DISCOS");
                System.out.println(" ");
                Disco[] discos_ = miDiscoTienda.getDiscos();
                for (int i = 0; i < miDiscoTienda.getCantidad_discos(); i++) {
                    System.out.println((i+1) + " " + discos_[i].getNombre());
                }
                System.out.println("Ingrese nombre del disco al que pertenece la cancion: ");
                String nombreDisco = flujoEntrada.next();
                System.out.println("Ingrese nombre de la cancion que desea revisar: ");
                String nombreCancion = flujoEntrada.next();
                System.out.println(" ");
                miDiscoTienda.info_cancion(nombreDisco, nombreCancion);
                if ( miDiscoTienda.info_cancion(nombreDisco, nombreCancion) != true){
                    System.out.println("Disco y/o cancion inexistentes.No fue posible mostrar informacion");
                }
                break;
            default:
                System.out.println("OPCION NO DISPONIBLE");
        }
        System.out.println("¿Salir de miDiscoTienda?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        int respuesta = flujoEntrada.nextInt();
        switch (respuesta){
            case 1:
                salir = 1;
                break;
            default:
                salir = 0;
                break;
        }
        }
    }
}

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
                miDiscoTienda.agregar_disco(nombredisco, artista, genero, imagen_caratula);
                break;
            case 2:
                System.out.println("LISTA DE DISCOS");
                System.out.println(" ");
                for (int i = 0; i < miDiscoTienda.getCantidad_discos(); i = i+ 1){
                    System.out.println((i+1) + "." + miDiscoTienda.getDiscos()[i].getNombre());
                }
                System.out.println("Ingrese numero de disco donde desea agregar la cancion: ");
                int numero_disco = flujoEntrada.nextInt();
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
                miDiscoTienda.agregar_cancion(numero_disco, nombrecancion, precio, duracion, tamano, calidad);
                break;
            case 3:
                System.out.println("LISTA DE DISCOS");
                System.out.println(" ");
                for (int i = 0; i < miDiscoTienda.getCantidad_discos(); i = i+ 1){
                    System.out.println((i+1) + "." + miDiscoTienda.getDiscos()[i].getNombre());
                }
                System.out.println("Ingrese numero de disco al que pertenece la cancion: ");
                int numerodisco = flujoEntrada.nextInt();
                for (int j = 0; j < miDiscoTienda.getDiscos()[numerodisco - 1].getCantidad_canciones(); j = j+ 1){
                    System.out.println((j+1) + "." + miDiscoTienda.getDiscos()[numerodisco - 1].getCanciones()[j].getNombre());
                }
                System.out.println("Ingrese numero de disco donde desea agregar la cancion: ");
                int numerocancion = flujoEntrada.nextInt();
                miDiscoTienda.info_cancion(numerodisco, numerocancion);
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

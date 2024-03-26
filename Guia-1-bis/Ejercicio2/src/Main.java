import modelo.Libro;
import modelo.Tienda;

import java.util.Scanner;

public class Main {
    static Scanner scan;
    public static void main(String[] args) {

        scan = new Scanner(System.in);

        //cargarLibro();
        cargarTienda();
    }

    public static void cargarLibro(){


        Libro libro = new Libro();
        System.out.println("Ingrese el nombre del libro");
        libro.setTitulo(scan.nextLine());
        System.out.println("Ingrese el nombre del autor");
        libro.setAutor(scan.nextLine());
        System.out.println("Ingrese el año de lanzamiento");
        libro.setAnioPublicacion(scan.nextInt());
        scan.nextLine();

        System.out.println(libro.obtenerInformacion());
    }


    public static void cargarTienda(){

        Tienda tienda = new Tienda();

        System.out.println("Ingrese el nombre de la tienda");
        tienda.setNombre(scan.nextLine());

        for(int i = 0; i < tienda.getProductos().length; i++){
            System.out.println("Ingrese el nombre del producto");
            tienda.agregarProducto(scan.nextLine());
        }

        System.out.println("------- Productos -------");
        System.out.println(tienda.mostrarProductos());
    }

}
import Metodo.CD;
import Metodo.Elemento;
import Metodo.DVD;
import Metodo.DoMe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    public static void main(String[] args) {

        DoMe dome = new DoMe();

        scan = new Scanner(System.in);
        char rta = 's';

        do{  //Do while para que se puedan seguir cargando CD y DVD
            System.out.println("Ingresar DVD - 1\nIngresar CD - 2\nMostrar elementos - 3");
            int op = scan.nextInt();
            scan.nextLine();
            switch (op){
                case 1:
                    cargarDVD(dome);
                    break;
                case 2:
                    cargarCD(dome);
                    break;
                case 3:
                    mostrarElementosArraylist(dome);
                    break;
                default:
                    System.out.println("opcion invalida");
            }

            System.out.println("Para seguir operando presione 's'");
            rta = scan.next().charAt(0);
        }while (rta == 's');

    }


    public static void cargarCD(DoMe dome){

        char rta = 's';
        do{

            Elemento ele = cargarElemento();
            System.out.println("Ingrese el Interprete");
            String auxInterprete = (scan.nextLine());
            System.out.println("Ingrese la cantidad de canciones");
            int auxCantCanciones = scan.nextInt();

            dome.agregarCDaArrayList(ele, auxInterprete, auxCantCanciones);

            System.out.println("Para seguir agregando CD ingrese 's'");
            rta = scan.next().charAt(0);
            scan.nextLine();
        }while (rta == 's');
    }



    public static void cargarDVD(DoMe dome){

        char rta = 's';
        do{

            Elemento ele = cargarElemento();
            System.out.println("Ingrese el Director");
            String auxDirector = (scan.nextLine());

            dome.agregarDVDaArrayList(ele, auxDirector);

            System.out.println("Para seguir agregando DVD ingrese 's'");
            rta = scan.next().charAt(0);
            scan.nextLine();
        }while (rta == 's');

    }

    public static Elemento cargarElemento(){

        System.out.println("Ingrese el titulo");
        String titulo = scan.nextLine();
        System.out.println("Ingrese un comentario");
        String comentario = scan.nextLine();
        System.out.println("Ingrese la duracion en minutos");
        int duracion = scan.nextInt();

        scan.nextLine();

        return  new Elemento(titulo, duracion, comentario);

    }


    public static void mostrarElementosArraylist(DoMe dome) {

        char rta = 's';
        do {  //Do while para que se puedan seguir cargando CD y DVD
            System.out.println("""
                    1 - Mostrar CD
                    2 - Mostrar DVD
                    3 - Mostrar CD con mas de 10 canciones
                    4 - Mostrar peliculas con mas de 100 minutos 
                                        
                    """);
            int op = scan.nextInt();
            scan.nextLine();

            dome.mostrarArrayListParticular(op);

            System.out.println("Para seguir mostrando presione 's'");
            rta = scan.next().charAt(0);
            scan.nextLine();
        } while (rta == 's');


    }

}
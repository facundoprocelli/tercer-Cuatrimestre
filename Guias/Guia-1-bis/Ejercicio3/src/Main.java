import modulo.Coche;
import modulo.Concesionario;

import java.util.Scanner;

public class Main {
    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);

        Concesionario concesionario = new Concesionario(); // Creo un dato de tipo concesionario
        concesionario = cargarConcesionario(); // Llamo a la funcion para cargar el concesionario

        operarCoches(concesionario); // Llamo a la funcion para operar los autos

    }

    public static void operarCoches(Concesionario concesionario){

        char rta = 's';
        int operador = 0;

            Coche[] coches = concesionario.getCochesDisponibles(); // creo un arreglo de autos en donde almaceno los autos dispoibles en el concesionario

        while (rta == 's') {
            System.out.println("--------------- " + concesionario.getNombre() + " ---------------");
            System.out.println("Elige uno de los autos disponibles, 1, 2 o 3");
            System.out.println(concesionario.mostrarCochesDisponiblesReducido());// Muestro los autos disponibles

            operador = scan.nextInt();

            switch (operador) {

                case 1:
                    manejar(coches[0]); // Manejo el primer auto de arreglo
                    break;
                case 2:
                    manejar(coches[1]); // Manejo el segundo auto del arreglo
                    break;
                case 3:
                    manejar(coches[2]); // Manejo el tercer auto del arreglo
                    break;
                default:
                    System.out.println("Esa no es una opcion");
            }

            System.out.println(concesionario.mostrarCochesDisponibles()); // Muestro el estado acutal de los coches del concesionario

            System.out.println("Para seguir operando presione 's'");
            rta = scan.next().charAt(0);
            scan.nextLine();
        }
    }

    // Funcion para operar con los coches
    public static void manejar(Coche coche){
        char rta = 's';
        int op = 0;
        double velocidad = 0;
        while (rta == 's'){

            System.out.println("Que desea hacer?\nAcelerar =  1\nFrenar = 2");// Pregunto que va  a hacer
            op = scan.nextInt();

            if(op == 1){
                // Acelerar el coche
                System.out.println("Cuantos kmh desea acelerar");
                velocidad = scan.nextDouble();
                coche.acelerar(velocidad);
            }
            else if (op == 2){
                //Desacelerar el coche
                System.out.println("Cuanto kmh desea frenar");
                velocidad = scan.nextDouble();
                coche.frenar(velocidad);
            }

            System.out.println("Para seguir presione 's'");
            rta = scan.next().charAt(0);
            scan.nextLine();
        }


    }


    //Cargo el concesionario
    public static Concesionario cargarConcesionario(){

        Concesionario concesionario = new Concesionario();

        System.out.println("Ingrese el nombre del concecionario");
        concesionario.setNombre(scan.nextLine());

        // bucle para cargar los coches en el arreglo del concesionario
        for(int i = 0; i < concesionario.getCochesDisponibles().length; i++){

            concesionario.agregarCoche(cargarCoche());
        }

        return concesionario;
    }



    //Funcion para cargar los datos de un coche
    public static Coche cargarCoche(){

        Coche coche = new Coche();

        System.out.println("Ingrese la marca del coche");
        coche.setMarca(scan.nextLine());
        System.out.println("Ingrese el modelo del coche");
        coche.setModelo(scan.nextLine());
        System.out.println("Ingrese el año de lanzamiento del coche");
        coche.setAnioFabricacion(scan.nextInt());

        scan.nextLine();
        return coche;
    }
}
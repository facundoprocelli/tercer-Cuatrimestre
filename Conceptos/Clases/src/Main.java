import Clases.Persona;
import modelo.Lapiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaro el Scanner
        Scanner scan = new Scanner(System.in);

        /*
        // Declaro un arreglo de personas
        Persona[] person = new Persona[3];

        // Bucle para cargar personas
        for (int i = 0; i < person.length; i++) {

            // En la posicion i del arreglo almaceno una nuevo Objeto de tipo Persona
            person[i] = new Persona();

            // Cargo los datos
            // Uso setters para poder añadir los datos a mi objeto
            System.out.println("Nombre");
            person[i].setNombre(scan.nextLine());
            System.out.println("Genero");
            person[i].setGenero(scan.nextLine());
            System.out.println("Altura");
            person[i].setAltura(scan.nextInt());

            // Limpio el buffer
            scan.nextLine();



        }

        //Creo un bucle para mostrar todos los datos del arreglo
        for (int i = 0; i < person.length; i++) {
            // Uso getters para poder impirmir el mensaje que deseo
            System.out.println("El nombre es: " + person[i].getNombre() + " El genero es " + person[i].getGenero() + " La altura es " + person[i].getAltura());

        }
    */

        // llamo a los constructores y el compliador elije cual es el mejor
        Lapiz lapiz001 = new Lapiz("azul");
        Lapiz lapiz002 = new Lapiz("rojo");
        Lapiz lapiz003 = new Lapiz();



        // Las modificacións que yo hago aca solo afectan a ese lapiz
        lapiz001.setMarca("Faber");
        //System.out.println(lapiz001.getInfo());

        mostrarLapices(lapiz001, lapiz002,lapiz003);
        mostrarLapices(lapiz001, lapiz002,lapiz003);
    }

    // Creo esta funcion en donde yo puedo mostrar todos los lapices
    private static void mostrarLapices(Lapiz _lapiz001, Lapiz lapiz002, Lapiz lapiz003) {
        System.out.println(_lapiz001.getInfo());
        System.out.println(lapiz002.getInfo());
        System.out.println(lapiz003.getInfo());

        //Aca no se esta haciendo el cambio en una copia sino que
        //Se hace el cambio como si fueran punters
        // En java todos son punteros
        _lapiz001.setColor("Rojo");

    }


}
import Clases.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaro el Scanner
        Scanner scan = new Scanner(System.in);

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
    }
}
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        // Ejercicio 1
        //promeidoArreglo();

        //Ejercicio 2
        //parOImpar();

        //Ejercicio 3
        //mostrarPrimos();

        //Ejercicio 4
        mostrarNPrimos();

        // Ejercicios 7
        //sumaPrimerosNaturales();

        //Ejercicio 8
        //contarPositivos();

        // Ejercicio 9
        //anioBisiesto();

        scanner.close();
    }


//Ejercicio nº1: Calcular el promedio de un arreglo de números enteros.
// Realizar variantes con arreglos ya inicializados e ingreso por teclado.


    public static void promeidoArreglo() {


        int[] arreglo = new int[5];

        arreglo[0] = 10;
        arreglo[1] = 12;


        for (int i = 2; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }

        double total = 0;

        for (int i = 0; i < arreglo.length; i++) {
            total = total + arreglo[i];
        }

        total = total / arreglo.length;

        System.out.println("El promeido del arreglo es: " + total);


    }


//Ejercicio nº2: Calcular si un número es par o no.

    public static void parOImpar() {


        System.out.println("Ingrese un dato");
        int dato = scanner.nextInt();

        if (dato % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("impar");
        }

    }

//Ejercicio nº3: Mostrar los numeros primos hasta el 100

    public static void mostrarPrimos() {
        int primos = 0;
        int i = 0;
        while (primos < 100) {
            boolean esPrimo = true; // Suponemos que es primo inicialmente


            // Verificamos si i es divisible por algún número distinto de 1 e i
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false; // No es primo
                    break; // Salimos del bucle interno
                }
            }

            if (esPrimo) {
                System.out.println("El " + i + " es primo");
                primos++;
            } else {
                System.out.println("El " + i + " no es primo");
            }
            i++;
        }
    }

//Ejercicio nº4: Mostrar los primeros n números primos.

    public static void mostrarNPrimos() {

        int cantidadPrimos = scanner.nextInt();
        int primos = 0;
        int i = 0;

        while (primos < cantidadPrimos) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El " + i + " es primo");
                primos++;

            } else {
                System.out.println("El " + i + " no es primo");
            }
            i++;


        }


    }

//Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo.


//Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.


    public static void sumaPrimerosNaturales() {
        int num = 1;
        int resultado = 0;

        for (int i = 1; i < 10; i++) {
            resultado += i;
        }

        System.out.println("La suma de los 10 primeros numeros naturales es " + resultado);

    }

//Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.


    public static void contarPositivos() {

        char rta = 's';
        int dato = 0;
        int i = 0;

        while (rta == 's') {

            System.out.println("Ingrese un numero");
            dato = scanner.nextInt();

            if (dato >= 0) {
                i++;
            }

            System.out.println("Para seguir presion 's'");
            rta = scanner.next().charAt(0);
        }

        System.out.println("Se ingresaron: " + i + " numeros positivos");


    }


//Ejercicio nº9: Revisar si un año es bisiesto o no.

    public static void anioBisiesto() {
        System.out.println("Ingrese un año");
        int anio = scanner.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }

//Ejercicio nº10: Encontrar el valor ASCII de un carácter.


}

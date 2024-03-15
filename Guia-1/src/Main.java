import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 1
        promeidoArreglo();
    }


//Ejercicio nº1: Calcular el promedio de un arreglo de números enteros.
// Realizar variantes con arreglos ya inicializados e ingreso por teclado.


    public static void promeidoArreglo() {

        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[5];

        arreglo[0] = 10;
        arreglo[1] = 12;

        
        for (int i = 2; i < arreglo.length; i++)
        {
            arreglo[i] = scanner.nextInt();
        }

        double total = 0;

        for (int i = 0; i < arreglo.length; i++)
        {
            total = total + arreglo[i];
        }

        total = total / arreglo.length;

        System.out.println("El promeido del arreglo es: " + total);

    }


//Ejercicio nº2: Calcular si un número es par o no.

//Ejercicio nº3: Mostrar los primeros 100 números primos.

//Ejercicio nº4: Mostrar los primeros n números primos.

//Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo.

//Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.

//Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.

//Ejercicio nº9: Revisar si un año es bisiesto o no.

//Ejercicio nº10: Encontrar el valor ASCII de un carácter.


}

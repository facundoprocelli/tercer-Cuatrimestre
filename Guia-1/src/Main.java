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
        //mostrarNPrimos();

        //Ejercicio 6
        // probarPrimo(); // No me dice de forma correcta si es o no primo, simepre me dice que no lo es

        // Ejercicios 7
        //sumaPrimerosNaturales();

        //Ejercicio 8
        //contarPositivos();

        // Ejercicio 9
        //anioBisiesto();

        //Ejercicio 10
        //encontrarAscii();

        //Ejercicio 11
        //multiplicarNumeros();

        //Ejercicio 12
        //calcularArea();

        //Ejercicio 13
        saludo();


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
                }
            }

            if (esPrimo) {
                System.out.println("El " + i + " es primo");
                primos++;
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
                }
            }

            if (esPrimo) {
                System.out.println("El " + i + " es primo");
                primos++;
            }
            i++;
        }
    }

//Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo.

    public static void probarPrimo() {
        boolean esPrimo = true;
        char rta = 's';

        while (rta == 's') {

            System.out.println("Ingrese un numero Para averiguar si es primo");
            int num = scanner.nextInt();

            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    esPrimo = false;

                }
            }

            if (esPrimo) {
                System.out.println("El numero " + num + " es primo");
            } else {
                System.out.println("El numero " + num + " no es primo");
            }

            System.out.println("Para seguir presione 's'");
            rta = scanner.next().charAt(0);
        }
    }


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

    public static void encontrarAscii() {

        System.out.println("Ingrese un caracter");
        String dato = scanner.nextLine();

        int ascii = dato.codePointAt(0); // La funcion codePointAt(0) Nos devuelve el valor Ascii de el caracter
        // en la posicion 0 del string
        System.out.println("El codigo ASCII de " + dato + " es " + ascii);

    }


//Ejercicio nº11: Multiplicar dos números.

    public static void multiplicarNumeros() {

        int num1, num2;

        System.out.println("Ingrese el primer numero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = scanner.nextInt();

        int resultado = num1 * num2;

        System.out.println("El resultado de la mulitpicacion es " + resultado);


    }


//Ejercicio nº12: Realizar un programa que le pregunte al usuario que área desea calcular.
// Las opciones son: rectángulo, cuadrado, triangulo y circulo.

    public static void calcularArea() {

        System.out.println("Que area desea calcular\n 1- Rectangulo \n 2- Cuadrado \n 3- Triangulo \n 4 -Circulo");
        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                areaRectangulo();
                break;
            case 2:
                areaCuadrado();
                break;
            case 3:
                areaTriangulo();
                break;
            case 4:
                areaCirculo();
                break;

            default:
                System.out.println("El numero no es valido");
        }
    }

    // Calcular el area de un rectangulo
    public static void areaRectangulo() {

        double base, altura, resultado;

        System.out.println("Ingrese la base");
        base = scanner.nextInt();
        System.out.println("Ingrese la altura");
        altura = scanner.nextInt();

        resultado = base * altura;

        System.out.println("El area del rectangulo es " + resultado);

    }

    // Calcular el area de un cuadrado
    public static void areaCuadrado() {

        double lado, resultado;

        System.out.println("Ingrese la longitud de un lado");
        lado = scanner.nextInt();
        resultado = lado * lado;

        System.out.println("El area del cuadrado es " + resultado);

    }


    // Calcular el area de un Triangulo
    public static void areaTriangulo() {

        double base, altura, resultado;

        System.out.println("Ingrese la base");
        base = scanner.nextInt();
        System.out.println("Ingrese la altura");
        altura = scanner.nextInt();

        resultado = (base * altura) / 2;
        System.out.println("El area del triangulo es " + resultado);

    }

    // Calcular el area de un Circulo
    public static void areaCirculo() {

        double radio, resultado;

        System.out.println("Ingrese el radio");
        radio = scanner.nextInt();


        resultado = 3.14 * (radio * radio);

        System.out.println("El area del circulo es " + resultado);

    }
//Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
//        “Buenos dias nombre_introducido”.



    public static void saludo(){

        System.out.println("ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Buenos Días " + nombre);

    }
//Ejercicio nº14: Escribir un programa que lea un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.

//Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)

//Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.
//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2

//Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

//Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.

//Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.

//Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio

//Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
//Ejercicio nº22: Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.

/*Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo.
Los signos aritméticos disponibles son:
        +: suma los dos operandos.
        -: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.
*/

/*
Ejercicio nº23: Pide por teclado el nombre, edad y salario y muestra el salario


Si es menor de 16 no tiene edad para trabajar
Entre 19 y 50 años el salario es un 5 por ciento más
Entre 51 y 60 años el salario es un 10 por ciento más
Si es mayor de 60 el salario es un 15 por ciento más
*/
}
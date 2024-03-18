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
        //saludo();

        //Ejercicio 14
        //mulitplos();

        //Ejercicio 15
        //centiAFarenheit();

        //Ejercicio 16
        //calcularCirculo();

        //Ejercicio 17
        //kiloMetrosAMetros();

        //Ejercicio 18
        //pitagoras();

        //Ejercicio 19
        //temperatura();

        //Ejercicio 20
        //random();

        //Ejercicio 21
        //diasLaborales();

        //Ejercicio 22
        //conocerCifras();

        //Ejercicio 23
        //CalculadoraPolacaInversaApp();

        //Ejercicio 24
        

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


    public static void saludo() {

        System.out.println("ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Buenos Días " + nombre);

    }
//Ejercicio nº14: Escribir un programa que lea un número entero por teclado y obtenga y muestre por pantalla el doble y
// el triple de ese número.

    public static void mulitplos() {

        System.out.println("Ingrese un numero");
        int dato = scanner.nextInt();

        System.out.println("El numero multiplicado por 2 es " + dato * 2);
        System.out.println("El numero multiplicado por 3 es " + dato * 3);
    }


//Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
// La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)

    public static void centiAFarenheit() {
        double centigrados, farenheit;

        System.out.println("Ingrese la temperatura actual");
        centigrados = scanner.nextDouble();
        farenheit = 32 + ((9 * centigrados) / 5);

        System.out.println("La temperatura es °" + centigrados + " en centigrados o °" + farenheit + " en farenheit");


    }


//Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia
// y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.
//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2


    public static void calcularCirculo() {

        double longitud, area, radio;

        System.out.println("Ingrese el radio de la circunferencia");
        radio = scanner.nextDouble();

        // Calcular longitud de la circunferencia
        longitud = 2 * Math.PI * radio;

        //Calcular area de la circunferencia

        area = Math.PI * Math.pow(radio, 2);

        // Mostrar Resultado;

        System.out.println("El Area de la circunferencia es: " + area + "cm y la longitud de la circunferencia es: " + longitud + "cm");


    }

//Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.


    public static void kiloMetrosAMetros() {
        double metros, kilometros;
        System.out.println("Ingrese la velocidad en kilometros");
        kilometros = scanner.nextDouble();

        metros = kilometros * 1000;

        System.out.println("La velocidad de " + kilometros + "/kmh en metros es " + metros + "/mh");


    }

//Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa
// según el teorema de Pitágoras.

    public static void pitagoras() {
        double cat1, cat2, hipo = 0;
        System.out.println("Ingrese la longitud del primer cateto");
        cat1 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del primer cateto");
        cat2 = scanner.nextDouble();

        hipo = Math.pow(cat1, 2) + Math.pow(cat2, 2);
        hipo = Math.sqrt(hipo);

        System.out.println("La hipotenusa es: " + hipo);

    }

//Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.

    public static void temperatura() {


        double max = Double.NEGATIVE_INFINITY; // Inicializar el máximo con el valor mínimo posible
        double min = Double.POSITIVE_INFINITY; // Inicializar el mínimo con el valor máximo posible
        double[] temps = new double[30];
        double promedio = 0;


        for (int i = 0; i < temps.length; i++) {
            System.out.println("Ingrese la temperatura del día " + i);
            temps[i] = scanner.nextDouble();

            if (temps[i] > max) {
                max = temps[i];
            } else if (temps[i] < min) {
                min = temps[i];
            }
            promedio = promedio + temps[i];
        }

        promedio = promedio / temps.length;

        System.out.println("La temperatura promedio es " + promedio + " La temperatura maxima es " + max + " y la minima es " + min);
    }

//Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios entre esos números.
// Usa el método Math.random para generar un número entero aleatorio


    public static void random() {

        double aux;
        System.out.println("Ingrese el primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();

        for (int i = 0; i < 10; i++) {

            aux = Math.random() * (num2 - num1) + num1;
            System.out.println("Numero random " + i + "es " + aux);
        }


    }

//Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no.
// Usa un switch para ello.

    public static void diasLaborales() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el dia de la semana que desea saber si es laborable o no");
            String dia = scanner.nextLine();
            switch (dia) {
                case "Lunes":
                    System.out.println("Laborable");
                    break;
                case "Martes":
                    System.out.println("Laborable");
                    break;
                case "Miercoles":
                    System.out.println("Laborable");
                    break;
                case "Jueves":
                    System.out.println("Laborable");
                    break;
                case "Viernes":
                    System.out.println("Laborable");
                    break;
                case "Sabado":
                    System.out.println("No Laborable");
                    break;
                case "Domingo":
                    System.out.println("No Laborable");
                    break;

                default:
                    System.out.println("Ingrese un dia valido");

            }
        }


    }


//Ejercicio nº22: Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
// Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
// Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.

    public static void conocerCifras(){

        System.out.println("Ingrese un numero");
        int dato = scanner.nextInt();

        System.out.println("El numero " + dato + " tiene " + (Math.log10(dato) + 1));

    }

/*Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int)
y un signo aritmético (String), según este último se realizará la operación correspondiente.
Al final mostrara el resultado en un cuadro de diálogo.

Los signos aritméticos disponibles son:
        +: suma los dos operandos.
        -: resta los operandos.
        *: multiplica los operandos.
        /: divide los operandos, este debe dar un resultado con decimales (double)
        ^:  1º operando como base y 2º como exponente.
        %:  módulo, resto de la división entre operando1 y operando2.
*/

    public static void CalculadoraPolacaInversaApp(){

        int num1, num2;
        double resultado= -1;
        String signo;

        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese el primer numero");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            num2 = scanner.nextInt();

            System.out.println("Ingrese el signo que quiere operar \n + = suma \n - = resta \n * = mulitplicación\n / = división \n ^ = elevar el primero al segundo\n % = modulo");
            scanner.nextLine();
            signo = scanner.nextLine();

            switch (signo) {

                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                case "^":
                    resultado = Math.pow(num1, num2);
                    break;
                case "%":
                    resultado = num1 % num2;
                    break;
                default:
                    System.out.println("Ingrese un simbolo valido");

            }

            System.out.println("-----------------------------------------------");
            System.out.println("/ El resultado de su operacion es: " + resultado + "/");
            System.out.println("-----------------------------------------------");
        }
    }



/*
Ejercicio nº24: Pide por teclado el nombre, edad y salario y muestra el salario


Si es menor de 16 no tiene edad para trabajar
Entre 19 y 50 años el salario es un 5 por ciento más
Entre 51 y 60 años el salario es un 10 por ciento más
Si es mayor de 60 el salario es un 15 por ciento más
*/
}
//import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

/*
*
*       -Características de la platforma
*       -Independiente de la plataforma
*       -Orientado a pbjetos
*       -Sin punteros, alojamientos, explicitos de meoria y herencia múltiple
*       -Robusto. Detección temprana de errores.
*       -Seguro - Fuertemente prototipado, si complia va a funcionar bien
*       -Sistemas distribuidos
*       -Mulithilo - Intefaz, base de datos, request a srevidores, tarea de procesamiento
*
*       #Proceso de los archvios
*           Source Code -> Compiler (javac) -> Byte code -> JavaVirtualMachine ( interprete de OS)
*
*       Todas las variables que son con minuscula son variables nativas
*       String empieza con mayuscula entonces es una clase (tiene metodos)
*
*       Tipos de variables
*           - Estaticas o clase (dentro de la clase main)
*           - Locales (Dentro de la funcion)
*           - De instancia.
*
*       Clase Main no cumple las reglas de la POO
*
*       Operadores % Es el modulo (a % b) La difernecia en entre a / b
*
*
*       Ciclos repetitivos
*
*       # bucle for
*
*           for (int aa = 0; aa < 3; aa++){}
*
        # bucle while y do while
*
*           While (condicion){}
*
*           do {} while(Condicion);
*
*       # switch
*
*         switch (variable )
*               {
*               case 1;
*               break;
*               }
*
*
*       # Arreglos
*           int[] nombreArreglo = new int[5]
*
*           int arraySize = arrayName.length
*
*       # Salida por pantalla
*           System.out.println ("Este es el mensaje ne java")
*           Nos manejamos concatenando
*
*       # Ingreso por teclado
*
*           import java.util.Scanner;
*
*           Scanner scan = new Scanner(System.in)
*           int num = scan.nexInt();
*           scan.close();
*
*       - Se abre a principio del programam y se cierra a fin del main
*       - No hay metodos para limpiar la consola
*       - No manejos de color y sonido
* */
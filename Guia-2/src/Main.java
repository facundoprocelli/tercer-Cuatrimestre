import Modulo.Cuenta;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static Cuenta cuenta;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);


        menu();

    }


    public static void menu(){

        char rta = 's';
        float saldo = 0;
        do{

            System.out.println("Ingrese una opción para operar con la cuneta bancaria");
            opMenu();
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    cuenta = new Cuenta();
                    break;
                case 2:
                    System.out.println("Ingrese un saldo incial");
                    saldo = scanner.nextFloat();
                    cuenta = new Cuenta(saldo);
                    break;
                case 3:
                    if(cuenta != null) {
                    System.out.println("Ingrese el saldo que desea depositar");
                    saldo = scanner.nextFloat();

                        cuenta.ingresar(saldo);
                    }
                    break;
                case 4:
                    if(cuenta != null ) {
                    System.out.println("Ingrese el saldo que desea retirar");
                    saldo = scanner.nextFloat();
                        cuenta.extraer(saldo);
                    }
                    break;
                case 5:
                    if(cuenta != null) {
                      String mensaje =  cuenta.toString();
                        System.out.println(mensaje);
                    }
                    break;
                case 6:
                    cuenta = null;
                    rta = 'n';
                    break;
            }


        }while(rta == 's');



    }

    public static void opMenu() {

        System.out.println("1. Crear cuenta vacía\n" +
                "2. Crear cuenta saldo inicial\n" +
                "3. Ingresar dinero\n" +
                "4. Sacar dinero\n" +
                "5. Ver saldo\n" +
                "6. Salir\n");
    }



}
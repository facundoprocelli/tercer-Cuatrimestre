import modulo.MaquinaExprendedora;
import modulo.Boleto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scan;

    public static void main(String[] args) {
        char rta = 's';
        int op = 0;
        scan = new Scanner(System.in);

        MaquinaExprendedora maquina = new MaquinaExprendedora();

        while (rta == 's') {
            // Menu para sacer quien esta usando la maquina
            System.out.println("""
                    Menu administrador = 1
                    Menu Usuario = Otro
                    """);

            op = scan.nextInt();
            if (op == 1) {
                menuAdmin(maquina);
            } else {
                if(maquina.isEstado())
                menuUsuario(maquina);
                else System.out.println("La maquina no esta disponible");
            }


            System.out.println("Ingrese 's' para seguir");
            rta = scan.next().charAt(0);
        }
    }

    public static void menuAdmin(MaquinaExprendedora maquina) {
        char rta = 's';
        int op = 0;

        // Menu de las opciones del administrador
        do {
            System.out.println("""
                    Ingresar precio del boleto = 1
                    Cambiar rollo de voletos = 2
                    Ver Maquina = 3
                    Retirar Dinero = 4
                    Modificar Estado = 5
                    """);
            op = scan.nextInt();

            switch(op){
                case 1:
                    System.out.println("Ingrese el precio del boleto");
                    maquina.setPrecio(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese la el tamaño del nuevo rollo");
                    maquina.setCantBoletosDisponibles(scan.nextInt());
                case 3:
                    resumenMaquina(maquina);
                    break;
                case 4:
                    System.out.println(maquina.retirarDinero());
                    break;
                case 5:
                    maquina.cambiarEstado();
                    System.out.println("Estado cambiado a " + maquina.recibirEstado());

            }

            System.out.println("Ingrese 's' para seguir operando como administrador");
            rta = scan.next().charAt(0);
        }while (rta == 's');

    }


    // Funciona para que el usuario interactue con la maquina
    public static void menuUsuario(MaquinaExprendedora maquina) {

            System.out.println("El precio del boelto es" + maquina.getPrecio());

            do {
                System.out.println("-----Ingrese saldo-----\nSaldo actual =  " + maquina.getSaldo());
                maquina.introducirDinero(scan.nextDouble());
            } while (maquina.getSaldo() < maquina.getPrecio());

            Boleto miBoleto = maquina.imprimir();
            System.out.println(miBoleto.mostrarBoleto());

            System.out.println("Su vuelto es " + maquina.getVuelto());

            maquina.reiniciarVuelto();


    }

    public static void resumenMaquina(MaquinaExprendedora maquina){
        System.out.println("Boletos disponibles " + maquina.getCantBoletosDisponibles());
        System.out.println("Recaucadión " + maquina. getRecaudacion());
        System.out.println("Estado de la maquina: " + maquina.recibirEstado());
        System.out.println("Boletos vendidos: " + maquina.getBoletosVendidos());
    }
}

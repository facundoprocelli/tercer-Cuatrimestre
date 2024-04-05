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


        do {
            System.out.println("""
                    Ingresar precio del boleto = 1
                    Ver Maquina = 2
                    Retirar Dinero = 3
                    Modificar Estado = 4
                    """);
            op = scan.nextInt();

            switch(op){
                case 1:
                    System.out.println("Ingrese el precio del boleto");
                    maquina.setPrecio(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Boletos disponibles " + maquina.getCantBoletosDisponibles());
                    System.out.println("Recaucadión " + maquina. getRecaudacion());
                    System.out.println("Estado de la maquina: " + maquina.recibirEstado());
                    break;
                case 3:
                    System.out.println(maquina.retirarDinero());
                    break;
                case 4:
                    maquina.cambiarEstado();
                    System.out.println("Estado cambiado a " + maquina.recibirEstado());

            }

            System.out.println("Ingrese 's' para seguir operando");
            rta = scan.next().charAt(0);
        }while (rta == 's');

    }


    public static void menuUsuario(MaquinaExprendedora maquina) {

            System.out.println("El precio del boelto es" + maquina.getPrecio());

            do {
                System.out.println("-----Ingrese saldo-----\nSaldo actual =  " + maquina.getSaldo());
                maquina.introducirDinero(scan.nextDouble());
            } while (maquina.getSaldo() < maquina.getPrecio());

            Boleto miBoleto = maquina.imprimir();
            System.out.println(miBoleto.mostrarBoleto());

            System.out.println("Su vuelto es " + maquina.getVuelto());


    }
}

import Modelo.Cliente;
import Modelo.Cuenta;

import java.util.ArrayList;

/*
. Necesitamos crear un programa para manejar los datos de una Cuenta
bancaria de un Cliente. Para esto identificamos los atributos id, nombre
y género (M o F) para el Cliente. Por otro lado tenemos el tipo Cuenta que
 también posee un identificador, un balance y un Cliente que es el dueño
  de la cuenta. La Cuenta debe exponer los métodos depositar y extraer que
   modifican el balance de la misma. Algo a tener en cuenta es que el
    método extraer no puede extraer dinero si el balance total no lo permite,
     si esto sucede se debe imprimir un mensaje por pantalla que indique que
    la cuenta no posee saldo suficiente.

 */
public class Main {
    public static void main(String[] args) {
        String mensaje = " ";
//a. Crear un Cliente e imprimirlo en pantalla.
        Cliente cliente = new Cliente(1,"Juan", 'M');

        System.out.println(cliente);
        //b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
        Cuenta cuentaBancaria = new Cuenta(10000, cliente);


        mensaje = cuentaBancaria.extraer(10000);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.ingresar(0);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.extraer(0);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.ingresar(0);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.extraer(0);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.ingresar(0);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.extraer(0);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.ingresar(0);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.extraer(0);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.ingresar(2000);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.extraer(3000);
        System.out.println(mensaje);
        mensaje = cuentaBancaria.ingresar(0);
        System.out.println(mensaje);
        System.out.println(cuentaBancaria);



    }
}
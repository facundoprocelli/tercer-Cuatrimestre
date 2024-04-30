package Modelo;

import java.util.ArrayList;
import java.util.Arrays;


public class Cuenta {


    //Atributos
    private float balance;
    private ArrayList<String> historial;
    private Cliente cliente;

    //Constructor


    public Cuenta(float balance, Cliente cliente) {
        this.balance = balance;
        this.cliente = cliente;
        this.historial = new ArrayList<>();
    }

    // Metodos
/*
c. Realizar operaciones de depósito y extracción para probar esa funcionalidad. d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,
de máximo 2000 pesos. Esto significa que la cuenta puede aceptar un balance negativo con un máximo de - 2000. Realice los cambios y pruebas necesarias.

 */

    public String extraer(float monto){  //Recontra revisar mal
        String mensaje = "";
        if (monto <= balance + 2000){
           boolean flag =  agregarHistorial(2, monto);
           if(flag) {
               this.balance -= monto;
               mensaje = "Extracción realizada con exito";
           }
           else mensaje = "No se pueden realizar más operaciones";
        }
        return mensaje;
    }

    public String ingresar(float monto){
        String mensaje = "";
        if(monto > 0) {
          boolean flag = agregarHistorial(1, monto);
          if(flag) {
              mensaje = "Deposito realizado con exito";
              this.balance += monto;
          }else mensaje = "No se pueden realizar mas operaciones";
        }

        return  mensaje;
    }

    /*
     Analice cómo implementaría con las herramientas conocidas hasta el
momento, llevar un registro de como máximo 10 operaciones de depósito y extracción que se realizaron en la cuenta.
En donde se almacene en memoria de alguna forma la siguiente cadena de texto:
i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
ii. Extracción: "El {NombreCliente}, retiró {MontoRetirado}"

     */
    private boolean  agregarHistorial(int op, float monto){

        boolean flag = false;
        String mensaje = " ";
        if(this.historial.size() < 10){
            if(op == 1)
            {
                 mensaje = "El " + cliente.getNombre() + ", depositó " + monto;
            }
            else{
                mensaje = "El " + cliente.getNombre() + ", retiró " + monto;
            }
            this.historial.add(mensaje);
            flag = true;
        }

        return flag;
    }


    // Sobreescrituras


    @Override
    public String toString() {
        return "Cuenta{" + "balance=" + balance + ", historial=" + historial.toString() + '}';
    }
}

package Modulo;

import Exceptions.AceitunasException;

public class Controladora {

    public static void login() throws Exception { // Voy a producir una excepcion

        //int c = 0/0;

        /*
        int a = 0;
        int b = 0;
        int c;
        if((a == 0)&&(b ==0)){
            //Para mandar una excepcion de manera manual, hay que poner el throws
            Exception ex = new Exception("Son ceros no se puede dividir");
            throw ex;
        }

        c = a/b;

         */

        //throw  new AceitunasException("No le pongas aceitunas",6);
        throw  new AceitunasException("No le pongas aceitunas");
    }
}

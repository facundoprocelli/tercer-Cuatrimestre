import Modulo.Controladora;
import Modulo.Menu;

public class Main {
    public static void main(String[] args) {
        /*
        -------------------En el main no va el try y catch-----------------------
         */
        /*
        int a = 0;
        int b = 0;
        int c;

        //Try no es un método, es un boque de codigo
        //Van operaciones potencialmente inseguras
        try{
            //Esto va a tirar una ArtihmeticException
            c = a / b;
            System.out.println(c);

            //Esto va a tirar un NullPointerException
            String palabra = null;
            palabra.toLowerCase();



            // El bloque catch es un bloque de codigo con parámetros
            //Recibe la exepción que largo el try
        }catch(ArithmeticException e){ // Aca solo atrapa las excepciones aritmeticas

           // e.printStackTrace(); // imprime en la pantalla el camino de donde viene un error
            System.out.println("Ocurrió un error " + e.getMessage()); // Te dice el problema en string
        }
        catch (NullPointerException e){ // Solo atrapa las excepciones null pointer
            System.out.println("Tenes un null");
        }
        catch (Exception e){ // Atrapa todos los problemas
            //Exception es el padre de las excepciones
            System.out.println("Hay un error");
        }
        finally { //Este bloque siempre se va a ejecutar
                  //Aca van operaciones de cierre de procesos
                  // Es opcional
            System.out.println("Ya termino todo");
        }
        */

        Menu.ingrsoDeDatos();
    }
}
import Modulo.Matematicas;

public class Main {
    public static void main(String[] args) {

        Matematicas linkedList = new Matematicas();

        for (int i = 0; i < 10; i++) {
            //Math.Foor lo que hace truncar el numero a 0 decimales y el random crea numeros aleatorios entre el  y el 10
            linkedList.agregar(Math.floor(Math.random() * (10 - 1)));

        }

        System.out.println("Inicio: " + linkedList.inicio());
        System.out.println("Fin: " + linkedList.fin());

        //Lista completa
        System.out.println(linkedList);

        //Elementos
        System.out.println(linkedList.Mostrar());
    }
}
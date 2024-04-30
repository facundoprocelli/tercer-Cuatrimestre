import Modelo.CD;
import Modelo.Elemento;

public class Main {
    public static void main(String[] args) {

        CD miCD = new CD(20, "Help!");

        System.out.println(miCD.getTitulo());
        miCD.setTitulo("You know");
        System.out.println(miCD.getTitulo());

        // Principio de sustitución( donde hay un padre, se puede reemplazar por el hijo
        Elemento miElemento = new CD(1, "let it be"); // Esto es valido porque estoy guardadno
        System.out.println(miElemento.metodo());
        // Estoy guardando un tipo CD que es hijo de elemento.
        //miElemento.setTitulo(); //Aca no van a aparecer los metodos de CD, porque el metodo declarativo es el del padre     //

        mostrarElementos(miElemento);

    }

    public static void mostrarElementos(Elemento ele){

        if (ele instanceof CD){
            CD aux = (CD)ele;
            System.out.println(aux.getCantidadDeCanciones());
        }
        /*else if( ele instanceof DVD){
            DVD aux = (DVD)ele;
            System.out.println(aux);
        }

         */
    }
}
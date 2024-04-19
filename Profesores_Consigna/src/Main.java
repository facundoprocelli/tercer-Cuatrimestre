import Modulo.ListInProfesores;
import Modulo.ProfesorInterin;
import Modulo.ProfesorTitular;

public class Main {
    public static void main(String[] args) {

        ProfesorTitular p1 = new ProfesorTitular("juan", 23, "Matematica", 5);
        ProfesorTitular p2 = new ProfesorTitular("German", 56, "Compu", 5);
        ProfesorInterin p3 = new ProfesorInterin("pablo", 45, "Fisica", 5);

        ListInProfesores lista = new ListInProfesores();

        lista.cargarProfesores(p1);
        lista.cargarProfesores(p2);
        lista.cargarProfesores(p3);

        System.out.println(lista.getInfo());

        System.out.println(lista.importeTotalNominaProfesorado());


    }
}
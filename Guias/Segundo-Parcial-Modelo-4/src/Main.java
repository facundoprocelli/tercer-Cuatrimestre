import Excepciones.edadInusficienteExcepction;
import Modulo.Gestora;
import Modulo.ListaGenerica;
import Modulo.Trabajador;

public class Main {
    public static void main(String[] args) {
        Gestora gestora = new Gestora();

        ListaGenerica<Trabajador> t = gestora.cargarListaDeJSON();
        System.out.println(t);

        gestora.guardarTrabajadoresEnArchvios(t,"Developer");

        ListaGenerica<Trabajador> listaGenerica = gestora.leerArchvioTrabajadores("Developer");
        System.out.println(listaGenerica);

        try {
            ListaGenerica<Trabajador> veteranos = gestora.trabajadoresVeteranos(listaGenerica, 30);
            System.out.println(veteranos);
        } catch (edadInusficienteExcepction e) {
            System.out.println(e);
        }

    }
}
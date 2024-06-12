import Modelo.*;
import org.json.JSONException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Automovil> automovils = new ArrayList<>();

        automovils.add(new Automovil("Fiat", "Cronos", new Especificaciones(160, 300, 1400, 12.4)));
        automovils.add(new Automovil("Fiat", "Argo", new Especificaciones(140, 380, 1400, 11.3)));
        automovils.add(new Automovil("RAM", "2500", new Especificaciones(190, 400, 2000, 13.4)));

        Consecionario consecionario = new Consecionario("Facuroads", "Lavalle");

        consecionario.guardarAutosEnConsecionario(automovils);
        System.out.println(consecionario);

        try {
            consecionario.guardarAutosEnJSON(consecionario.getAutomovils());

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        ListaGenerica<Automovil> lista = consecionario.leerAutosDelJSON();
        System.out.println(lista);


        consecionario.guardarEnArchivoBinario(150);

        ListaGenerica<Automovil> listaa = consecionario.sacarDeArchivoBinario();
        System.out.println(listaa);
    }
}
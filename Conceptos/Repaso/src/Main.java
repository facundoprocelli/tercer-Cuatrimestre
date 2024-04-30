import java.util.*;

//Los comentarios son cartas de amor que nos escrbirmos para nostros mismos

        /* Nos va a tomar
        como se agrega
        como se elimina
        como verifico si existe
        como se recorre
        .add

         */

public class Main {
    public static void main(String[] args) {
/*
        //Iterar las diferetnes colecciones;

        //Arraylist
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Velez");
        stringArrayList.add("Finalista");

        //Recorrer
        for (int i = 0; i < stringArrayList.size(); i++) {
            //System.out.println(stringArrayList.get(i)); // Hay que sobreescribir el toString
        }

        for (String e : stringArrayList) {
            //System.out.println(e);
        }

        // HashSet // Los set son optimos para busqeuda no para muestra
        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("Velez");
        stringHashSet.add("finalista");

        //Iterator no tiene un orden se recorre elemento a elemento
        // HashSet indice alaetorio, no tiene orden
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            String aux = iterator.next();
            System.out.println(aux);
        }



        //ELIMINAR OBJETO
        stringHashSet.remove("velez");

*/


        //HashMap
        //El tipo de clave puede ser cualquier objeto
        HashMap<String, String> stringIntegerHashMap = new HashMap<>();

        stringIntegerHashMap.put("velez", "Finalista");
        stringIntegerHashMap.put("river", "afuera");
        stringIntegerHashMap.put("boca", "semi");


        HashMap<Integer, Date> integerDateHashMap = new HashMap<>();
        Iterator<Map.Entry<Integer, Date>> iterator1 = integerDateHashMap.entrySet().iterator();


        //El entry set pasa las dos columnas a una tabla de dispersion,
        // cuando esta en la tabla la pasamos al itrator
        //Map.Entry unifica los datos, el tipo de dato es entrada de mapa, que es lo que le pasamos al iterator
        Iterator<Map.Entry<String, String>> iteratorHashMap = stringIntegerHashMap.entrySet().iterator();


        //No es optimo mostrar un mapa
        while (iteratorHashMap.hasNext()) {
            //Se usa eso para crear una nueva variable de tipo entrada de mapa para poder trabajar con los elementos
            Map.Entry<String, String> entradaMapa = iteratorHashMap.next();
            String clave = entradaMapa.getKey(); // retorna la clave
            String valor = entradaMapa.getValue(); //retorna el valor

            System.out.println(clave + " " + valor);
        }
        // BUSCAR EN UN MAPA
        //La forma de buscar dentro de un map es con la clave
        System.out.println(stringIntegerHashMap.get("river"));


        //SABER LA CANTIDAD DE ENTRADAS DE UN MAPA

        System.out.println(stringIntegerHashMap.size());

        //ELIMINAR OBJETO
        //Se elimina por clave porque estas son unicas
        stringIntegerHashMap.remove("river");

        //Esta esta clave
        if (stringIntegerHashMap.containsKey("river"))
            System.out.println(stringIntegerHashMap.get("river"));

        //Esta este valor
        if(stringIntegerHashMap.containsValue("afuera")){
            System.out.println("asdf");
        }


 /*

        HashSet<Equipo>equipos = new HashSet<>();
        equipos.add(new Equipo("Velez", 2));
        equipos.add(new Equipo("Boxa", 1));

        System.out.println(Collections.min(equipos));
        System.out.println(Collections.max(equipos));

        /*
        //Si comento el haschode en Equipo se meten repetidos
        Iterator<Equipo> iterator = equipos.iterator();
        while (iterator.hasNext()) {
            Equipo aux = iterator.next();
            System.out.println(aux);
        }

         */
    }
}
package Modulo;

import Interface.ISistemaDeEntradas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Recital implements ISistemaDeEntradas {

    //Atributos
    private String nombre;
    private String fecha;
    private String lugar;
    private HashMap<String, HashSet<Entrada>> stringHashSetHashMap;

    //Cosntrucotr

    public Recital(String nombre, String fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.stringHashSetHashMap = new HashMap<>();
    }
//Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public HashMap<String, HashSet<Entrada>> getStringHashSetHashMap() {
        return stringHashSetHashMap;
    }


    //Metodos


    //Cargo el HashMap con los tipos de entradas que pueden haber
    public void cargarHashMap() {
        stringHashSetHashMap.put("General", new HashSet<Entrada>());
        stringHashSetHashMap.put("VIP", new HashSet<Entrada>());
    }



    //Sobreescritura para la carga de entradas
    @Override
    public void cargarEntrada(Object entrada) {

        if (entrada != null) {

            if (entrada instanceof General) {
                General aAgregar = (General) entrada;
                HashSet<Entrada> entradas = stringHashSetHashMap.get("General");

                double nuevoPrecio = (aAgregar.obtenerPrecioTotal(aAgregar.getPrecio()));
                aAgregar.setPrecio(nuevoPrecio);
                entradas.add(aAgregar);


            } else if (entrada instanceof VIP) {

                //Instancio la entrada a VIP si lo es
                VIP aAgregar = (VIP) entrada;

                //Creo un Hashset
                HashSet<Entrada> entradas = stringHashSetHashMap.get("VIP");

                //Calculo el nuevo precio llamando a la funicon de VIP
                double nuevoPrecio = (aAgregar.obtenerPrecioTotal(aAgregar.getPrecio()));
                //seteo el nuevo precio
                aAgregar.setPrecio(nuevoPrecio);
                //Agrego la entrada
                entradas.add(aAgregar);
            }
        }
    }


    //Cuantas entradas se vendieron de el tipo especificado
    @Override
    public int entradasVendidasXTipo(String entrada) {
        int cantidad = 0;

//Creo el hashset
        HashSet<Entrada> hashSetEntradas = stringHashSetHashMap.get(entrada);

        //Creo un iterator para el hashset
        Iterator<Entrada> entradaIterator = hashSetEntradas.iterator();

        while (entradaIterator.hasNext()) {
            //declaro una nueva entrada para poder acceder a sus datos
            Entrada entradactual = entradaIterator.next();

            if (!entradactual.isDisponible()) {
                //Si no esta disponible no la sumo
                cantidad++;
            }
        }

        return cantidad;
    }


    @Override
    public int entradasDisponibles() {
        int cantidad = 0;

        //Creo un iterador del tipo de Map Entry
        Iterator<Map.Entry<String, HashSet<Entrada>>> entryIterator = stringHashSetHashMap.entrySet().iterator();

        // Uso el iterador mietras tenaga elementos
        while (entryIterator.hasNext()) {


            //Creo  un tipo de dato mapEntry
            Map.Entry<String, HashSet<Entrada>> datoActual = entryIterator.next();
            // Agarro el value del mapEntry
            HashSet<Entrada> entradaHashSetAux = datoActual.getValue();


            //Cre un iterador para poder usar el hashset
            Iterator<Entrada> entradaIterator = entradaHashSetAux.iterator();

            while (entradaIterator.hasNext()) {


                //Creo una variable entrada para poder usar el next de forma segura
                Entrada entradaActual = entradaIterator.next();

                if (entradaActual instanceof General) {
                    //Si instacia es la instancia y esta dispnible la sumo
                    General aSumar = (General) entradaActual;

                    if (aSumar.isDisponible()) {
                        cantidad = cantidad + 1;
                    }
                } else if (entradaActual instanceof VIP) {
                    //si es la instancia y esta disponible la sumo
                    VIP aSumar = (VIP) entradaActual;

                    if (aSumar.isDisponible()) {
                        cantidad = cantidad + 1;
                    }

                }
            }

        }

        return cantidad;
    }


    @Override
    public double totalRecaudado() {
        double totalRecuadado = 0;

        Iterator<Map.Entry<String, HashSet<Entrada>>> entryIterator = stringHashSetHashMap.entrySet().iterator();

        // Uso el iterador mietras tenaga elementos
        while (entryIterator.hasNext()) {

            //Creo  un tipo de dato mapEntry
            Map.Entry<String, HashSet<Entrada>> datoActual = entryIterator.next();
            // Agarro el value del mapEntry
            HashSet<Entrada> entradaHashSetAux = datoActual.getValue();

            //Cre un iterador para poder usar el hashset
            Iterator<Entrada> entradaIterator = entradaHashSetAux.iterator();

            while (entradaIterator.hasNext()) {
                //Creo una variable entrada para poder usar el next de forma segura
                Entrada entradaActual = entradaIterator.next();

                if (entradaActual instanceof General) {
                    //Si es la instanca
                    General aSumar = (General) entradaActual;

                    //Si la entrad no esta disponible sumo el precio de la misma
                    if (!aSumar.isDisponible()) {
                        totalRecuadado = totalRecuadado + aSumar.getPrecio();
                    }
                } else if (entradaActual instanceof VIP) {
                    //si es la instancia
                    VIP aSumar = (VIP) entradaActual;
                    // Si la entrada no esta disponible sumo el precio de la misma
                    if (!aSumar.isDisponible()) {
                        totalRecuadado = totalRecuadado + aSumar.getPrecio();

                    }

                }
            }
        }
        return totalRecuadado;
    }

    @Override
    public String venderEntrada(String tipo, String zona) {
        boolean vendida = false;
        String mensaje = "No se consiguio la entrada";
        //A la funcion se le pasa que tipo de entrada quiere y el  lugar de la misma


        if (tipo.equals("General")) {
            //Si al entrada es de tipo general
            HashSet<Entrada> entradas = stringHashSetHashMap.get("General");
//Creo un Hashset que toma el dato que devuelve el. get de la key "General"
            Iterator<Entrada> entradaGeneralIterator = entradas.iterator();
            //Creo un iterator para poder trabajar sobre este hashSet
            while (entradaGeneralIterator.hasNext() && !vendida) {
                Entrada entradaActual = entradaGeneralIterator.next();
                // Declaro una variable para trabajr de manera correcta con el .next()

                if (entradaActual instanceof General) {
                    General entradaAVender = (General) entradaActual;
                    String zonaParaVender = entradaAVender.getZona();
                        //Si es de lainstancia que corresponder, agarro la zona para poder compararla con la zona que pidio el cliente
                    if (zonaParaVender.equals(zona)) {

                        if(entradaActual.isDisponible()) {
                            //Si esa zona esta disponible entonces la vendo
                            entradaActual.setDisponible(false);
                            vendida = true;
                            mensaje = "La entrada General: " + entradaAVender.getId() + " fue vendida por $" + entradaAVender.getPrecio();
                        }
                    }
                }
            }
        } else if (tipo.equals("VIP")) {

            HashSet<Entrada> entradas = stringHashSetHashMap.get("VIP");
            Iterator<Entrada> entradaVIPIterator = entradas.iterator();
        //Creo un Iterator y el HashSet correpsondiente
            while (entradaVIPIterator.hasNext() && !vendida) {

                //Si se puede vender creo una entrada para poder trabajar con esta
                Entrada entradaActual = entradaVIPIterator.next();
                if (entradaActual instanceof VIP) {

                    VIP entradaAVender = (VIP)entradaActual;
                    //Instancio la entrada
                    if (entradaActual.isDisponible()) {

                        //si esta disponible la vendo
                        entradaActual.setDisponible(false);
                        vendida = true;
                        mensaje = "La entrada VIP: " + entradaAVender.getId() + " fue vendida por $" + entradaAVender.getPrecio();
                    }
                }


            }
        }

        return mensaje;
    }


    @Override
    public String toString() {
        return "Recital{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", stringHashSetHashMap=" + stringHashSetHashMap +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;

        if(obj != null)
            if(obj instanceof  Recital){
                Recital aComaprar = (Recital) obj;

                if(getNombre().equals(aComaprar.getNombre())){
                    rta  = true;
                }
            }
        return rta;
    }
}

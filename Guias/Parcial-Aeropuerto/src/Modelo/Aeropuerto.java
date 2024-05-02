package Modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Aeropuerto {

    //Atributos
    private String nombre;
    private String codigo;
    private String direccion;
    private int capacidadDeOperacion;
    private HashMap<Integer, Hangar> integerHangarHashMap;

    //Constructor


    public Aeropuerto(String nombre, String codigo, String direccion, int capacidadDeOperacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.capacidadDeOperacion = capacidadDeOperacion;
        this.integerHangarHashMap = new HashMap<>(4);
    }


    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCapacidadDeOperacion() {
        return capacidadDeOperacion;
    }

    public HashMap<Integer, Hangar> getIntegerHangarHashMap() {
        return integerHangarHashMap;
    }

    //Metodos

    public void cargarHangaresEnAeropuerto(){

        integerHangarHashMap.put(1, new Hangar(1));
        integerHangarHashMap.put(2, new Hangar(2));
        integerHangarHashMap.put(3, new Hangar(3));
        integerHangarHashMap.put(4, new Hangar(4));
    }

    public int avionesTotalesEnElAeropuerto(){
        int cantidadDeAvionesTotal = 0;
        Iterator<Map.Entry<Integer, Hangar>> iterator = integerHangarHashMap.entrySet().iterator();

        while(iterator.hasNext()){

            Map.Entry<Integer, Hangar> datoActual = iterator.next();

            Hangar hangar = datoActual.getValue();
           cantidadDeAvionesTotal = cantidadDeAvionesTotal + hangar.getCantidadDeAviones();

        }
        return cantidadDeAvionesTotal;
    }

    public boolean comprobarAvion(Avion avion){
        boolean existe = false;

        if (avion != null) {
            if (avion instanceof Comercial) {
                Hangar hangar = integerHangarHashMap.get(1);
                Iterator<Avion> it = hangar.getAvionHashSet().iterator();
                while(it.hasNext()){
                    Avion av = it.next();
                    if(av.getPatente().equals(avion.getPatente())){
                        existe = true;
                    }
                }

            } else if (avion instanceof Privado) {
                Hangar hangar = integerHangarHashMap.get(2);
                hangar.agregarAvionAlHangar(avion);
                Iterator<Avion> it = hangar.getAvionHashSet().iterator();
                while(it.hasNext()){
                    Avion av = it.next();
                    if(av.getPatente().equals(avion.getPatente())){
                        existe = true;
                    }
                }

            } else if (avion instanceof Carguero) {
                Hangar hangar = integerHangarHashMap.get(3);
                hangar.agregarAvionAlHangar(avion);
                Iterator<Avion> it = hangar.getAvionHashSet().iterator();
                while(it.hasNext()){
                    Avion av = it.next();
                    if(av.getPatente().equals(avion.getPatente())){
                        existe = true;
                    }
                }
            } else if (avion instanceof Militar) {
                Hangar hangar = integerHangarHashMap.get(4);
                hangar.agregarAvionAlHangar(avion);
                Iterator<Avion> it = hangar.getAvionHashSet().iterator();
                while(it.hasNext()){
                    Avion av = it.next();
                    if(av.getPatente().equals(avion.getPatente())){
                        existe = true;
                    }
                }
            }
        }

        return existe;
    }

    public Boolean agregarAvion(Avion avion){
        boolean ingresado = false;

        boolean existe = comprobarAvion(avion);

        if(avionesTotalesEnElAeropuerto() < this.capacidadDeOperacion && !existe) {
            if (avion != null) {
                if (avion instanceof Comercial) {
                    Hangar hangar = integerHangarHashMap.get(1);
                    hangar.agregarAvionAlHangar(avion);
                    ingresado = true;

                } else if (avion instanceof Privado) {
                    Hangar hangar = integerHangarHashMap.get(2);
                    hangar.agregarAvionAlHangar(avion);
                    ingresado = true;

                } else if (avion instanceof Carguero) {
                    Hangar hangar = integerHangarHashMap.get(3);
                    hangar.agregarAvionAlHangar(avion);
                    ingresado = true;
                } else if (avion instanceof Militar) {
                    Hangar hangar = integerHangarHashMap.get(4);
                    hangar.agregarAvionAlHangar(avion);
                    ingresado = true;
                }
            }
        }
        return ingresado;
    }

public String despegarTodos(int key){
        String msj = "";

        Hangar aux = integerHangarHashMap.get(key);
        msj = aux.despegarTodos();

        return msj;
}


    //Sobreescrituras


    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", capacidadDeOperacion=" + capacidadDeOperacion +
                ", integerHangarHashMap=" + integerHangarHashMap +
                '}' + "\n";
    }


    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj != null){
            if(obj instanceof Aeropuerto){
                Aeropuerto aComaprar = (Aeropuerto) obj;

                if(getCodigo().equals(aComaprar.getCodigo())){
                    rta = true;
                }
            }
        }

        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

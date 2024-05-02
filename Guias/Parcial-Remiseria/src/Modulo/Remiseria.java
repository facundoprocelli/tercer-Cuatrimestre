package Modulo;

import java.util.HashSet;
import java.util.Iterator;

public class Remiseria {

    private HashSet<Vehiculo> vehiculoHashSet;
    private HashSet<Cliente> clienteHashSet;
    private HashSet<Viaje> viajeHashSet;

    public Remiseria() {
        this.vehiculoHashSet = new HashSet<Vehiculo>();
        this.clienteHashSet = new HashSet<Cliente>();
        this.viajeHashSet = new HashSet<Viaje>();
    }

    //Cliente

    public void agregarCliente(Cliente cliente){
        clienteHashSet.add(cliente);
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculoHashSet.add(vehiculo);
    }



    public void pedirViajeCliente(Cliente cliente){
        Viaje viaje = new Viaje();
        viaje.setCliente(cliente);
        viaje.pedirViajeCliente();
        Iterator<Vehiculo> itVehiculo = vehiculoHashSet.iterator();
        boolean flag = true;
        while (itVehiculo.hasNext() && flag){
            Vehiculo vehiculo = itVehiculo.next();

            if(vehiculo instanceof Taxi){

                Taxi taxiAProbar = (Taxi)vehiculo;
                if(taxiAProbar.isDisponibilidad()){
                    viaje.setVehiculo(taxiAProbar);
                    taxiAProbar.setDisponible(false);
                    taxiAProbar.actualizarKilometraje(viaje.getDistancia());
                    viaje.setCostoDelViaje(taxiAProbar.calcularTarifa(viaje.getDistancia()));
                    flag = false;
                }

            } else if (vehiculo instanceof  Remis) {
                Remis remisAProbar = (Remis)vehiculo;
                if(remisAProbar.isDisponibilidad()){
                    viaje.setVehiculo(remisAProbar);
                    remisAProbar.setDisponible(false);
                    viaje.calcularCostoFinalDelViaje();
                    flag = false;
                }

            }
        }

        viajeHashSet.add(viaje);
        viaje.getVehiculo().setDisponible(cliente.terminarViaje());
    }


    public String mostrarViajes(){
        String mensaje = "";

        Iterator<Viaje> viajeIterator = viajeHashSet.iterator();

        while (viajeIterator.hasNext()){
            mensaje += viajeIterator.next();
        }

        return mensaje;
    }

    public String mostrarVehiculos(){
        String mensaje = "";

        Iterator<Vehiculo> vehiculoIterator = vehiculoHashSet.iterator();

        while (vehiculoIterator.hasNext()){
            mensaje += vehiculoIterator.next();
        }
        return mensaje;
    }

    public String mostrarClientes(){
        String mensaje = "";

        Iterator<Cliente> clienteIterator = clienteHashSet.iterator();

        while (clienteIterator.hasNext()){
            mensaje += clienteIterator.next();
        }
        return mensaje;
    }


}

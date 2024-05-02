import Modulo.Cliente;
import Modulo.Remis;
import Modulo.Remiseria;
import Modulo.Taxi;

public class Main {
    public static void main(String[] args) {

        Remiseria remiseria = new Remiseria();

        Cliente cliente1 = new Cliente("Facu", "Procelli", "2235929828", "Jose ingneiros 1254");
        remiseria.agregarCliente(cliente1);
        remiseria.agregarVehiculo(new Taxi("Fiat", "Cronos", "Nafta Super", "AG567HH", 234, 300, 100));
        remiseria.agregarVehiculo(new Remis("Chevrolet", "Corsa", "Nafta Super", "CNX567", 10));

       // System.out.println(remiseria.mostrarVehiculos());
       remiseria.pedirViajeCliente(cliente1);

        System.out.println(remiseria.mostrarViajes());
       // System.out.println(remiseria.mostrarVehiculos());
        //System.out.println(remiseria.mostrarClientes());
    }
}
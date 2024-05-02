import Modelo.Aeropuerto;
import Modelo.Comercial;

public class Main {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto("Astor Piazolla", "MDQ", "Jose ingnieros 1234", 10);

        aeropuerto.cargarHangaresEnAeropuerto();

        Comercial av1 = new Comercial("747", "Boeing", 100, "RollceRoyce", 100, "ABC123",4, "Muchas Servicios" );
        Comercial av2 = new Comercial("747", "Boeing", 100, "RollceRoyce", 100, "BC123",4, "Muchas Servicios" );
       // System.out.println(av1);
        aeropuerto.agregarAvion(av1);
        aeropuerto.agregarAvion(av2);

        System.out.println(aeropuerto);

        System.out.println(aeropuerto.despegarTodos(1));
        //System.out.println(aeropuerto.avionesTotalesEnElAeropuerto());



    }
}
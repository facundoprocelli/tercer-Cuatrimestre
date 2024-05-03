import Modulo.General;
import Modulo.Recital;
import Modulo.VIP;

public class Main {
    public static void main(String[] args) {

                                                                                                        //Que fecha rara profe, pero como lo dice la consigna lo pongo
        Recital recital = new Recital("El recital más Gonzalo que el mismo Gonzalo", "(Es este domingo así que atentos porque el martes tenemos el otro parcial y debo arribar a Mar del Plata con una sonrisa", "Santiago del Estero, entre Chiki Tapia [Censored] y la [Censored]");
        recital.cargarHashMap();

        recital.cargarEntrada(new VIP(1, 10, "Comida y bebida gratis"));
        recital.cargarEntrada(new VIP(2, 10, "Comida y bebida gratis"));
        recital.cargarEntrada(new VIP(3, 10, "Comida y bebida gratis"));
        recital.cargarEntrada(new General(1,3, "Campo"));
        recital.cargarEntrada(new General(2,7, "Platea"));
        recital.cargarEntrada(new General(3,5, "Codo"));

        // Muestro toda la informacion del recital

        System.out.println(recital);

        //Muestro la cantidad de entradas disponibles
        int entradasDisponibles = recital.entradasDisponibles();
        System.out.println("Cantidad de entradas Disponibles : " + entradasDisponibles);

        //Vendo una entrada (Las entradas VIP son simepre en zona palco)

        System.out.println(recital.venderEntrada("VIP", "palco"));

        //Vendo entradas de General (Zona Campo y zona Platea)
        System.out.println(recital.venderEntrada("General", "Campo"));
        System.out.println(recital.venderEntrada("General", "Platea"));

        //Trato de vender una entrada que no esta disponible
        System.out.println(recital.venderEntrada("General", "Platea"));


        //Muestro las entradas actuales disponibles
        int entradasActaulmenteDisponibles = recital.entradasDisponibles();
        System.out.println("La cantidad de entradas disponibles en este momento es de: " + entradasActaulmenteDisponibles);

        //Cuantas entradas se vendieron del tipo VIP
        int entradasVIPVendidas = recital.entradasVendidasXTipo("VIP");
        int entradasGeneralesVendidas = recital.entradasVendidasXTipo("General");
        System.out.println( "Entradas Generales vendidas: " + entradasGeneralesVendidas + "\nEntradas VIP Vendidas: " +  entradasVIPVendidas);


        //Muestro cual es la recaudacion total
        double recaudacionTotal = recital.totalRecaudado();
        System.out.println("La recaudacion total del evento : " + recital.getNombre() + " es de: $" + recaudacionTotal);



    }
}
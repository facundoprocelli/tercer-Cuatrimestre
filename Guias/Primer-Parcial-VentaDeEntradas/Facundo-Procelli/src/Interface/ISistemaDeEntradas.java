package Interface;

public interface ISistemaDeEntradas {

    void cargarEntrada(Object entrada); // Cargo una entrada al hashmap
    int entradasVendidasXTipo(String entrada); // Cuanto los entradas vendidas por el tipo que me pasan
    int entradasDisponibles(); //recorro todas las entradas y sumo  las que estan disponibles
    double totalRecaudado(); // recorro todas las entradas sumando el precio
    String venderEntrada(String tipo, String lugar); // Recibo el lugar y el tipo de entrada y compruebo si la puedo vender

}

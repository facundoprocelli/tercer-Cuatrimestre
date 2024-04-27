/*
Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un método que permita imprimir por pantalla
 los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
a. Inicialice el objeto con los atributos necesarios
b. Imprima por pantalla el objeto inicializado.

 */

import Modelo.ItemDeVenta;

public class Main {
    public static void main(String[] args) {
        ItemDeVenta item = new ItemDeVenta(2,"Muy bueno", 45, 12.50);


        System.out.println(item);

        System.out.println(" El precio todal por las unidades es: " + item.precioTotal(20));
    }
}
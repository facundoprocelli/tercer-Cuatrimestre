import Modelo.*;

public class Main {
    public static void main(String[] args) {

        GestorDeJuego a = new GestorDeJuego();

        a.agregarPersonaje(new Joel(5,6,"joel", "Deportivo", 78, "El mata Bicho", 4, 5));
        a.agregarPersonaje(new Ellie(4,8,"Ellie", "Elegante", 100, "AK 47", 10, 5));
        a.agregarPersonaje(new Corredores(9,10,"El Corrido", "Chasqueador 1", 100, "Dientes", 10));
        a.agregarPersonaje(new Chasqueadores(4,8,"El Chaska", "Chasqueador 4", 100, "Chasquidos bionicos", 10));
        a.agregarPersonaje(new Acechadores(9,10,"El irrespetuoso", "Huesos", 100, "ojolojos", "Largo alcance"));
        a.agregarPersonaje(new Gordinflones(1,9,"Fatty", "XXXXXXL", 100, "Grasa", 10));


        a.agregarObjeto(new Muro (1,9,100, 34, 10));
        a.agregarObjeto(new Plataforma (56,12,10, 100, "Metal","Metal mas duro"));


        System.out.println(a);


    }
}
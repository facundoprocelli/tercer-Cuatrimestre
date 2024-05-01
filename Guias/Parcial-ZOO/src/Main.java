import Modulo.Ave;
import Modulo.GestorDeZoo;
import Modulo.Mamifero;
import Modulo.Reptil;

public class Main {
    public static void main(String[] args) {

        GestorDeZoo gestorDeZoo = new GestorDeZoo();

        gestorDeZoo.agregar(new Ave("Gorrion", "Gorrionus supucus", 10, "estupendo", "PlumajeGOd", false));
        gestorDeZoo.agregar(new Ave("Paloma", "Palomus sups", 2, "malo", "plumaje brilloso", false));
        gestorDeZoo.agregar(new Reptil("Iguana", "Lagartus mingunki", 23, "regular", "brillosa", true));
        gestorDeZoo.agregar(new Reptil("Lagarto", "Lagarota Noma", 100, "estupendo", "pibchuda", false));
        gestorDeZoo.agregar(new Mamifero("Delfin", "Delfinus simis", 23, "malo", "escamas", "Nadar"));
        gestorDeZoo.agregar(new Mamifero("Mono", "Chimpansus", 12, "estupendo", "pelo", "Hacer pozo, usar herramientas basicas"));


        System.out.println(gestorDeZoo);

        System.out.println(gestorDeZoo.buscarXEspecie("Paloma"));

        System.out.println(gestorDeZoo.contar());

        gestorDeZoo.eliminarXNombre("Chimpansus");

        System.out.println(gestorDeZoo);
    }
}
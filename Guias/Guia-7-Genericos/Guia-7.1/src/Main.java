import Modulo.Almacenamiento;
import Modulo.Botellas;
import Modulo.Ropa;

public class Main {
    public static void main(String[] args) {

        //Creo una caja de botellas
        Almacenamiento<Botellas> caja = new Almacenamiento<>();
        //Creo las botellas
        Botellas bot1 = new Botellas(12,"Corcho");
        Botellas bot2 = new Botellas(15,"Tapon");
        Botellas bot3 = new Botellas(17,"Tapa");
        //Agrego las botellas
        caja.agregar(bot1);
        caja.agregar(bot2);
        caja.agregar(bot3);
        //Busco la botella1 == true
        System.out.println(caja.buscar(bot1));
        //Elimino la botella1
        caja.eliminar(bot1);
        //Busco la botella1 == false
        System.out.println(caja.buscar(bot1));




        ///Creo un almacenamiento de ropa
        Almacenamiento<Ropa> ropero = new Almacenamiento<>();
        //Creo diferentes prendas
        Ropa ropa1 = new Ropa("Roja", "XL");
        Ropa ropa2 = new Ropa("Naranja", "L");
        Ropa ropa3 = new Ropa("Azul", "S");
        //Guardo las prendas en el ropero
        ropero.agregar(ropa1);
        ropero.agregar(ropa2);
        ropero.agregar(ropa3);
        //Busco ropa1 == true
        System.out.println(ropero.buscar(ropa1));
        //Elimino ropa 1
        ropero.eliminar(ropa1);
        // Busco ropa 1 = false
        System.out.println(ropero.buscar(ropa1));

    }
}
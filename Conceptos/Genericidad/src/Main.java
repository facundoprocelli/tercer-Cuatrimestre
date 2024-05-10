import Modulo.Botella;
import Modulo.CajaDeSeguridad;
import Modulo.CarritoDeCompra;
import Modulo.Contenedor;

public class Main {
    public static void main(String[] args) {

        //Caso 0
//        Contenedor<CajaDeSeguridad> cajasDeSeguridad = new Contenedor<>();
//        cajasDeSeguridad.agregar(new CajaDeSeguridad(123,"SecuritySystem"));
//        System.out.println(cajasDeSeguridad);

/*
        //Caso 1 Mantiene la genericidad de la clase padre
        **Se puede agregar literalmente cualquier cosa

    //public class CajaDeSeguridad extends Contenedor
        CajaDeSeguridad caja = new CajaDeSeguridad(123, "pipo");
        caja.agregar(123);
        caja.agregar("dato");
        caja.agregar(new CajaDeSeguridad(1234, "SecurityPlus"));
        System.out.println(caja);

 */

        //Caso 2 Restringe la genericidad
        //public class CajaDeSeguridad <T extends IValorable>extends Contenedor

        CajaDeSeguridad caja = new CajaDeSeguridad<>(1, "Las cajas de pipo tiene");
        caja.agregar(new CajaDeSeguridad<>(12345, "dato"));
        caja.agregar(new Botella());
        caja.agregar(new Botella());
        caja.agregar(new Botella());
        caja.agregar(new CarritoDeCompra(12, "asdf"));
        System.out.println(caja);

        /*
        //Caso 3 No es generica y especifica el tipo concreto
        //public class CajaDeSeguridad extends Contenedor<String>
        CajaDeSeguridad caja = new CajaDeSeguridad(123, "Secure");
        caja.agregar("Hola");
        caja.agregar("Chau");
        caja.agregar("Pip");
        System.out.println(caja);

         */

        }
}
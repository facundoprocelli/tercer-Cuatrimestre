import Modulo.EAsalariado;
import Modulo.EComision;
import Modulo.Empleado;
import Modulo.Gestora;

public class Main {
    public static void main(String[] args) {


        Gestora gestora = new Gestora();


        Empleado emp1 = new EAsalariado("569587A","Javier", "Gomez",  2024-2008, 1225);
        Empleado emp2 = new EComision("695235B", "Eva", "Nieto", 2024-2010, 170, 8.1);
        EAsalariado emp3 = new EAsalariado();
        gestora.agregar(emp1);
        gestora.agregar(emp2);
        emp3.setSalarioFijo(1155);
        emp3.setAntiguedad(2024-2010);
        emp3.setDNI("896325D");
        emp3.setApellido("Nuñez");
        emp3.setNombre("Maria");
        gestora.agregar(emp3);

        EComision emp4 = new EComision();
        emp4.setClientesCaptados(81);
        emp4.setAntiguedad(2024-2012);
        emp4.setMontoXCliente(7.9);
        emp4.setApellido("Ruiz");
        emp4.setNombre("Jose");
        emp4.setDNI("741258C");
        gestora.agregar(emp4);

        System.out.println(gestora);

        gestora.actualizarSueldos();
        System.out.println(gestora);

        System.out.println("El mayor sueldo es : " + gestora.sueldoMayor());

    }
}
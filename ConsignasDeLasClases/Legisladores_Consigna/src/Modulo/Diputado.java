package Modulo;

public class Diputado extends Legislador{


    public Diputado(String nombre, int edad, String provinicaQueRepresenta, String partidoPolitico, int numeroDeBanca) {
        super(nombre, edad, provinicaQueRepresenta, partidoPolitico, numeroDeBanca);
    }

    @Override
    public String getCamaraQueTrabaja() {
        return "Diputados";
    }
}

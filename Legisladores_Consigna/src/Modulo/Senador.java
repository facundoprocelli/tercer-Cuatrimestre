package Modulo;

public class Senador extends  Legislador{

    public Senador(String nombre, int edad, String provinicaQueRepresenta, String partidoPolitico, int numeroDeBanca) {
        super(nombre, edad, provinicaQueRepresenta, partidoPolitico, numeroDeBanca);
    }

    @Override
    public String getCamaraQueTrabaja() {
        return "Senadores";
    }
}

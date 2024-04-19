package Modulo;

public abstract class Legislador extends Persona{

    //Atributos
    String provinicaQueRepresenta;
    String partidoPolitico;
    int numeroDeBanca;

    //Constructor

    public Legislador(String nombre, int edad, String provinicaQueRepresenta, String partidoPolitico, int numeroDeBanca) {
        super(nombre, edad);
        this.provinicaQueRepresenta = provinicaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numeroDeBanca = numeroDeBanca;
    }


    //Getters y Setters

    public int getNumeroDeBanca() {
        return numeroDeBanca;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getProvinicaQueRepresenta() {
        return provinicaQueRepresenta;
    }


    //Metodos

    public abstract String getCamaraQueTrabaja();

    public String getInfo(){

        return super.getInfo() + "\nProvinica que representa: " + getProvinicaQueRepresenta() + "\nPartido politico: " + getPartidoPolitico() + "\nNumero de banca: " + getNumeroDeBanca() + "\nCamara en la que Trabaja: " + getCamaraQueTrabaja();
    }


}

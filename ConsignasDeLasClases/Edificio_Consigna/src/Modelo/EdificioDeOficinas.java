package Modelo;

public class EdificioDeOficinas extends Edificio {

    //Atributos
    private int nDeOficinas;

    //Constructores

    public EdificioDeOficinas(double superficie, int nDeOficinas) {
        super(superficie);
        this.nDeOficinas = nDeOficinas;
    }


    //Getters y Setters

    public int getnDeOficinas() {
        return nDeOficinas;
    }



    //Metodos


    public String mostrarDatos(){

        return super.mostrarDatos() +  " y tiene " + getnDeOficinas() + " oficinas";
    }
}

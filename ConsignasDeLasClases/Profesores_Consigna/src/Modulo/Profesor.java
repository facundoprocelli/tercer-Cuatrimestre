package Modulo;

public abstract class Profesor extends Persona{


    //Atributos
    private String materia;
    private int canitidadDeClases;

//Constructor

    public Profesor(Profesor profe){
        super(profe.getNombre(), profe.getEdad());
        this.materia = profe.getMateria();
        this.canitidadDeClases = profe.getCanitidadDeClases();
    }

    public Profesor(String nombre, int edad, String materia, int canitidadDeClases) {
        super(nombre, edad);
        this.materia = materia;
        this.canitidadDeClases = canitidadDeClases;
    }

    //Getters y Setters

    public int getCanitidadDeClases() {
        return canitidadDeClases;
    }

    public String getMateria() {
        return materia;
    }


    //Metodos

    public abstract int calcularSueldo();


    public String getInfo(){

        return super.getInfo() + "\nMateria: " + getMateria() + "\nCantidad de Clases: " + getCanitidadDeClases() + "\nSueldo "+ calcularSueldo();
    }

}

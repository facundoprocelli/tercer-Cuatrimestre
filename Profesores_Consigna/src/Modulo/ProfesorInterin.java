package Modulo;

public class ProfesorInterin extends Profesor{

    public ProfesorInterin(String nombre, int edad, String materia, int canitidadDeClases) {
        super(nombre, edad, materia, canitidadDeClases);
    }

    public int calcularSueldo(){
        return (getCanitidadDeClases() * 3) * 1000;
    }

}

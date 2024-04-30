package Modulo;

public class ProfesorTitular extends Profesor{
    public ProfesorTitular(String nombre, int edad, String materia, int canitidadDeClases) {
        super(nombre, edad, materia, canitidadDeClases);
    }

    @Override
    public int calcularSueldo() {
        return (getCanitidadDeClases() * 3) * 800;
    }
}

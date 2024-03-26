package modelo;

public class Estudiante {

    private String nombre; // Almacena el nombre del estudiante
    private int edad; // Almacena la edad del estudiante
    private double[] calificaciones; // Array de tipo double que almacena las calificaciones del estudiante
    private int pos;


    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.calificaciones = new double[5];
        this.pos = 0;
    }
    public Estudiante(String p_nombre, int p_edad, double[] p_calificaciones, int p_pos) {
        this.nombre = p_nombre;
        this.edad = p_edad;
        this.calificaciones = p_calificaciones;
        this.pos = p_pos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void ingresarCalificacion(double p_calificación){
        this.calificaciones[pos] = p_calificación;
        this.pos++;
    }

    public double obtenerPromedio(){
        double resultado = 0;
        for (int i = 0; i < this.calificaciones.length; i++){
            resultado += this.calificaciones[i];
        }
        return resultado / this.calificaciones.length;
    }

    public String imprimirInformacion(){

        return getNombre() + " tiene " + getEdad() + " años, y un promedio de " + obtenerPromedio();
    }

}

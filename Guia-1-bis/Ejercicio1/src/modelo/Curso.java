package modelo;

public class Curso {

    private String nombre; // Nombre del curso;
    private Estudiante[] estudiantes; // Arreglo que almacena estudiantes
    private int pos;

    public Curso() {
        this.nombre = "Curso sin nombre";
        this.estudiantes = new Estudiante[3];
        this.pos = 0;
    }

    public Curso(String p_nombre, Estudiante[] p_estudiantes, int p_pos) {
        this.nombre = p_nombre;
        this.estudiantes = p_estudiantes;
        this. pos = p_pos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Metodos

    public void agregarEstudiante(Estudiante estudiante){

        this.estudiantes[pos] = estudiante;
        this.pos++;

    }

    public double obtenerPromedioGeneral(){

        double promedio = 0;
        for (int i = 0; i < estudiantes.length; i++){ // Creo un for para recorrer el arreglo estudiantes

          promedio +=  estudiantes[i].obtenerPromedio(); // Hago que promedio vaya incrementado
            // mientras llamo al metodo obtenerPromedio(), en la posicion actual del arreglo
        }

        return promedio / estudiantes.length; // retorno el promedio general, dividiendo la suma de los promedios
                // por la cantidad de estudiantes

    }

    public String imprimirEstudiantes(){
        String mensaje = "";
        for(int i = 0; i < estudiantes.length; i++){
            mensaje += estudiantes[i].imprimirInformacion() + "\n";
        }
        return  mensaje;
    }

}

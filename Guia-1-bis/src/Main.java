import modelo.Curso;
import modelo.Estudiante;

import java.util.Scanner;

public class Main {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        Curso[] cursos = new Curso[1];

        for(int i = 0; i < cursos.length; i++){
            Curso cursito = new Curso();
            cargarCursos(cursito);
            cursos[i] = cursito;
        }

        for (int k = 0; k < cursos.length; k++){
            System.out.println("------- " + cursos[k].getNombre() + " -------");
            System.out.println(cursos[k].imprimirEstudiantes());
            System.out.println("El promedio general es: " + cursos[k].obtenerPromedioGeneral());
        }
    }

    public static void cargarCursos(Curso cursos) {


        System.out.println("Ingrese el nombre del curso");
        cursos.setNombre(scan.nextLine());

        for (int k = 0; k < cursos.getEstudiantes().length; k++) {

            Estudiante estudiante = new Estudiante();
            estudiante = cargarEstudiante();
            cursos.agregarEstudiante(estudiante);
        }


    }


    public static Estudiante cargarEstudiante() {


        Estudiante estudiante = new Estudiante();
        System.out.println("Ingrese el nombre del estudiante");
        estudiante.setNombre(scan.nextLine());
        System.out.println("Ingrese la edad del estudiante");
        estudiante.setEdad(scan.nextInt());

        for (int k = 0; k < estudiante.getCalificaciones().length; k++) {
            System.out.println("Ingrese una calificación");
            estudiante.ingresarCalificacion(scan.nextDouble());
        }
        scan.nextLine();

        return estudiante;
    }
}
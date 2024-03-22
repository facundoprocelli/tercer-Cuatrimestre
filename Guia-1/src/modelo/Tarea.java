package modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tarea {

    private String nombreTarea;
    private Calendar calendario;
    private int importancia; // 0 Sin fecha asignadas/ 1 muy importante 3 muy importante


    public Tarea() {
        this.nombreTarea = "Tarea sin nombre";
        this.calendario = Calendar.getInstance();
        this.importancia = 0;
    }

    public Tarea(String nombreTarea, Calendar calendario, int importancia) {
        this.nombreTarea = nombreTarea;
        this.calendario = Calendar.getInstance();
        this.importancia = importancia;
    }


    //Getters


    public int getImportancia() {
        return importancia;
    }

    public Calendar getCalendario() {
        return calendario;
    }


    public String getNombreTarea() {
        return nombreTarea;
    }


    //Setters


    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

// Metodos

    // Getter de el calendario formateado para poder mostrarlo de manera correcta
    public String getCalendarioFormateado() {
        // Creo un dato de tipo SimpleDateFormat y la formateo en dd/MM/yyyy
        SimpleDateFormat formatoSimpleFecha = new SimpleDateFormat("dd/MM/yyyy");

        // Creo el string y formateo el la fecha calendario a String
        String fechaFormateada = formatoSimpleFecha.format(calendario.getTime());

        // retorno el string
        return fechaFormateada;
    }

    public String getTarea() {
        return "La tarea " + getNombreTarea() + " tiene una importancia de " + getImportancia() + " y vence el " + getCalendarioFormateado();
    }


}

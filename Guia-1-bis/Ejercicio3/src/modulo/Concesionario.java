package modulo;

public class Concesionario {

    private String nombre;
    private Coche[] cochesDisponibles;
    private int pos;

    public Concesionario(){
        this.nombre = "Sin nombre";
        this.cochesDisponibles = new Coche[3];
    }

    public Concesionario(String p_nombre, Coche[] p_cochesDisponibles) {
        this.nombre = p_nombre;
        this.cochesDisponibles = p_cochesDisponibles;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche[] getCochesDisponibles() {
        return cochesDisponibles;
    }

    public void setCochesDisponibles(Coche[] cochesDisponibles) {
        this.cochesDisponibles = cochesDisponibles;
    }

    public void agregarCoche(Coche coche){

        this.cochesDisponibles[pos] = coche;
        this.pos++;
    }

    public String mostrarCochesDisponibles(){
        String mensaje = "";

        for (int i = 0; i < cochesDisponibles.length; i++){
            mensaje += cochesDisponibles[i].obtenerInformacion() + "\n";
        }

        return mensaje;
    }

    public String mostrarCochesDisponiblesReducido(){

        String mensaje = "";
        for (int i = 0; i < cochesDisponibles.length; i++){
            mensaje += cochesDisponibles[i].obtenerInformacionReducida() + "\n";
        }

        return mensaje;

    }


}

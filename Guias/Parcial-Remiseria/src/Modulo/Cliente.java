package Modulo;

public class Cliente {


    //Atributos
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    //Construcotr

    public Cliente(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //Getters Y Setters


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    // Metodos

    public double pedirViaje(){
        //retorna un numero random de la distancia del viaje
        return Math.floor(Math.random() * (10 - 1));
    }

    public boolean terminarViaje(){
        return false;
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj != null){
            if(obj instanceof Cliente){
                Cliente aComparar = (Cliente) obj;
                if(getApellido().equals(aComparar.getApellido()) && getNombre().equals(aComparar.getNombre())){
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

package Modulo;

public class Reptil extends  Animal{

    //Atributos
    private String tipoDeEscama;
    private boolean venenoso;

    //Construcotres

    public Reptil(String especie, String nombre, int edad, String estadoDeSalud, String tipoDeEscama, boolean venenoso) {
        super(especie, nombre, edad, estadoDeSalud);
        this.tipoDeEscama = tipoDeEscama;
        this.venenoso = venenoso;
    }

    public Reptil(){
        super();
        this.tipoDeEscama = "Sin tipo de escamas";
        this.venenoso=false;
    }

    //Getters y Setters


    public String getTipoDeEscama() {
        return tipoDeEscama;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    //Metodos

    //Sobreescrituras


    @Override
    public int calcularValoracion() {
        int valoracion = 10;

        if (getEstadoDeSalud().equals("malo")) {

            valoracion = valoracion *3;
        }
        setValoracion(valoracion);
        return valoracion;
    }

    @Override
    public String toString() {
        return super.toString() +"Reptil{" +
                "tipoDeEscama='" + tipoDeEscama + '\'' +
                ", venenoso=" + venenoso +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj != null){
            if(obj instanceof Reptil){
                Reptil aComparar = (Reptil) obj;

                if(getNombre().equals(aComparar.getNombre())){
                    rta = true;
                }
            }
        }

        return rta;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

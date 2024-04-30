package Modelo;

public class Plataforma extends Objeto {

    //Atributos
    private String material;
    private  String soporte;

    // Constructores

    public Plataforma(int posicionX, int posicionY, double ancho, double alto, String material, String soporte) {
        super(posicionX, posicionY, ancho, alto);
        this.material = material;
        this.soporte = soporte;
    }
    public Plataforma(){
        super();
        this.material = "sin material";
        this.soporte = "Sin soporte";
    }


    //Metodos

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Plataforma{" +
                "material='" + material + '\'' +
                ", soporte='" + soporte + '\'' +
                '}';
    }
}

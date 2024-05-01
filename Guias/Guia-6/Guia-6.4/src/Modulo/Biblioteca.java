package Modulo;

public abstract class  Biblioteca {
    //Atributos
    private String codigo;
    private  String titulo;
    private  int anioDePublicacion;

    //Constructores

    public Biblioteca(String codigo, String titulo, int anioDePublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioDePublicacion = anioDePublicacion;
    }


    //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    //Metodos

    public abstract int cuandoSePublico();

    public abstract String getCodigoDeLeible();



    //sobreescrituras


    @Override
    public String toString() {
        return "Biblioteca{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioDePublicacion=" + anioDePublicacion +
                '}';
    }
}

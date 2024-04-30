import Modulo.Autor;
import Modulo.Libro;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(autor);
        Libro libro = new Libro("Effective Java", 450, 150, autor);
        System.out.println(libro);
        libro.modificarPrecio(500);
        libro.agregarStock(50);
        System.out.println(libro.getAutor().toString());
        System.out.println(libro.mensajeEspecial());
    }
}
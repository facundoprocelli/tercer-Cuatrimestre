import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "documento.pdf";

        try {
            // Crear un escritor de PDF
            PdfWriter writer = new PdfWriter(nombreArchivo);

            // Crear un documento PDF
            PdfDocument pdf = new PdfDocument(writer);

            // Crear un documento iText
            Document documento = new Document(pdf);

            // Agregar contenido al documento
            documento.add(new Paragraph("¡Hola, este es un documento PDF generado desde Java con iText!"));

            // Cerrar el documento
            documento.close();

            System.out.println("El PDF se ha generado correctamente.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: No se pudo encontrar el archivo.");
            e.printStackTrace();
        }
    }
}
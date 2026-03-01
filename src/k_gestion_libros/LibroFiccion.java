package k_gestion_libros;

// Subclase LibroFiccion
/**
 * Representa un libro de ficción.
 */
public class LibroFiccion extends Libro {
    public LibroFiccion(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
    }

    @Override
    public String getDetalles() {
        return "Ficción: " + titulo + " por " + autor + ", " + anioPublicacion;
    }
}
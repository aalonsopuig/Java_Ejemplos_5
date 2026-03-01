package k_gestion_libros;

// Subclase LibroNoFiccion
/**
 * Representa un libro de no ficción.
 */
public class LibroNoFiccion extends Libro {
    public LibroNoFiccion(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
    }

    @Override
    public String getDetalles() {
        return "No Ficción: " + titulo + " por " + autor + ", " + anioPublicacion;
    }
}

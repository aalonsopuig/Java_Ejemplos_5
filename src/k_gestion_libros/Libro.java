package k_gestion_libros;

// Clase abstracta Libro
/**
 * Clase abstracta que representa un libro.
 * Proporciona los atributos y métodos comunes para todos los tipos de libros.
 */
public abstract class Libro {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Devuelve los detalles del libro.
     * Este método debe ser implementado por las subclases.
     */
    public abstract String getDetalles();

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
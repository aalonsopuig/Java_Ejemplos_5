package Examen_Final;

/**
 * Clase LibroFiccion que hereda de la clase abstcata, para especificar sus funciones
 */
public class LibroFiccion extends Libro{

	/**
	 * Metodo de la clase abstracta
	 */
	@Override
	public String visualizarLibro() {
		
		return "Libro de Ficcion: "+ getTitulo() + " autor, "+ getAutor()+ " año " + getAno();
	}

}

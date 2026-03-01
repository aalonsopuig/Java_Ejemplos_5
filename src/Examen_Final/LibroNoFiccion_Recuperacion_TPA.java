package Examen_Final;

/**
 * Clase LibroNoFiccion que hereda de la clase abstcata, para especificar sus funciones
 */
public class LibroNoFiccion extends Libro {

	/**
	 * Metodo de la clase abstracta
	 */
	@Override
	public String visualizarLibro() {
		
		return "Libro de NO Ficcion: "+ getTitulo() + " autor, "+ getAutor()+ " año " + getAno();
	}

}

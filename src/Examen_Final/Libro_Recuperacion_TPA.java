package Examen_Final;
/**
 * Clase abstcata Libro, donde se realizara get y set necesarios y declaracion metoos abstractos
 */
public abstract class Libro {
	/**
	 * Metodo abstracto que se realzar en las clases heredadas
	 */
	public abstract String visualizarLibro();

	/**Atributos mínimos necesarios
	 * 
	 */
	protected String titulo;
	protected String autor;
	protected String ano;

	/**
	 * Obtiene el nombre del destino.
	 * @return El Titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Establecer el valor para titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Obtiene el nombre del destino.
	 * @return El nombre del autor.
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Establecer el valor para autor
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * Obtiene el nombre del destino.
	 * @return El año
	 */
	public String getAno() {
		return ano;
	}
	
	/**
	 * Establecer el valor para el año
	 * @param año
	 */
	public void setAno(String año) {
		this.ano = año;
	}


}


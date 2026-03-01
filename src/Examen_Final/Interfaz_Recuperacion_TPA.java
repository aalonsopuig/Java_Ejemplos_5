package Examen_Final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Clase interfaz, dondde se encuentar toda la estructira de la venta
 */
public class Interfaz extends Libro  implements ActionListener {

	/** Crea y configura ventana */
	private JFrame frame;

	/** Text area donde se mostrara lo que s evaya escribiendo*/
	private JTextArea areaTexto;

	/** Campo de texto en el que se escribe el autor, libro y año */
	private JTextField textoAutor,textoTitulo,textoAño;

	/**
	 * Botones para realizar las acciones
	 */
	private JButton btnAgregarFiccion, bntAgregarNo;

	//Para diferenciar los botones
	private int n;

	public Interfaz() {

		frame = new JFrame();
		frame.setTitle("Gestion LIbros");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 550, 300); // (pos_pantalla(x,y), size(x,y))

		// Crear el panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// Crear los ocmponentes

		JLabel titulo = new JLabel("Título: ");
		titulo.setBounds(30, 20, 50, 17);
		panel.add(titulo);

		textoTitulo = new JTextField("");
		textoTitulo.setBounds(70, 20, 200, 17);
		panel.add(textoTitulo);

		JLabel autor = new JLabel("Autor: ");
		autor.setBounds(280, 20, 50, 17);
		panel.add(autor);

		textoAutor = new JTextField("");
		textoAutor.setBounds(340, 20, 160, 17);
		panel.add(textoAutor);

		JLabel año = new JLabel("Año: ");
		año.setBounds(50, 50, 50, 17);
		panel.add(año);

		textoAño = new JTextField("");
		textoAño.setBounds(90, 50, 50, 17);
		panel.add(textoAño);

		btnAgregarFiccion = new JButton("Agregar Libro de Ficción");
		btnAgregarFiccion.setBounds(150, 50, 150, 17);
		panel.add(btnAgregarFiccion);
		btnAgregarFiccion.addActionListener(this);

		bntAgregarNo = new JButton("Agregar Libro de  NO Ficción");
		bntAgregarNo.setBounds(310, 50, 150, 17);
		panel.add(bntAgregarNo);
		bntAgregarNo.addActionListener(this);

		areaTexto = new JTextArea("");
		areaTexto.setBounds(130, 80, 350, 100);
		areaTexto.setEditable(false);

		// Crear el scroll para el textArea
		JScrollPane scroll = new JScrollPane(areaTexto);
		scroll.setBounds(110, 80, 350, 150);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel.add(scroll);

		frame.getContentPane().add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}


	/**
	 * Implementación del método de la interfaz ActionListener.
	 * Acciones realizadas al presionar los botones.
	 * @param e evento de accion.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAgregarFiccion) {
			n = 1;
			areaTexto.setText(areaTexto.getText() + visualizarLibro()+ '\n' ); //Añadir los contenidos
		} else if (e.getSource() == bntAgregarNo){
			n = 2;
			areaTexto.setText(areaTexto.getText() + visualizarLibro()+ '\n' ); //Añadir los contenidos
		}
	}

	/**
	 * Implementación del método abstracto de la clase Libro
	 */

	@Override
	public String visualizarLibro() {
		// TODO Auto-generated method stub
		if(n == 1) {
			setTitulo("Libro de Ficcion: "+textoTitulo.getText() );
			setAutor("autor, " + textoAutor.getText() );
			setAno(textoAño.getText());
		}else if(n == 2) {
			setTitulo("Libro de NO Ficcion: "+textoTitulo.getText());
			setAutor("autor, " + textoAutor.getText());
			setAno(textoAño.getText());
		}
		return getTitulo() + getAutor() + getAno();
	}
}

package k_gestion_libros;

// Clase de la interfaz de usuario
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interfaz de usuario para la gestión de libros.
 */
public class Interfaz extends JFrame {
    private List<Libro> libros;
    private JTextArea areaLibros;
    private JTextField campoTitulo;
    private JTextField campoAutor;
    private JTextField campoAnio;

    public Interfaz() {
        libros = new ArrayList<>();
        setTitle("Gestión de Libros");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        campoTitulo = new JTextField(20);
        campoAutor = new JTextField(20);
        campoAnio = new JTextField(4);
        JButton botonFiccion = new JButton("Agregar Libro de Ficción");
        JButton botonNoFiccion = new JButton("Agregar Libro de No Ficción");
        areaLibros = new JTextArea(10, 30);
        areaLibros.setEditable(false);

        add(new JLabel("Título:"));
        add(campoTitulo);
        add(new JLabel("Autor:"));
        add(campoAutor);
        add(new JLabel("Año:"));
        add(campoAnio);
        add(botonFiccion);
        add(botonNoFiccion);
        add(new JScrollPane(areaLibros));

        botonFiccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = campoTitulo.getText();
                String autor = campoAutor.getText();
                int anio = Integer.parseInt(campoAnio.getText());
                LibroFiccion libro = new LibroFiccion(titulo, autor, anio);
                libros.add(libro);
                actualizarAreaLibros();
            }
        });

        botonNoFiccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = campoTitulo.getText();
                String autor = campoAutor.getText();
                int anio = Integer.parseInt(campoAnio.getText());
                LibroNoFiccion libro = new LibroNoFiccion(titulo, autor, anio);
                libros.add(libro);
                actualizarAreaLibros();
            }
        });
    }

    private void actualizarAreaLibros() {
        areaLibros.setText("");
        for (Libro libro : libros) {
            areaLibros.append(libro.getDetalles() + "\n");
        }
    }
}
package d_hilos_synch_restaurante;

/**
 * Clase que representa un restaurante con un número limitado de mesas.
 */
public class Restaurante {
    private int mesasDisponibles;

    /**
     * Constructor del Restaurante.
     *
     * @param mesas La cantidad inicial de mesas disponibles.
     */
    public Restaurante(int mesas) {
        this.mesasDisponibles = mesas;
    }

    /**
     * Método sincronizado para hacer una reserva. Reduce el número de mesas disponibles.
     * @param idCliente Identificador del cliente que realiza la reserva.
     */
    public synchronized void hacerReserva(int idCliente) {
        if (mesasDisponibles > 0) {
            mesasDisponibles--;
            System.out.println("Cliente " + idCliente + " hizo una reserva. Mesas disponibles: " + mesasDisponibles);
        } else {
            System.out.println("Cliente " + idCliente + " no pudo reservar. No hay mesas disponibles.");
        }
    }

    /**
     * Método sincronizado para cancelar una reserva. Aumenta el número de mesas disponibles.
     * @param idCliente Identificador del cliente que cancela la reserva.
     */
    public synchronized void cancelarReserva(int idCliente) {
        mesasDisponibles++;
        System.out.println("Cliente " + idCliente + " canceló su reserva. Mesas disponibles: " + mesasDisponibles);
    }
}

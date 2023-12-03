package d_hilos_synch_restaurante;
/*
 * Gestión de Reservas en un Restaurante
 * 
 * Desarrollar un programa en Java que simule un sistema de reservas en un restaurante. 
 * Los clientes intentarán hacer reservas en el restaurante. Deberás emplear mecanismos 
 * de sincronización para gestionar las reservas y evitar conflictos, como la sobreocupación 
 * o reservas duplicadas, incluyendo la identificación de cada cliente en el proceso.
 * 
 */

/**
 * Clase que representa a un cliente intentando hacer una reserva en el restaurante.
 */
class Cliente extends Thread {
    private final Restaurante restaurante;
    private final int idCliente;

    /**
     * Constructor del Cliente.
     *
     * @param restaurante El restaurante donde el cliente quiere hacer la reserva.
     * @param idCliente Identificador del cliente.
     */
    public Cliente(Restaurante restaurante, int idCliente) {
        this.restaurante = restaurante;
        this.idCliente = idCliente;
    }

    /**
     * El cliente intenta hacer una reserva cuando se inicia este hilo.
     */
    @Override
    public void run() {
        restaurante.hacerReserva(idCliente);
    }

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(3); // Restaurante con 3 mesas

        // Crear e iniciar varios clientes (hilos)
        for (int i = 1; i <= 5; i++) {
            new Cliente(restaurante, i).start();
        }
    }
}
package Sis_Notificaciones;

public class MensajeTexto extends NotificacionBase{

    private String numeroDestino;

    public MensajeTexto(String numeroDestino, String mensaje) {
        super(mensaje);
        this.numeroDestino = numeroDestino;
    };

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto a " + numeroDestino + ": " + mensaje);
    }
}

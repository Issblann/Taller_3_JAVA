package Sis_Notificaciones;

public class NotificacionesPush extends NotificacionBase{

    private String dispositivo;

    public NotificacionesPush(String dispositivo, String mensaje ) {
        super(mensaje);
        this.dispositivo = dispositivo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificacion push al dispositovo " + dispositivo + ": " + mensaje);
    }
}

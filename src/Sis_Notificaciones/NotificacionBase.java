package Sis_Notificaciones;

public abstract class NotificacionBase implements TiposNotificaciones{

    protected String mensaje;

    public NotificacionBase(String mensaje) {
        this.mensaje = mensaje;
    }
}

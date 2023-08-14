package Sis_Notificaciones;

public class CorreoElectronico extends NotificacionBase {
    private String destinatario ;

    public CorreoElectronico(String destinatario, String mensaje) {
        super(mensaje);
        this.destinatario = destinatario;

    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a  " + destinatario  + ": " + mensaje);
    };
}

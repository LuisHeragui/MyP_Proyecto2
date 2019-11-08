public class EstadoOffline implements EstadoUsuario {

    private Usuario usuario;

    public EstadoOffline(Usuario usuario) {
        this.usuario = usuario;
    }

    public void iniciarSesion() {
        
    }
}

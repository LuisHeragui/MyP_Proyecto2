package com.madness.programs;

public class EstadoOffline implements EstadoUsuario {

    private Usuario usuario;

    public EstadoOffline(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void iniciarSesion() {
        usuario.actualizarEstado(usuario.getOnline());
    }

    @Override
    public void cerrarSesion() {
        return;
    }

    @Override
    public void jugar() {
        return;
    }
}

package com.madness.programs;

public class EstadoOnline implements EstadoUsuario {

    private Usuario usuario;

    public EstadoOnline(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void iniciarSesion() {
        return;
    }

    @Override
    public void cerrarSesion() {
        usuario.actualizarEstado(usuario.getOffline());
    }

    @Override
    public void jugar() {
        usuario.actualizarEstado(usuario.getJugando());
    }
}

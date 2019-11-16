package com.madness.programs;

public class EstadoJugando implements EstadoUsuario {

    private Usuario usuario;

    public EstadoJugando(Usuario usuario) {
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
        return;
    }
}

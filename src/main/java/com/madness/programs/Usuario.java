package com.madness.programs;

public class Usuario {

    private String nombre;

    private String pswd;

    private int puntaje;

    private Test test;

    private EstadoUsuario online;

    private EstadoUsuario offline;

    private EstadoUsuario jugando;

    private EstadoUsuario estadoActual;

    public Usuario(String nombre, String pswd, int puntaje, Test test) {
        this.nombre  = nombre;
        this.pswd    = pswd;
        this.puntaje = puntaje;
        this.test    = test;
        this.online  = new EstadoOnline(this);
        this.offline = new EstadoOffline(this);
        this.jugando = new EstadoJugando(this);
        this.estadoActual = offline;
    }

    public Sring getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getDescripcion() {
        String r = String.format("Nombre: %s.\n" +
                                 "Puntaje: %d.\n" +
                                 "Insignias: ", nombre, puntaje);
        return r;
    }

    public EstadoUsuario getOnline() {
        return online;
    }

    public EstadoUsuario getOffline() {
        return offline;
    }

    public EstadoUsuario getJugando() {
        return jugando;
    }

    public void actualizarEstado(EstadoUsuario nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    public void iniciarSesion() {
        estadoActual.iniciarSesion();
    }

    public void cerrarSesion() {
        estadoActual.cerrarSesion();
    }

    public void jugar() {
        estadoActual.jugar();
    }
}

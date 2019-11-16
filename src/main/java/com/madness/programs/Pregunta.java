package com.madness.programs;

import java.util.ArrayList;

public class Pregunta {

    private String pregunta;

    private String respuesta;

    private ArrayList<String> respuestasFalsas = new ArrayList<>();

    public Pregunta(String pregunta, String respuesta) {
        this.pregunta  = pregunta;
        this.respuesta = respuesta;
        rellena(respuestasFalsas);
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public ArrayList<String> getRespuestasFalsas() {
        return respuestasFalsas;
    }

    /* Añade las respuestas falsas que tendrá la pregunta cargándolas de un
       archivo JSON. */
    private void rellena(ArrayList<String> respuestasFalsas) {

    }
}

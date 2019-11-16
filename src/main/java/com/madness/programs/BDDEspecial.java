package com.madness.programs;

import java.util.ArrayList;

public class BDDEspecial implements BDDPregunta {

    private ArrayList<Pregunta> preguntas = new ArrayList<>();

    private ArrayList<String> respuestasFalsas = new ArrayList<>();

    public BDDEspecial() {
        //Llenar las preguntas y respuestas falsas de un JSON.
    }

    public String getPregunta() {
        Iterador i = createIterator();
        return i.next().getPregunta();
    }

    public String getRespuesta(Pregunta pregunta) {
        return pregunta.getRespuesta();
    }

    public ArrayList<String> getRespuestasFalsas() {
        return respuestasFalsas;
    }

    public Iterador createIterator() {
        return new IteradorBDDEspecial(preguntas);
    }
}

package com.madness.programs;

import java.util.ArrayList;

public interface BDDPregunta {

    public String getPregunta();

    public String getRespuesta(Pregunta pregunta);

    public ArrayList<String> getRespuestasFalsas();

    public Iterador createIterator();

}

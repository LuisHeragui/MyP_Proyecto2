package com.madness.programs;

import java.util.ArrayList;

/**
 * Clase que define el comportamiento de los metodos hasNext() y next().
 * Implementa la interfaz Iterator.
 */
public class IteradorBDDEspecial implements Iterator<Pregunta>{

  /* La colección sobre la que se va a iterar. */
  private ArrayList<Pregunta> bddEspecial;
  /* La posicion del iterador. */
  int posicion = 0;

  /**
   * Nos da un iterable para ser iterado.
   */
  public IteradorBDDEspecial(Pregunta[] bddEspecial){
    this.bddEspecial = bddEspecial;
  }

  /**
   * Nos dice si quedan elementos por recorrer en el menú.
   * @return true si hay un elemento siguiente, false en otro caso.
   */
  @Override public boolean hasNext(){
    if(posicion >= bddEspecial.size() || bddEspecial.get(posicion) == null)
      return false;
    return true;
  }

  /**
   * Nos da el elemento siguiente.
   * @return el elemento siguiente.
   */
  @Override public Pregunta next(){
    if(hasNext()){
      Pregunta pregunta = bddEspecial.get(posicion);
      posicion++;
      return pregunta;
    }
    return null;
  }
}

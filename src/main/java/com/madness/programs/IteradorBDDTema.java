package com.madness.programs;

/**
 * Clase que define el comportamiento de los metodos hasNext() y next().
 * Implementa la interfaz Iterator.
 */
public class IteradorBDDTema implements Iterator<Pregunta>{

  /* La colección sobre la que se va a iterar. */
  private Pregunta[] bddTema;
  /* La posicion del iterador. */
  int posicion = 0;

  /**
   * Nos da un iterable para ser iterado.
   */
  public IteradorBDDTema(Pregunta[] bddTema){
    this.bddTema = bddTema;
  }

  /**
   * Nos dice si quedan elementos por recorrer en el menú.
   * @return true si hay un elemento siguiente, false en otro caso.
   */
  @Override public boolean hasNext(){
    if(posicion >= bddTema.length || bddTema[posicion] == null)
      return false;
    return true;
  }

  /**
   * Nos da el elemento siguiente.
   * @return el elemento siguiente.
   */
  @Override public Pregunta next(){
    if(hasNext()){
      Pregunta pregunta = bddTema[posicion];
      posicion++;
      return pregunta;
    }
    return null;
  }
}

package com.madness.programs;

/**
 * Interfaz para crear un iterador para iterar menus.
 */
public interface Iterator<T>{

  /**
   * Nos dice si quedan elementos por recorrer en el menú.
   * @return true si hay un elemento siguiente, false en otro caso.
   */
  public boolean hasNext();

  /**
   * Nos da elemento siguiente.
   * @return el elemento siguiente.
   */
  public T next();
}

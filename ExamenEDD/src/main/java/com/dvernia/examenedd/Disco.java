package com.dvernia.examenedd;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

/**
 * Class Disco
 */
public class Disco {

    //
    // Fields
    //
    private ArrayList<Cancion> listCanciones;
    private int id;
    private String nombre;
    private int minutos;
    private int segundos;

    //
    // Constructors
    //
    public Disco() {
    }

    ;
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId(int newVar) {
        id = newVar;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of nombre
     *
     * @param newVar the new value of nombre
     */
    public void setNombre(String newVar) {
        nombre = newVar;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setea el valor de los minutos de la cancion
     *
     * @param min Los minutos de la cancion.
     * @return booleano. Devuelve false si el valor de los minutos no está entre
     * 0 y 59
     */
    public boolean setMinutos(String min) {

        if (StringUtils.isNumeric(min) && (min.length() > 0 && min.length() < 2)) {
            final int minInt = Integer.parseInt(min);
            if (minInt >= 0 && minInt <= 59) {
                minutos = minInt;
                return true;
            }
        }
        return false;
    }

    /**
     * Get the value of minutos
     *
     * @return the value of minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Setea el valor de los segundos de la cancion
     *
     * @param sec Los segundos de la cancion.
     * @return booleano. Devuelve false si el valor de los minutos no está entre
     * 0 y 59
     */
    public boolean setSegundos(String sec) {
        if (StringUtils.isNumeric(sec) && (sec.length() > 0 && sec.length() < 2)) {
            final int secInt = Integer.parseInt(sec);
            if (secInt >= 0 && secInt <= 59) {
                segundos = secInt;
                return true;
            }
        }
        return false;
    }

    /**
     * Get the value of segundos
     *
     * @return the value of segundos
     */
    public int getSegundos() {
        return segundos;
    }

    //
    // Other methods
    //
    public ArrayList<Cancion> getListCanciones() {
        return listCanciones;
    }

    public void setListCanciones(ArrayList<Cancion> listCanciones) {
        this.listCanciones = listCanciones;
    }
}

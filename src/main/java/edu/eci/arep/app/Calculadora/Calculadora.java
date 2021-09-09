/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.arep.app.Calculadora;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * Metodo que calcula el coseno de un numero.
     * @param numero - numero a calcular.
     * @return resultado del coseno de un numero.
     */
    public String getCoseno(String numero) {
        try {
            Double resultado = Math.cos(Double.parseDouble(numero));
            return resultado.toString();
        } catch (Exception e) {
            return "Error al sacar el coseno";
        }
    }
    

    /**
     * Metodo que calcula el seno de un numero.
     *
     * @param numero - numero a calcular.
     * @return resultado del seno de un numero.
     */
    public String getSeno(String numero) {
        try {
            Double resultado = Math.sin(Double.parseDouble(numero));
            return resultado.toString();
        } catch (Exception e) {
            return "Error al sacar el seno";
        }
    }


    /**
     * Metodo que calcula la tangente de un numero.
     *
     * @param numero - numero a calcular.
     * @return resultado de la tangente de un numero.
     */
    public String getTangente(String numero) {
        try {
            Double resultado = Math.tan(Double.parseDouble(numero));
            return resultado.toString();
        } catch (Exception e) {
            return "Error al sacar la tangente";
        }
    }

    

}

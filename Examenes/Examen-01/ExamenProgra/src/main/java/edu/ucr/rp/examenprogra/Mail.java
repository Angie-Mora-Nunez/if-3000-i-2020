/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.examenprogra;

/**
 *
 * @author Angie Mora Núñez B95185
 */
public class Mail {
    
    private String pais;
    private String ciudad;
    private int codigoZip;
    private String otrasSeñas;

    public Mail(String pais, String ciudad, int codigoZip, String otrasSeñas) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.codigoZip = codigoZip;
        this.otrasSeñas = otrasSeñas;
    }//constructor

    public String getPais() {
        return pais;
    }//getpais

    public void setPais(String pais) {
        this.pais = pais;
    }//setPais

    public String getCiudad() {
        return ciudad;
    }//getCiudad

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }//setCiudad

    public int getCodigoZip() {
        return codigoZip;
    }//getCodigoZip

    public void setCodigoZip(int codigoZip) {
        this.codigoZip = codigoZip;
    }//setcodigoZip

    public String getOtrasSeñas() {
        return otrasSeñas;
    }//getotrasseñas

    public void setOtrasSeñas(String otrasSeñas) {
        this.otrasSeñas = otrasSeñas;
    }//setOtrasSeñas
  
    
}//Mail

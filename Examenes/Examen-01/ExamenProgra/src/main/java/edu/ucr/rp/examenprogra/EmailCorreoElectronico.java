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
public class EmailCorreoElectronico {
    private String correoElectronico;

    public EmailCorreoElectronico(String CorreoElectronico) {
        this.correoElectronico = CorreoElectronico;
    }//constructor

    public String getCorreoElectronico() {
        return correoElectronico;
    }//getCorreo

    public void setCorreoElectronico(String CorreoElectronico) {
        this.correoElectronico = CorreoElectronico;
    }//setCorreo
    
}//EmailCorreoElectronico

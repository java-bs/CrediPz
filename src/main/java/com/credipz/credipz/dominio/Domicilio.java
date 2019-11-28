/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credipz.credipz.dominio;

/**
 *
 * @author zamora
 */
public class Domicilio {
public String calle;
    public int numero;    
    public String piso;
    public String provincia;    

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


}

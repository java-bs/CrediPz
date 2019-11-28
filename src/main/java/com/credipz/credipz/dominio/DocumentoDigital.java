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
public class DocumentoDigital {
   public String nombre;
   public int fechaDeCarga;
   public byte imagen;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeCarga() {
        return fechaDeCarga;
    }

    public byte getImagen() {
        return imagen;
    }

   
   
   
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeCarga(int fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

  
}

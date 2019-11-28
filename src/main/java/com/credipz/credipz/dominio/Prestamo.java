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
public class Prestamo {
 public double monto;
 public int plazoEnMeses;
 public int cantidadCuotas;
 public double tasa;
 public byte [] documentos;

    public double getMonto() {
        return monto;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public double getTasa() {
        return tasa;
    }

    public byte[] getDocumentos() {
        return documentos;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public void setDocumentos(byte[] documentos) {
        this.documentos = documentos;
    }

  public boolean cancelarCuotas(int cantidad){               
        boolean proceso = false;
        return proceso;
    }
  
  public void cancelarPrestamo(){               
    }
 }

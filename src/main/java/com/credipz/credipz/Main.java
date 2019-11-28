/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.credipz.credipz;

/**
 *
 * @author zamora
 */
import com.credipz.credipz.dominio.Prestamo;
public class Main {
    public static void main(String[] args) {
        //System.out.println("HOLA mundo...******");
      Prestamo prestamo1 = new Prestamo();
      prestamo1.cantidadCuotas = 12;
      prestamo1.monto = 10000.50;
      prestamo1.plazoEnMeses = 24;
      prestamo1.tasa = 0.10;  
    }
    
}

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
public class Cliente {
    public int dni = 0;
    public String nombreApellido;
    public double ingresos;
    public int prestamo[];
    public int cuentaBancaria;
    public byte dniDigitalizado;
    public String domicilio;

    public int getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public double getIngresos() {
        return ingresos;
    }

    public int[] getPrestamo() {
        return prestamo;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public byte getDniDigitalizado() {
        return dniDigitalizado;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public void setPrestamo(int[] prestamo) {
        this.prestamo = prestamo;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void setDniDigitalizado(byte dniDigitalizado) {
        this.dniDigitalizado = dniDigitalizado;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void cambiarDomicilio(String nuevoDomicilio){               
    }
    
    public void actualizarIngresos(byte nuevoDocumento, double nuevoMonto){      
    } 
    
}

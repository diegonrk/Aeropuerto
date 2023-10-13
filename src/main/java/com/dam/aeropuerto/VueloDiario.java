/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.aeropuerto;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author diegoposti
 */
public class VueloDiario extends VueloBase implements Serializable{
    private String codigoVD;
    private Date fecha;
    private Time HoraSReal;
    private Time HoraLLReal;
    private String plazas;
    private double precio;

    public String getCodigoVD() {
        return codigoVD;
    }
    public void setCodigoVD(String codigoVD) {
        this.codigoVD = codigoVD;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Time getHoraSReal() {
        return HoraSReal;
    }
    public void setHoraSReal(Time HoraSReal) {
        this.HoraSReal = HoraSReal;
    }
    public Time getHoraLLReal() {
        return HoraLLReal;
    }
    public void setHoraLLReal(Time HoraLLReal) {
        this.HoraLLReal = HoraLLReal;
    }
    public String getPlazas() {
        return plazas;
    }
    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public VueloDiario(String codigoVD, Date fecha, Time HoraSReal, Time HoraLLReal, String plazas, double precio) {
        this.codigoVD = getCodigoVB();
        this.fecha = fecha;
        this.HoraSReal = HoraSReal;
        this.HoraLLReal = HoraLLReal;
        this.plazas = plazas;
        this.precio = precio;
    }
    
    VueloDiario(){};
    
    
    
}

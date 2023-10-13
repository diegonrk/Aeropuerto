/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.aeropuerto;

import java.io.Serializable;
import java.sql.Time;

/**
 *
 * @author diegoposti
 */
public class VueloBase implements Serializable{
    public String codigoVB;
    private String aeropuertoOrigen;
    private String aeropuertoDestino;
    private String plazas;
    private Time HoraSalida;
    private Time HoraLLegada;
    private String DiasOpera;

    public String getCodigoVB() {
        return codigoVB;
    }
    public void setCodigoVB(String codigoVB) {
        this.codigoVB = codigoVB;
    }
    public String getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }
    public void setAeropuertoOrigen(String aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }
    public String getAeropuertoDestino() {
        return aeropuertoDestino;
    }
    public void setAeropuertoDestino(String aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }
    public String getPlazas() {
        return plazas;
    }
    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }
    public Time getHoraSalida() {
        return HoraSalida;
    }
    public void setHoraSalida(Time HoraSalida) {
        this.HoraSalida = HoraSalida;
    }
    public Time getHoraLLegada() {
        return HoraLLegada;
    }
    public void setHoraLLegada(Time HoraLLegada) {
        this.HoraLLegada = HoraLLegada;
    }
    public String getDiasOpera() {
        return DiasOpera;
    }
    public void setDiasOpera(String DiasOpera) {
        this.DiasOpera = DiasOpera;
    }
    VueloBase(){};

    public VueloBase(String codigoVB, String aeropuertoOrigen, String aeropuertoDestino, String plazas, Time HoraSalida, Time HoraLLegada, String DiasOpera) {
        this.codigoVB = codigoVB;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.plazas = plazas;
        this.HoraSalida = HoraSalida;
        this.HoraLLegada = HoraLLegada;
        this.DiasOpera = DiasOpera;
    }
    
    
}

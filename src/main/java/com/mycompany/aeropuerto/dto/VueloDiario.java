/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto.dto;

import com.mycompany.aeropuerto.dto.VueloBase;
import com.opencsv.bean.CsvDate;
import java.util.Date;


/**
 *version 1.1
 * @author Diego
 */
public class VueloDiario {
    private String codigoVueloBase;
    @CsvDate
    private Date fechaVuelo;
    @CsvDate
    private Date horaSalidaReal;
    @CsvDate
    private Date horaLlegadaReal;
    private int numPlazasOcupadas;
    private float precioVuelo;
    //esto solo es para quine quiera, mismo funcionamiento que en 
    //vueloOirgen y vueloDestino
    private VueloBase vueloBase;

    public String getCodigoVueloBase() {
        return codigoVueloBase;
    }

    public void setCodigoVueloBase(String codigoVueloBase) {
        this.codigoVueloBase = codigoVueloBase;
    }

    public VueloBase getVueloBase() {
        return vueloBase;
    }

    public void setVueloBase(VueloBase vueloBase) {
        this.vueloBase = vueloBase;
    }
    
    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Date getHoraSalidaReal() {
        return horaSalidaReal;
    }

    public void setHoraSalidaReal(Date horaSalidaReal) {
        this.horaSalidaReal = horaSalidaReal;
    }

    public Date getHoraLlegadaReal() {
        return horaLlegadaReal;
    }

    public void setHoraLlegadaReal(Date horaLlegadaReal) {
        this.horaLlegadaReal = horaLlegadaReal;
    }

    public int getNumPlazasOcupadas() {
        return numPlazasOcupadas;
    }

    public void setNumPlazasOcupadas(int numPlazasOcupadas) {
        this.numPlazasOcupadas = numPlazasOcupadas;
    }

    public double getPrecioVuelo() {
        return precioVuelo;
    }

    public void setPrecioVuelo(float precioVuelo) {
        this.precioVuelo = precioVuelo;
    }
    

    public VueloDiario(int codigoVueloDiario, Date fechaVuelo, Date horaSalidaReal, Date horaLlegadaReal, int numPlazasOcupadas, float precioVuelo) {
        this.codigoVueloBase = codigoVueloBase;
        this.fechaVuelo = fechaVuelo; //va a ser solo la fecha
        this.horaSalidaReal = horaSalidaReal; //va a ser solo la hora
        this.horaLlegadaReal = horaLlegadaReal; //va a ser solo la hora
        this.numPlazasOcupadas = numPlazasOcupadas;
        this.precioVuelo = precioVuelo;
    }

    public VueloDiario(String codigoVueloBase, Date fechaVuelo, Date horaSalidaReal, Date horaLlegadaReal, int numPlazasOcupadas, float precioVuelo) {
        this.codigoVueloBase = codigoVueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalidaReal = horaSalidaReal;
        this.horaLlegadaReal = horaLlegadaReal;
        this.numPlazasOcupadas = numPlazasOcupadas;
        this.precioVuelo = precioVuelo;
        
    }

    @Override
    public String toString() {
        return "VueloDiario{" + "codigoVueloBase=" + codigoVueloBase + ", fechaVuelo=" + fechaVuelo + ", horaSalidaReal=" + horaSalidaReal + ", horaLlegadaReal=" + horaLlegadaReal + ", numPlazasOcupadas=" + numPlazasOcupadas + ", precioVuelo=" + precioVuelo + '}';
    }
    
    
    public VueloDiario(){};
    
}


//para la base de datos codigo-fecha debe ser clave unica y primaria
//para identificar un vuelo diario
//ejemplo de IB301 AST - MAD

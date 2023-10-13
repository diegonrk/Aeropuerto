package com.dam.aeropuerto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diegoposti
 */
public class Companya {
    
    private int id;
    private String codigoComp;
    private String nombre;
    private String direccion;
    private String municipio;
    private String tlfPasajeros;
    private String tlfAeropuertos;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCodigoComp() {
        return codigoComp;
    }
    public void setCodigoComp(String codigo) {
        this.codigoComp = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getTlfPasajeros() {
        return tlfPasajeros;
    }
    public void setTlfPasajeros(String tlfPasajeros) {
        this.tlfPasajeros = tlfPasajeros;
    }
     public String getTlfAeropuertos() {
        return tlfAeropuertos;
    }
    public void setTlfAeropuertosString (String tlfAeropuertos) {
        this.tlfAeropuertos = tlfAeropuertos;
    }
    
    Companya(){};

    public Companya(int id, String codigoComp, String nombre, String direccion, String municipio, String tlfPasajeros, String tlfAeropuertos) {
        this.id = id;
        this.codigoComp = codigoComp;
        this.nombre = nombre;
        this.direccion = direccion;
        this.municipio = municipio;
        this.tlfPasajeros = tlfPasajeros;
        this.tlfAeropuertos = tlfAeropuertos;
    }
    
}


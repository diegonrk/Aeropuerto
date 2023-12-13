/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto;

import com.mycompany.aeropuerto.dto.CompanyaAerea;
import com.mycompany.aeropuerto.dto.VueloBase;
import com.mycompany.aeropuerto.logica.LogicaNegocio;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author diegoposti
 */
public class AeropuertoClase {
    
    
     public static void main(String args[]) {
     CompanyaAerea c1 = new CompanyaAerea(75,
    "IB",
    "iberia Lineas Aereas de España",
    "C/Marques s/n",
            "29079",
            "91-345-32-11",
            "900-100-192"
    );
    
    LogicaNegocio.addCompanyaAerea(c1);
    List<CompanyaAerea> lista2 = LogicaNegocio.getAllCompanyas();
    
    CompanyaAerea c2 = new CompanyaAerea
        (75,
    "IB",
    "iberia Express",
    "C/Marques s/n",
            "28079",
            "91-345-32-11",
            "900-100-192"
    );
    LogicaNegocio.addCompanyaAerea(c2);
    //LogicaNegocio.addVueloBase(new VueloBase("IB123",3,new Date(),new Date(),new Date(), "LNV",LogicaNegocio.aeropuertoBase.getCodigoIATA(), "ABC"));
    List<CompanyaAerea> lista = LogicaNegocio.getAllCompanyas();
    }
     
    
    
}

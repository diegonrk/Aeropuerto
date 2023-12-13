/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto.gui;

import com.mycompany.aeropuerto.dto.CompanyaAerea;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Diego
 */
public class CompTableModel extends AbstractTableModel{
    private String[] columnas = {"Código","Prefijo","Nombre","Municipio","Dirección","Tlf. Pasajeros","Tlf. Aeropuertos"};
private List<CompanyaAerea> lstCompanyas;
   public CompTableModel(List<CompanyaAerea> lstCompanyas)
    {
        this.lstCompanyas = lstCompanyas;
    }
    @Override
    public int getRowCount() {
        return lstCompanyas.size();
    }
    @Override
    public int getColumnCount() {
        return columnas.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
                {
            case 0:
                return lstCompanyas.get(rowIndex).getCodigo();
            case 1:
                return lstCompanyas.get(rowIndex).getPrefijo();
            case 2:
            return lstCompanyas.get(rowIndex).getNombre();
            case 3:
            return lstCompanyas.get(rowIndex).getMunicipio();
            case 4:
                return lstCompanyas.get(rowIndex).getDireccion();
            case 5:
                return lstCompanyas.get(rowIndex).getNumInfoPasajero();
            case 6:
                return lstCompanyas.get(rowIndex).getNumInfoAeropuerto();


        }
        
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column]; 
    }

    
    
    
    
}

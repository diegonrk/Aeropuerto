/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto.gui;

import com.mycompany.aeropuerto.dto.Aeropuerto;
import com.mycompany.aeropuerto.dto.VueloBase;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Diego
 */
public class AeropuertosTableModel extends AbstractTableModel{
    private String[] columnas = {"Código","Nombre","Municipio"};
private List<Aeropuerto> lstAeropuertos;
   public AeropuertosTableModel(List<Aeropuerto> lstAeropuertos)
    {
        this.lstAeropuertos = lstAeropuertos;
    }
    
    
    @Override
    public int getRowCount() {
        return lstAeropuertos.size();
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
             return lstAeropuertos.get(rowIndex).getCodigoIATA();

            case 1:
             return lstAeropuertos.get(rowIndex).getNombre();

            case 2:
              return lstAeropuertos.get(rowIndex).getCodigoMunicipio();

          }
        
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column]; 
    }

    
    
    
    
}

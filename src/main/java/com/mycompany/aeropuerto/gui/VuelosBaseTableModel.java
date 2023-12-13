package com.mycompany.aeropuerto.gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mycompany.aeropuerto.dto.VueloBase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Diego
 */
public class VuelosBaseTableModel extends AbstractTableModel{
    
    
     SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
     
    private String[] columnas = {"Código","Origen","Destino","Días","Plazas","Salida","Llegada"};
private List<VueloBase> lstVuelos;
   public VuelosBaseTableModel(List<VueloBase> lstVuelos)
    {
        this.lstVuelos = lstVuelos;
    }
    
    
    @Override
    public int getRowCount() {
        return lstVuelos.size();
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
                return lstVuelos.get(rowIndex).getCodigoVuelo();
            case 1:
                return lstVuelos.get(rowIndex).getAeropuertoOrigen();
            case 2:
            return lstVuelos.get(rowIndex).getAeropuertoDestino();
            case 3:
            return lstVuelos.get(rowIndex).getDiasOpera();
            case 4:
                return lstVuelos.get(rowIndex).getNumPlazas();
            case 5:
               String horaFormateadaS = formatoHora.format(lstVuelos.get(rowIndex).getHoraOficialSalida());
                return horaFormateadaS;
            case 6:  
                
                String horaFormateadaL = formatoHora.format(lstVuelos.get(rowIndex).getHoraOficialLlegada());
                return horaFormateadaL;

        }
        
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column]; 
    }

    
    
    
    
    
}

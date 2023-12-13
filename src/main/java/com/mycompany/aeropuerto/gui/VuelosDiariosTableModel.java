/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto.gui;

import com.mycompany.aeropuerto.dto.VueloBase;
import com.mycompany.aeropuerto.dto.VueloDiario;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Diego
 */
public class VuelosDiariosTableModel extends AbstractTableModel{
SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

     private String[] columnas = {"Código","Fecha","Hora salida","Hora llegada","Plazas ocupadas","Precio"};
private List<VueloDiario> lstVuelos;
   public VuelosDiariosTableModel(List<VueloDiario> lstVuelos)
    {
        this.lstVuelos = lstVuelos;
    }
   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
   
        switch(columnIndex)
                {
            case 0:
                return lstVuelos.get(rowIndex).getCodigoVueloBase();
            case 1:
                return lstVuelos.get(rowIndex).getFechaVuelo();
               
                /*String fechaformateada = formatoFecha.format(lstVuelos.get(rowIndex).getFechaVuelo());
                return fechaformateada;*/
            case 2:
                String horaFormateada = formatoHora.format(lstVuelos.get(rowIndex).getHoraSalidaReal());
                return horaFormateada;
            
            case 3:
                String horaFormateadall = formatoHora.format(lstVuelos.get(rowIndex).getHoraLlegadaReal());
                return horaFormateadall;
            case 4:
                return lstVuelos.get(rowIndex).getNumPlazasOcupadas();
            case 5:
                return lstVuelos.get(rowIndex).getPrecioVuelo();
           
        }
        
        return null;
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
    public String getColumnName(int column) {
        return columnas[column]; 
    }
}

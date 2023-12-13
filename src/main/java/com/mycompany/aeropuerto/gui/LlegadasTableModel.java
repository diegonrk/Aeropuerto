/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto.gui;

import com.mycompany.aeropuerto.dto.CompanyaAerea;
import com.mycompany.aeropuerto.dto.VueloDiario;
import static com.mycompany.aeropuerto.logica.LogicaNegocio.getVueloBaseByCodigo;
import static com.mycompany.aeropuerto.logica.LogicaNegocio.leerCompanyasCSV;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Diego
 */
public class LlegadasTableModel extends AbstractTableModel{
     private String[] columnas = {"Código","Origen","Hora llegada","Hora salida","Compañía","Fecha"};
private List<VueloDiario> lstVuelos;
private List<CompanyaAerea> lstComps = leerCompanyasCSV();

   public LlegadasTableModel(List<VueloDiario> lstVuelos)
    {
        this.lstVuelos = lstVuelos;
    }
   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
   
        switch(columnIndex)
                {
            case 0:
               return  lstVuelos.get(rowIndex).getCodigoVueloBase();
                
            case 1:
                String codigo2 = lstVuelos.get(rowIndex).getCodigoVueloBase().toString();
                String destino = getVueloBaseByCodigo(codigo2).getAeropuertoOrigen();
                return destino;
            case 2:
                Date horaLlegadaReal = lstVuelos.get(rowIndex).getHoraLlegadaReal();
                SimpleDateFormat formatoHorall = new SimpleDateFormat("HH:mm");
                String horaFormateadall = formatoHorall.format(horaLlegadaReal);
                return horaFormateadall;
            
            case 3:
                 
                Date horaSalidaReal = lstVuelos.get(rowIndex).getHoraSalidaReal();
                SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                String horaFormateada = formatoHora.format(horaSalidaReal);
                return horaFormateada;
            case 4:
                 String codigoVB = lstVuelos.get(rowIndex).getCodigoVueloBase();
               for (CompanyaAerea ca: lstComps){
                   if(codigoVB.contains(ca.getCodigo()))
                   {
                        return ca.getNombre();
                   }
               }
            case 5:
              Date fecha = lstVuelos.get(rowIndex).getFechaVuelo();
                SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy");
                String formatofechareturn = formatofecha.format(fecha);
                return formatofechareturn;
           
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto.logica;

import com.mycompany.aeropuerto.dto.Aeropuerto;
import com.mycompany.aeropuerto.dto.CompanyaAerea;
import com.mycompany.aeropuerto.dto.VueloBase;
import com.mycompany.aeropuerto.dto.VueloDiario;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diegoposti
 */
public class LogicaNegocio {

    private static List<Aeropuerto> lstAeropuertos = new ArrayList<Aeropuerto>();
    private static List<VueloDiario> lstVuelosDiario = new ArrayList<VueloDiario>();
    public static Aeropuerto aeropuertoBase = getAeropuertoByCodigoIATA("OVD");
    private static List<CompanyaAerea> lstCompanyas = new ArrayList<CompanyaAerea>();
    

    
    
   

    //<editor-fold desc="Lógica Vuelos Base">
    
    private static List<VueloBase> lstVuelosBase = new ArrayList<VueloBase>();

    /*
    MÉTODO QUE DEVUELVE TODOS LOS VUELOS BASE DEL FICHERO vueloBase.csv
    */
    public static List<VueloBase> getAllVuelosBase() {
        String path = "./src/main/resources/vuelosBase.csv";

        try {
            List<VueloBase> lstVuelosBase = new CsvToBeanBuilder(new FileReader(path))
                    .withType(VueloBase.class).build().parse();

            return lstVuelosBase;
        } catch (FileNotFoundException ex) {

            System.out.println(ex.getMessage());
        }
        return null;
    }

    
    /*
    MÉTODO QUE DEVUELVE UN VUELO BASE EN FUNCIÓN DEL CÓDIGO DE ESE VUELO,
    QUE SE LE PASA COMO ARGUMENTO AL MÉTODO
    */
    public static VueloBase getVueloBaseByCodigo(String codigo) {
        VueloBase vueloBaseSalida;
        List<VueloBase> lstVuelos = getAllVuelosBase();
        for (VueloBase vb : lstVuelos) {
            if (vb.getCodigoVuelo().equals(codigo)) {
                vueloBaseSalida = vb;
                return vueloBaseSalida;
            }
        }
        return null;
    }

    
    /*
    MÉTODO QUE ESCRIBE LOS VUELOS BASE E EL FICHERO vuelosBase.csv
    */
    public static void escribirCSVvuelosBase(VueloBase vb) {
        try {
            String path = "./src/main/resources/vuelosBase.csv";

            List<VueloBase> lstVuelos = new CsvToBeanBuilder(new FileReader(path))
                    .withType(VueloBase.class).build().parse();
            lstVuelos.add(vb);

            try (Writer writer = new FileWriter(path)) {
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

                beanToCsv.write(lstVuelos);

            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    
    /*
    MÉTODO QUE ACTUALIZA EL FICHERO vuelosBase.csv 
    */
    public static void actualizarCSVVuelosBase(List<VueloBase> lstVuelosBase) {

        String path = "./src/main/resources/vuelosBase.csv";

        try (Writer writer = new FileWriter(path)) {
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

            beanToCsv.write(lstVuelosBase);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    /*
    MÉTODO MEDIANTE EL CUAL ES POSIBLE REALIZAR EL BORRADO DE UN VUELO BASE
    */
    public static void borrarVueloBase(String codigo) {
        System.out.println(codigo);
        List<VueloBase> lstVuelosBase = getAllVuelosBase();
        List<VueloBase> lstNueva = new ArrayList<>();
        for (VueloBase vb : lstVuelosBase) {
            if (!vb.getCodigoVuelo().equals(codigo)) {
                lstNueva.add(vb);
            }
        }

        actualizarCSVVuelosBase(lstNueva);
    }
    
    
    
        ///MÉTODOS JUAN DIEGO

    public static VueloBase getVueloBaseByAeropuertoOrigen(String codigoIATA) {
     return new VueloBase();
    }

    public static VueloBase getVueloBaseByAeropuertoDestino(String codigoIATA) {
        return new VueloBase();
    }

    public static void addVueloBase(VueloBase v) {
        lstVuelosBase.add(v);
    }
//</editor-fold>
    
    //<editor-fold desc="Lógica Vuelos Diarios">
    
    
    /*
    MÉTODO QUE DEVUELVE TODOS LOS VUELOS DIARIOS DEL CSV vuelosDiarios.csv
    */
    public static List<VueloDiario> getAllVuelosDiarios() {
        String path = "./src/main/resources/vuelosDiarios.csv";

        try {
            List<VueloDiario> lstVuelosDiarios = new CsvToBeanBuilder(new FileReader(path))
                    .withType(VueloDiario.class).build().parse();

            return lstVuelosDiarios;
        } catch (FileNotFoundException ex) {

            System.out.println(ex.getMessage());
        }
        return null;
    }

    
    /*
    MÉTODO QUE ESCRIBE LOS VUELOS DIARIOS EN EL CSV vuelosDiarios.csv 
    */
    public static void escribirCSVvuelosDiarios(VueloDiario vb) {
        try {
            String path = "./src/main/resources/vuelosDiarios.csv";

            List<VueloDiario> lstVuelos = new CsvToBeanBuilder(new FileReader(path))
                    .withType(VueloDiario.class).build().parse();
            lstVuelos.add(vb);

            try (Writer writer = new FileWriter(path)) {
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

                beanToCsv.write(lstVuelos);

            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    /*
    MÉTODO QUE DEVUELVE UNA LISTA DE LOS VUELOS DIARIOS EN FUNCION DE SU ORIGEN
    */
    public static List<VueloDiario> VuelosDiariosPorOrigen(String origen) {
        List<VueloDiario> lstVueloDiario = getAllVuelosDiarios();
        List<VueloDiario> lstVueloDiarioReturn = new ArrayList<>();
        List<VueloBase> lstVueloBase = getAllVuelosBase();
        List<VueloBase> lstVueloBaseOrigen = new ArrayList<>();;

        for (VueloBase vb : lstVuelosBase) {
            if (vb.getAeropuertoOrigen().equals(origen)) {

                for (VueloDiario vd : lstVuelosDiario) {
                    if (vd.getCodigoVueloBase().equals(vb.getCodigoVuelo())) {
                        lstVueloDiarioReturn.add(vd);
                    }
                }
            }
        }

        return lstVueloDiarioReturn;
    }
    
    
    public static List<VueloDiario> VuelosDiariosPorFecha(Date fecha) {
        List<VueloDiario> lstVueloDiario = getAllVuelosDiarios();
        List<VueloDiario> lstVueloDiarioReturn = new ArrayList<>();
        
        for(VueloDiario vd: lstVueloDiario){
        if(vd.getFechaVuelo().equals(fecha)){
        lstVueloDiarioReturn.add(vd);
        }
        
        }
        return lstVueloDiarioReturn;
    }

    
    
    /*
    MÉTODO QUE DEVUELVE UNA LISTA CON LOS VUELOS DIARIOS FILTRADOS POR DESTINO
    */
    public static List<VueloDiario> VuelosDiariosPorDestino(String destino) {
        List<VueloDiario> lstVueloDiario = getAllVuelosDiarios();
        List<VueloDiario> lstVueloDiarioReturn = new ArrayList<>();
        List<VueloBase> lstVueloBase = getAllVuelosBase();
        List<VueloBase> lstVueloBaseOrigen = new ArrayList<>();;

        for (VueloBase vb : lstVuelosBase) {
            if (vb.getAeropuertoOrigen().toString().equals(destino)) {

                for (VueloDiario vd : lstVuelosDiario) {
                    if (vd.getCodigoVueloBase().toString().equals(vb.getCodigoVuelo())) {
                        lstVueloDiarioReturn.add(vd);
                    }
                }
            }
        }

        return lstVueloDiarioReturn;
    }

    
    
    /*
    MÉTODO QUE ACTUALIZA EL FICHERO vuelosDiarios.csv CADA VEZ QUE SE REALICEN CAMBIOS
    */
    public static void actualizarCSVVuelosDiarios(List<VueloDiario> lstVuelosDiarios) {

        String path = "./src/main/resources/vuelosDiarios.csv";

        try (Writer writer = new FileWriter(path)) {
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

            beanToCsv.write(lstVuelosDiarios);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    /*
    MÉTODO QUE BORRA UN VUELO DIARIO DEL ARCHIVO vuelosDiarios.csv 
    PARA IDENTIFICAR AL VUELO SE LE PASA EL CÓDIGO Y LA FECHA DEL VUELO
    */
    public static void borrarVueloDiario(String codigo, Date fecha) {
        System.out.println(codigo);
        List<VueloDiario> lstVuelosDiarios = getAllVuelosDiarios();
        List<VueloDiario> lstNueva = new ArrayList<>();
        for (VueloDiario vd : lstVuelosDiarios) {
            if (!vd.getCodigoVueloBase().equals(codigo) && !vd.getFechaVuelo().equals(fecha)) {
                lstNueva.add(vd);
            }
        }

        actualizarCSVVuelosDiarios(lstNueva);
    }
    
    
    public static VueloDiario getVueloDiarioByCodigoVueloBase(String codigo) {
 return new VueloDiario();
    }

//</editor-fold>
    
     //<editor-fold desc="Lógica Compañías">

    
    /////////////////MÉTODOS COMPAÑÍAS////////////////////////////////////////
    

    
    /*
    MÉTODO PARA ESCRIBIR COMPAÑÍAS EN EL ARCHIVO CSV DE COMPAÑÍAS
     */
    public static void escribirCSVComp(CompanyaAerea Comp) {
        try {
            String path = "./src/main/resources/companyas.csv";

            List<CompanyaAerea> lstCompanyas = new CsvToBeanBuilder(new FileReader(path))
                    .withType(CompanyaAerea.class).build().parse();
            lstCompanyas.add(Comp);

            try (Writer writer = new FileWriter(path)) {
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

                beanToCsv.write(lstCompanyas);

            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

     /*
    MÉTODO PARA ACTUALIZAR LAS COMPAÑÍAS AÉREAS EN EL FICHERO CSV
    */
    public static void actualizarCSVComp(List<CompanyaAerea> lstComp) {

        String path = "./src/main/resources/companyas.csv";

        try (Writer writer = new FileWriter(path)) {
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

            beanToCsv.write(lstComp);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

     /*
    MÉTODO QUE DEVUELVE UNA LISTA DE LAS COMPAÑÍAS AÉREAS PRESENTES EN EL CSV CORRESPONDIENTE
    */
    public static List<CompanyaAerea> leerCompanyasCSV() {
        String path = "./src/main/resources/companyas.csv";

        try {
            List<CompanyaAerea> lstCompanyaAerea = new CsvToBeanBuilder(new FileReader(path))
                    .withType(CompanyaAerea.class).build().parse();

            return lstCompanyaAerea;
        } catch (FileNotFoundException ex) {

            System.out.println(ex.getMessage());
        }
        return null;

    }

    /*
    MÉTODO PARA BORRAR UNA COMPAÑÍA AÉREA
    */
    public static void borrarCompanya(CompanyaAerea Comp) {
        List<CompanyaAerea> lstCompanyaAerea = leerCompanyasCSV();
        List<CompanyaAerea> lstNueva = new ArrayList<>();
        for (CompanyaAerea ca : lstCompanyaAerea) {
            if (!ca.getNombre().equals(Comp.getNombre())) {
                lstNueva.add(ca);
            }
        }

        actualizarCSVComp(lstNueva);
    }
    
    //MÉTODO JUAN DIEGO
    public static void addCompanyaAerea(CompanyaAerea newComp) {
        lstCompanyas.add(newComp);
    }
    
    public static List<CompanyaAerea> getAllCompanyas() {
        return new ArrayList<CompanyaAerea>();
    }
    
    
    public static void deleteCompanyaByCodigo(String codigo) {
        CompanyaAerea delComp = getCompanyaByCodigo(codigo);
        lstCompanyas.remove(delComp);

    }
    
    
    public static CompanyaAerea getCompanyaByCodigo(String codigo) {
        CompanyaAerea valorSalida = null;

        return new CompanyaAerea();
    }

    public static CompanyaAerea getCompanyaByPrefijo(int prefijo) {
        CompanyaAerea valorSalida = null;
        for (CompanyaAerea c : lstCompanyas) {

            if (c.getPrefijo() == prefijo) {
                valorSalida = c;
                return valorSalida;
            }
        }
        return valorSalida;

    }
    
    public static void updateCompanyaByCodigo(String codigo, CompanyaAerea newComp) {
        CompanyaAerea oldComp = getCompanyaByCodigo(codigo);
        oldComp.setDireccion(newComp.getDireccion());
        oldComp.setMunicipio(newComp.getMunicipio());
        oldComp.setNombre(newComp.getNombre());
        oldComp.setPrefijo(newComp.getPrefijo());
        oldComp.setNumInfoPasajero(newComp.getNumInfoPasajero());
        oldComp.setNumInfoAeropuerto(newComp.getNumInfoAeropuerto());

        //Optional<CompanyaAerea> optValorSalida = new Optional<CompanyaAerea>();
    }

//</editor-fold>
    
    //<editor-fold desc="Lógica Aeropuertos">

    public static List<Aeropuerto> leerAeropuertosCSV() {
        String path = "./src/main/resources/aeropuertos.csv";

        try {
            List<Aeropuerto> lstAeropuertos = new CsvToBeanBuilder(new FileReader(path))
                    .withType(Aeropuerto.class).build().parse();

            return lstAeropuertos;
        } catch (FileNotFoundException ex) {

            System.out.println(ex.getMessage());
        }
        return null;

    }
    
    
    public static List<Aeropuerto> getAllAeropuertos() {
        return new ArrayList<Aeropuerto>();
    }

    public static Aeropuerto getAeropuertoByCodigoIATA(String codigoIATA) {
        Aeropuerto valorSalida = null;

        for (Aeropuerto a : lstAeropuertos) {

            if (a.getCodigoIATA().equals(codigoIATA)) {
                valorSalida = a;
                return valorSalida;
            }
        }
        return valorSalida;
    }

//</editor-fold>
    
    
    
    

    
    

    
}

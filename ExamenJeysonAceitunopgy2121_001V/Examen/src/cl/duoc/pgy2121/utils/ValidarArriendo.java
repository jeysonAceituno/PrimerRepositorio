/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.utils;

import cl.duoc.pgy2121.Dominio.Cliente;
import cl.duoc.pgy2121.Dominio.Vehiculo;
import cl.duoc.pgy2121.Dominio.Vendedor;

/**
 *
 * @author jeyso
 */
public class ValidarArriendo {
    
    public static void validacionDatosCorrectos(Vendedor vendedor ,Cliente cliente ,Vehiculo vehiculo) throws Exception{
        System.out.println("Validando arriendo");
        if (vendedor == null || cliente == null || vehiculo == null){
        throw new Exception("Ingreso invalido");        
        
        
        
    
        }
    
   
    }

    public static void validacionVehiculo(Vehiculo vehiculo) throws Exception {

        if (vehiculo == null || vehiculo.getMarca() == null || vehiculo.getModelo() == null || vehiculo.getAno() == null
                || vehiculo.getNumeroChasis() == null || vehiculo.getNumeroMotor() == null || vehiculo.getPatente() == null
                || vehiculo.getTipoConbustible() == null || vehiculo.getTipoVehiculo() == null) {
            throw new Exception("Ingreso invalido");


    
        }
        
        
   
    }
    
    public static void validacionCliente(Cliente cliente) throws Exception {

        if (cliente == null || cliente.getRut() == null || cliente.getNombreCompleto() == null || cliente.getFechaNacimiento() == null
                || cliente.getDireccion() == null || cliente.getNacionalidad() == null || cliente.getCorreo() == null || cliente.getTelefono() == null ) {
            throw new Exception("Ingreso invalido");


    
        }
        
        
   
    }
         
    
    
    
    
    
    public static void validacionVendedor(Vendedor vendedor) throws Exception {

        if (vendedor == null || vendedor.getRut() == null || vendedor.getNombreCompleto() == null || vendedor.getCorreo() == null
                || vendedor.getCorreo() == null || vendedor.getDireccion() == null ) {
            throw new Exception("Ingreso invalido");


    
        }
        
        
   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
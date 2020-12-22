/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.servicio;

import cl.duoc.pgy2121.Dao.ArriendoDao;
import cl.duoc.pgy2121.Dominio.Arriendo;
import cl.duoc.pgy2121.Dominio.Cliente;
import cl.duoc.pgy2121.Dominio.Vehiculo;
import cl.duoc.pgy2121.Dominio.Vendedor;
import cl.duoc.pgy2121.utils.ValidarArriendo;


/**
 *
 * @author jeyso
 */
public class ServicioArriendo {
    
    
    public void arrendar(Arriendo arriendo) throws Exception {
        System.out.println("Ingresando a arriendo:");
        ValidarArriendo.validacionDatosCorrectos(arriendo.getVendedor(), arriendo.getCliente(), arriendo.getVehiculo());
        ArriendoDao.nuevoArriendo(arriendo);

    }

public void ingresarAuto(Vehiculo vehiculo) throws Exception {
        System.out.println("Ingresando arriendo:");
        ValidarArriendo.validacionVehiculo(vehiculo);
        ArriendoDao.nuevoVehiculo(vehiculo);

    
}
public void ingresarCliente(Cliente cliente) throws Exception {
        System.out.println("Ingresando Cliente:");
        ValidarArriendo.validacionCliente(cliente);
        ArriendoDao.nuevoCliente(cliente);
}


public void ingresarVendedor(Vendedor vendedor) throws Exception {
        System.out.println("Ingresando Vendedor:");
        ValidarArriendo.validacionVendedor(vendedor);
        ArriendoDao.nuevoVendedor(vendedor);
}


}
  
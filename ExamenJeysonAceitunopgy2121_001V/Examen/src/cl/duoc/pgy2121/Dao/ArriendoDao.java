/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.Dao;

import static cl.duoc.pgy2121.Dao.ArriendoDao.arriendos;
import cl.duoc.pgy2121.Dominio.Arriendo;
import cl.duoc.pgy2121.Dominio.Cliente;
import cl.duoc.pgy2121.Dominio.Vehiculo;
import cl.duoc.pgy2121.Dominio.Vendedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeysochucha 
 */
public class ArriendoDao {
    
    
    public static List<Arriendo> arriendos = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Vendedor> vendedores = new ArrayList<>();
    public static List<Vehiculo> vehiculos = new ArrayList<>();
    
    
    
    public static void nuevoArriendo(Arriendo arriendo){
        System.out.println("Guardando arriendo");
    
    arriendos.add(arriendo);
        System.out.println("Se ha agregado su arriendo exitosamente");
    }
    
 
    public static void nuevoCliente(Cliente cliente){
        System.out.println("Guardando Cliente");
    
    clientes.add(cliente);
        System.out.println("Se ha agrega cliente exitosamente");
    }
    public static void nuevoVendedor(Vendedor vendedor){
        System.out.println("Guardando vendedor");
    
    vendedores.add(vendedor);
        System.out.println("Se ha agrega el vendedor correctamente");
    }
    public static void nuevoVehiculo(Vehiculo vehiculo){
        System.out.println("Guardando vehiculo");
    
    vehiculos.add(vehiculo);
        System.out.println("Se ha agregado su vehiculo exitosamente");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

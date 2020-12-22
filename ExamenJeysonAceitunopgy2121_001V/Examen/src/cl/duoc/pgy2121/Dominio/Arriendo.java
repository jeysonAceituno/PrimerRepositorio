/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.Dominio;

/**
 *
 * @author jeyso
 */
public class Arriendo {
    
    private String fechaArriendo;
    private Vendedor vendedor;
    private Cliente cliente;
    private String fechaTermino;
    private Vehiculo vehiculo;
    private String Observacion;
    private int valor;

    @Override
    public String toString() {
        return "Arriendo{" + "fechaArriendo=" + getFechaArriendo() + ", vendedor=" + getVendedor() + ", cliente=" + getCliente() + ", fechaTermino=" + getFechaTermino() + ", vehiculo=" + getVehiculo() + ", Observacion=" + getObservacion() + ", valor=" + getValor() + '}';
    }

    public Arriendo() {
    }

    public Arriendo(String fechaArriendo, Vendedor vendedor, Cliente cliente, String fechaTermino, Vehiculo vehiculo, String Observacion, int valor) {
        this.fechaArriendo = fechaArriendo;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.fechaTermino = fechaTermino;
        this.vehiculo = vehiculo;
        this.Observacion = Observacion;
        this.valor = valor;
    }

    /**
     * @return the fechaArriendo
     */
    public String getFechaArriendo() {
        return fechaArriendo;
    }

    /**
     * @param fechaArriendo the fechaArriendo to set
     */
    public void setFechaArriendo(String fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fechaTermino
     */
    public String getFechaTermino() {
        return fechaTermino;
    }

    /**
     * @param fechaTermino the fechaTermino to set
     */
    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the Observacion
     */
    public String getObservacion() {
        return Observacion;
    }

    /**
     * @param Observacion the Observacion to set
     */
    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
  
  
  
  
      
  
    
    
    
    
    
    
    
}

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
public abstract class Persona {
    
    
     private String rut;
     private String nombreCompleto;
     private String direccion;
     private String correo;
     private String telefono;

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
     
    public Persona() {
    }

    public Persona(String rut, String nombreCompleto, String direccion, String correo, String telefono) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     
    

   
    
}

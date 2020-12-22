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
public  class Cliente extends Persona {
    private String fechaNacimiento;
    private String nacionalidad;

    @Override
    public String toString() {
        return "Cliente{" + "fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + '}';
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
  
    public Cliente() {
    }

    public Cliente(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(String fechaNacimiento, String rut, String nombreCompleto, String direccion, String correo, String telefono , String nacionalidad) {
        super(rut, nombreCompleto, direccion, correo, telefono );
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}

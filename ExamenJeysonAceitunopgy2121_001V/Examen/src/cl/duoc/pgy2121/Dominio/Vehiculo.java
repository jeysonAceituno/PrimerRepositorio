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
public class Vehiculo {
    
    private String patente;
    private String numeroMotor;
    private String numeroChasis;
    private String marca;
    private String modelo;
    private String ano;
    private String tipoConbustible;
    private String tipoVehiculo;

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", numeroMotor=" + numeroMotor + ", numeroChasis=" + numeroChasis + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", tipoConbustible=" + tipoConbustible + ", tipoVehiculo=" + tipoVehiculo + '}';
    }

    public Vehiculo() {
    }

    public Vehiculo(String patente, String numeroMotor, String numeroChasis, String marca, String modelo, String ano, String tipoConbustible, String tipoVehiculo) {
        this.patente = patente;
        this.numeroMotor = numeroMotor;
        this.numeroChasis = numeroChasis;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoConbustible = tipoConbustible;
        this.tipoVehiculo = tipoVehiculo;
    }

   
    
    
    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the numeroMotor
     */
    public String getNumeroMotor() {
        return numeroMotor;
    }

    /**
     * @param numeroMotor the numeroMotor to set
     */
    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    /**
     * @return the numeroChasis
     */
    public String getNumeroChasis() {
        return numeroChasis;
    }

    /**
     * @param numeroChasis the numeroChasis to set
     */
    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the tipoConbustible
     */
    public String getTipoConbustible() {
        return tipoConbustible;
    }

    /**
     * @param tipoConbustible the tipoConbustible to set
     */
    public void setTipoConbustible(String tipoConbustible) {
        this.tipoConbustible = tipoConbustible;
    }

    /**
     * @return the tipoVehiculo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * @param tipoVehiculo the tipoVehiculo to set
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

   

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author milla
 */
public class Monitor extends Computadora{
    //atributos
    private int idMonitor;
    private String marca;
    private double tamanio;
    private int contadorMonitor;

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getContadorMonitor() {
        return contadorMonitor;
    }

    public void setContadorMonitor(int contadorMonitor) {
        this.contadorMonitor = contadorMonitor;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //constructor monitor

    public Monitor() {
    }

    public Monitor(String marca, double tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
}

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
public class Teclado extends DispositivoEntrada {
    
    //atributos
    private int idTeclado;
    private int contadorTeclado;

    public Teclado( String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        
    }
   //Constructor
    public Teclado(int idTeclado, int contadorTeclados) {
        this.idTeclado = idTeclado;
        this.contadorTeclado = contadorTeclados;
    }
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclado=" + contadorTeclado + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miordenador;

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

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclado=" + contadorTeclado + '}';
    }
    
    
    
}

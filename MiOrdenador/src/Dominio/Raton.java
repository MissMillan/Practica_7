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
public class Raton extends DispositivoEntrada{
    //atributo
private int idRaton;
    private int contadorRatones;

    //Constructor
    public Raton(int idRaton, int contadorRatones) {
        this.idRaton = idRaton;
        this.contadorRatones = contadorRatones;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }
    
    
}

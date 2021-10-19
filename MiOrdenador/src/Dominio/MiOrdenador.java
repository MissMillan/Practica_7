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
public class MiOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Computadora comp1 = new Computadora(34, 22, 11);
           //Pedido 1
        Monitor m1 = new Monitor("Gigabyte", 34);
        Teclado t1 = new Teclado(0, 0);
        Raton r1 = new Raton(0, 0);
        Computadora com1 = new Computadora("HP oni", m1, t1, r1);
        
        Orden pedido1 = new Orden();
        pedido1.mostrarOrden();
    }
    
}

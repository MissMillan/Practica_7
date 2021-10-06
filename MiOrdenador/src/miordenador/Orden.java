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
public class Orden extends Computadora {

    //atributos
    private int idOrden;
    Computadora comp[];
    private int contadorOrdenes = 0;
    private int contadorComputadoras;
    private int maxComputadoras = 10;

    //constructor de la clase orden
    public Orden() {
    }

    //metodo paara agregar una computadora
    public void agregarComputadora(Computadora comp) {

        for (int i = 0; i < contadorComputadoras; i++) {
             
            
                /*   if(Computadora.comp[i].<coste){
                coste = v[i].getPrecio();
                indice =i;*/
                
            
           //[contadorComputadoras++] = comp;
           
        }
        }
    
    
        //metodo para mostrar la orden
    public void mostrarOrden(){
        
        
        
        System.out.println("Su id de Orden es : "+ this.idOrden+ "/n"+ "El ordenador es : "+ this.comp);
    }
    }
    
    


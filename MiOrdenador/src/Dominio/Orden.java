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
public class Orden extends Computadora {

    //atributos
    private int idOrden;
    Computadora comp[];
    //esto lo hacemos mediante el contecto estatico
    private static int contadorOrdenes = 0;
    private static int contadorComputadoras;
    private static int maxComputadoras = 10;

    //constructor de la clase orden
    public Orden() {
         contadorComputadoras = 0;
        comp = new Computadora[maxComputadoras];
        this.idOrden = ++Orden.contadorOrdenes;
    }

    //metodo paara agregar una computadora
 public void agregarComputadora(Computadora computadoras){
        if(Orden.contadorComputadoras < Orden.maxComputadoras){
            comp[Orden.contadorComputadoras++] = computadoras;
        } else {
            System.out.println("Has llegado al maximo");
        }
    }
    
    
        //metodo para mostrar la orden
    public void mostrarOrden(){
        
        
        
        System.out.println("Su id de Orden es : "+ this.idOrden+ "/n"+ "El ordenador es : "+ this.comp);
    }
    }
    
    


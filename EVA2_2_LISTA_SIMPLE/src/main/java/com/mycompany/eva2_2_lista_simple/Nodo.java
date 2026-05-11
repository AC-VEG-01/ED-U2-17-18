/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_lista_simple;

/**
 *
 * @author bisonte
 */
public class Nodo {
    
    private int valor;
    private Nodo siguiente;
    
    /// CONSTRUCTOR DEFAULT
    ///
public Nodo(){
    this.siguiente=null; /// VA A MARCAR EL FIN DE LA LISTA
    
}

public Nodo(int valor){
    this.valor=valor;
    this.siguiente=null; /// VA A MARCAR EL FIN DE LA LISTA
}
 

public Nodo getSiguiente(){ 
     return siguiente;
     
 }
 
  public void setSiguiente(Nodo siguiente){
     this.siguiente=siguiente;
 }



public int getValor(){ 
     return valor;
     
 }
 
  public void setValor(int valor){
     this.valor=valor;
 }
}

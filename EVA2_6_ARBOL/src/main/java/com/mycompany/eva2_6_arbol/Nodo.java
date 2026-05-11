/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_arbol;

/**
 *
 * @author bisonte
 */
public class Nodo {
    
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;
    
    /// CONSTRUCTOR DEFAULT
    ///
public Nodo(){
    this.derecha=null; /// VA A MARCAR EL FIN DE LA LISTA
    this.izquierda=null;
}

public Nodo(int valor){
    this.valor=valor;
    this.derecha=null; /// VA A MARCAR EL FIN DE LA LISTA
    this.izquierda=null;
       
}
 

public Nodo getDerecha(){ 
     return derecha;
     
 }
 
  public void setDerecha(Nodo derecha){
     this.derecha=derecha;
 }

  
  public Nodo getIzquierda(){ 
     return izquierda;
     
 }
 
  public void setIzquierda(Nodo izquierda){
     this.izquierda=izquierda;
 }


public int getValor(){ 
     return valor;
     
 }
 
  public void setValor(){
     this.valor=valor;
 }
}

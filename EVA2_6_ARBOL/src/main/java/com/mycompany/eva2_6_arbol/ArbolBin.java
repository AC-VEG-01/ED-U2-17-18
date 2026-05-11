/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_arbol;

/**
 *
 * @author Angel Vega
 */
public class ArbolBin {
    
    private Nodo raiz;
    
    public ArbolBin(){
        raiz=null;
    }
    
    public void agregar(int valor){
        /// VERIFICAMOS SI HAY NODOS EN EL ARBOL
            if (raiz==null){
                     raiz= new Nodo(valor);        
             }else{ // RECURSIVIDAD
                agregarRecu(raiz,valor);
              
            }
    }
    
    private void agregarRecu(Nodo actual, int valor){
        if(valor<actual.getValor()){
            
            if(actual.getIzquierda()==null){
                Nodo nuevo = new Nodo(valor);
                actual.setIzquierda(nuevo);
                
            }else{
                  
                
                
                agregarRecu(actual.getIzquierda(),valor);
           }  
        }
        
        if(valor>actual.getValor()){
                
               if(actual.getDerecha()==null){  
                Nodo nuevo = new Nodo(valor);
                actual.setDerecha(nuevo);
            }else{
                   
                agregarRecu(actual.getDerecha(),valor);
         
            }
        }   
    }
    
    public void imprimirPreOrder(){
        imprimirPreOrderRec(raiz);
    }
    
    public void imprimirPreOrderRec(Nodo actual){
        
        if(actual !=null){
        
        System.out.print("["+actual.getValor()+"]");
        
        imprimirPreOrderRec(actual.getIzquierda());
        
        imprimirPreOrderRec(actual.getDerecha());
        }
    }
    
        public void imprimirInOrder(){
        imprimirInOrderRec(raiz);
    }
    
    public void imprimirInOrderRec(Nodo actual){
        
        if(actual !=null){
        
        imprimirInOrderRec(actual.getIzquierda());
         System.out.print("["+actual.getValor()+"]");
        imprimirInOrderRec(actual.getDerecha());
           
        }
    }
        public void imprimirPostOrder(){
        imprimirPostOrderRec(raiz);
    }
    
    public void imprimirPostOrderRec(Nodo actual){
        
        if(actual !=null){
        
        imprimirPostOrderRec(actual.getIzquierda());
        imprimirPostOrderRec(actual.getDerecha());
        System.out.print("["+actual.getValor()+"]");
           
        }   
    }   
}

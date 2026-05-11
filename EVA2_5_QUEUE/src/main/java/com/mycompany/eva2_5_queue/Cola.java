/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_queue;

/**
 *
 * @author Angel Vega
 */
public class Cola {
    
   private Nodo inicio;// aqui inicia todo
   private Nodo fin;
   private int Longitud;
   
     public Cola(){
     
       this.inicio=null;
       this.fin=null;
       this.Longitud=0;
    
     }
     
      public int longitud(){ 
      return Longitud;
      }
     
     public void imprimirLista(){
      
        Nodo temp= inicio;
            while (temp!=null){
            System.out.print("["+ temp.getValor()+"]");
            temp=temp.getSiguiente();
            }
            
        System.out.println("");
    }
     
       public void imprimirListaReversa(){
      
        Nodo temp= fin;
            while (temp!=null){
            System.out.print("["+ temp.getValor()+"]");
            temp=temp.getPrevio();
            }
            
        System.out.println("");
       
    }
     
      public void vaciarLista(){
        
        inicio=null;
        fin=null;
        Longitud=0;
    }
      
     public boolean comprobarNodo(){
        if (inicio==null){
            return false;
        }else{
            return true;
        }
        
    }
     
    public void agregarNodo(int valor){
    Nodo nuevo= new Nodo(valor);
        
        if (inicio==null){
            
            inicio = nuevo;
            fin=nuevo;
        }else{
        
        fin.setSiguiente(nuevo);
        nuevo.setPrevio(fin);
        fin =nuevo;
        
    }     
        Longitud++;
    }
    
    
    
    public void borrarEn(int posi){
           
        int tama=longitud();
            if((posi<0) || (posi>=tama)){// POSICIÓN INCORRECTA
                throw  new RuntimeException("La posicion no existe en la lista");
            }else{
         
                if (posi==0){
                
                Nodo borrar= inicio;
                inicio=borrar.getSiguiente();
                Longitud--;
                }
             
                else{
                
                int cont=0;
                Nodo temp= inicio;
              
                    while (cont<posi-1){
                    temp=temp.getSiguiente();
                    cont++;   
                    }
                
                Nodo Borrar=temp.getSiguiente();
                temp.setSiguiente(Borrar.getSiguiente()); 
                Longitud--;
                    
                    if(temp.getSiguiente()==null){
                  
                    fin=temp; 
                    
                    }
                }
            }
        } 
    
    ///PUSH
    ///EN MI CÓDIGO, LA CINA DE LA PILA ES
    ///
  
    public void  push(int valor){
        agregarNodo(valor);
    }
    
    
    
    public  int front(){
            if (inicio !=null){
            return inicio.getValor();
            }else{
            throw new RuntimeException("La cola esta vacia");      
            }
    }
    
    public int pop(){
        
  
   int resu=front();
   System.out.println("Elemento: "+resu+ " Atendido!");
   borrarEn(0);
   return resu;
    }
  }



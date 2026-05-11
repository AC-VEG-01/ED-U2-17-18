 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_lista_simple;

/**
 *
 * @author bisonte
 */
public class Lista {

    
    
   private Nodo inicio;// aqui inicia todo
   private Nodo fin;
   private int Longitud;
   
   public Lista(){
       this.inicio=null;
       this.fin=null;
       this.Longitud=0;
   }
   
   public void agregar(int valor){
   //O(N)EFICENCIA POR MOVERNOS NODO POR NODO
   //O(1)EFICENCIA POR USAR UN NODO FIN
   Nodo nuevo= new Nodo(valor);    // VAMOS A INSERTAR UN NODO AL FINAL DE LA LISTA
                                   // HAY QUE VERIFICAR QUE ESTADO TIENE LA LISTA
                                   //LISTA VACIA         
        if (inicio==null){
            inicio = nuevo;
            fin=nuevo;
        }else{ 
            // ESTO ES PARA MOVER A TEMP AL ULTIMO NODO
            Nodo temp= inicio;
           
            while (temp.getSiguiente()!=null){
            temp=temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);            
           fin.setSiguiente(nuevo); //Conectamos al nodo nuevo
           fin=nuevo;// 

            }
        Longitud++;
   }
    public void imprimirLista(){
      
        Nodo temp= inicio;
            while (temp!=null){
            System.out.print("["+ temp.getValor()+"]");
            temp=temp.getSiguiente();
            }
            
        System.out.print("");
    }
    
    public void imprimirListaReversa(){  
    int cont=0;    
        
        for (int i =longitud()-1; i>=0; i--){
        
        System.out.print("["+ encontrarEn(i)+"]");
      
        }
   
    System.out.println("");
   
   }
    
    
    public void vaciarLista(){
        
        inicio=null;
        fin=null;
        Longitud=0;
    }
    
    public int longitud(){
        
     
        return Longitud;
    }
    
    public void agregarEn(int posi, int valor){
        ///VALIDAR:
        ///DE INICIO (O) HASTA Y FIN (N-1) N--> LONGITUD
        int tama=longitud();
        
        if((posi<0) || (posi>=tama)){// POSICIÓN INCORRECTA
            throw  new RuntimeException("La posicion no existe en la lista");
        
        }else{
        
        Nodo nuevo= new Nodo(valor);
         // CASOS
        
        if(posi==0){// inicio de la lista
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
            Longitud++;
        }else{// cualquier otra posicion
              //TENEMOS QUE MOVERNOS
            Nodo temp= inicio;
            int cont=0;
            
            while (cont<(posi-1)){ //temp tiene que quedar una posicion antes de posi
            temp=temp.getSiguiente();
            cont++;
            }
            //CONECTAR
            
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
            Longitud++;
        }
         
        }
    }
       
    public boolean comprobarNodo(){
        if (inicio==null){
            return false;
        }else{
            return true;
        }
        
    }
    
    public int encontrarEn(int posi){
        
        int tama=longitud();
        
            if((posi<0) || (posi>=tama)){// POSICIÓN INCORRECTA
            throw  new RuntimeException("La posicion no existe en la lista");
            
            }else{
            Nodo nuevo= new Nodo();
       
            if(posi==0){// inicio de la lista
            
            return inicio.getValor();
            
            }else{
                
            Nodo temp= inicio;
            int cont=0;
                
                while (cont<(posi)){ 
                temp=temp.getSiguiente();
                cont++;
                }
                return temp.getValor();
            }
            }   
    }
    
    
    public void borrarNodo(int posi){
         int tama=longitud();
        
        if(posi<0 || posi>=tama){// POSICIÓN INCORRECTA
            throw  new RuntimeException("La posicion no existe en la lista");
        
        }else{
        
         // CASOS
        
        if(posi==0){// inicio de la lista
        
          inicio=inicio.getSiguiente();
          
        }else{// cualquier otra posicion
              //TENEMOS QUE MOVERNOS
            Nodo temp= inicio;
            int cont=0;
            
            while (cont<(posi-1)){ //temp tiene que quedar una posicion antes de posi
            temp=temp.getSiguiente();
            cont++;
            }
            //DESCONECTAR
            Nodo nodoborrar=temp.getSiguiente();
            temp.setSiguiente(nodoborrar.getSiguiente());
            Longitud--;
            if (temp.getSiguiente()==null){
                fin=temp;
            }
        }
    
    }
}
}


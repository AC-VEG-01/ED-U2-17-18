/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_lista_simple;

/**
 *
 * @author bisonte
 */
public class EVA2_2_LISTA_SIMPLE {

    public static void main(String[] args) {
        Lista lista = new Lista();
        /*  long ini,fin,tiempo;
        Lista lista = new Lista();
        int[]arreglo= new int[1000000];
        //ini=System.nanoTime();
        
   // tiempo en segundos (mil millonesima de segundos)
        for(int i=0; i<arreglo.length; i++){
            arreglo[i]=(int)(Math.random()*1000);
        }
        //fin=System.nanoTime();
         //tiempo=fin-ini;
        System.out.println("Arreglo = "+ //tiempo);
    
        //ini=System.nanoTime();
        for(int i=0; i<1000000; i++){
        lista.agregar((int)(Math.random()*1000));
        }
        //fin=System.nanoTime();
        //tiempo=fin-ini;
        System.out.println("Lista = "+ >//tiempo);
            System.out.println("Tamaño = "+ lista.longitud());
            
        lista.vaciarLista();
        lista.imprimirLista();
            System.out.println("Tamaño = "+ lista.longitud());
    }
      /*
        
        */
        lista.agregar(100); 
         lista.agregar(200);    
          lista.agregar(300);    
        lista.imprimirLista();
        System.out.println("Cantidad de nodos: " + lista.longitud());
        lista.agregarEn(2, 400);
        lista.imprimirLista();
        System.out.println("Cantidad de nodos: " + lista.longitud());
        System.out.println("Valor encontrado en el nodo #1 : "+ lista.encontrarEn(1));
        lista.borrarNodo(3);
        lista.imprimirLista();
        lista.imprimirListaReversa();
       
      
    }      

}
    



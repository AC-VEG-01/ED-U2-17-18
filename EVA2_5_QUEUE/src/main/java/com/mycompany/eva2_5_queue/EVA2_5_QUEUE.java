/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_queue;

/**
 *
 * @author Angel Vega
 */
public class EVA2_5_QUEUE {

    public static void main(String[] args) {
     Cola cola= new Cola();
     cola.push(100);
     cola.push(200);
     cola.push(300);
     cola.push(400);
     cola.push(500);
     cola.imprimirLista();
     System.out.println("Primer elemento de la cola: "+ cola.front());
     cola.pop();
     cola.imprimirLista();
        
     
  
     
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_stack;

/**
 *
 * @author Angel Vega
 */
public class EVA2_4_STACK {

    public static void main(String[] args) {
     Pila pila= new Pila();
     pila.push(100);
     pila.push(200);
     pila.push(300);
     pila.push(400);
     pila.push(500);
     pila.imprimirLista();
     System.out.println("Elemento primero en la pila: " +pila.peek());
     pila.pop();
     pila.imprimirLista();
     
    
    }
}

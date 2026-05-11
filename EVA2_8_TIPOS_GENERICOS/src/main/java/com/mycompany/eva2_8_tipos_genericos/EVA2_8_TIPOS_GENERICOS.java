/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_tipos_genericos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Angel Vega
 */
public class EVA2_8_TIPOS_GENERICOS {

    public static void main(String[] args) {
        //int double char
        //Integer        
       LinkedList<Integer> prueba= new LinkedList<Integer>();
       prueba.add(100);
       prueba.add(200);
       prueba.add(300);
       prueba.add(400);
       
       ArrayList <String> arraylist= new ArrayList<String>();
       arraylist.add("Hola");
       arraylist.add("");
       arraylist.add("Mundo");
       arraylist.add("Bello");
       arraylist.add("!!!");
       System.out.println(arraylist);
       System.out.println("Tamano del array lista: "+ arraylist.size());
       arraylist.remove(2);
       System.out.println("Tamano del array list: "+ arraylist.size());
       System.out.println(arraylist);
    
    
    Queue <Integer> queue= new LinkedList<Integer>();
    
    queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        
            
        System.out.println(queue.peek());
        System.out.print(queue.poll()); // Nuestro pop  lee y eliminia el primer elemento
       System.out.print(queue);
       
       Stack<String> stack= new Stack<String>();
       stack.push("Hola");
       stack.push("");
       stack.push("Mundo");
       stack.push("!!");
       System.out.println(stack.peek());
       System.out.println(stack.pop());
       System.out.println(stack);
       

    }
    
    
}

class prueba<CAMOTE>{
    private CAMOTE dato;
    
    public CAMOTE  getDato(){
        return dato;
    }
    
    public  void  setDato(CAMOTE dato){
        this.dato=dato;
    }
}
    
    


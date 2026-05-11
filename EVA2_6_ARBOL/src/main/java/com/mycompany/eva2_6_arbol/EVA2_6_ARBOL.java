/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_arbol;

/**
 *
 * @author Angel Vega
 */
public class EVA2_6_ARBOL {

    public static void main(String[] args) {
         ArbolBin arbol = new  ArbolBin();
         arbol.agregar(13);
         arbol.agregar(10);
         arbol.agregar(18);
         arbol.agregar(2);
         arbol.agregar(11);
         arbol.agregar(17);
         arbol.agregar(20);
         arbol.agregar(16);
         System.out.println("PREORDER:");
         arbol.imprimirPreOrder();
         System.out.println();
         System.out.println("INORDER:");
         arbol.imprimirInOrder();
         System.out.println();
         System.out.println("POSTORDER:");
         arbol.imprimirPostOrder();
         
    }
}

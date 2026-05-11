/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_lista_doble;

/**
 *
 * @author Angel Vega
 */
public class EVA2_3_LISTA_DOBLE {

    public static void main(String[] args) {
     ListaDoble listaDoble= new ListaDoble();
     listaDoble.agregarNodo(8);
     listaDoble.agregarNodo(6);
     listaDoble.agregarNodo(4);
     listaDoble.agregarNodo(5);
     listaDoble.comprobarNodo();
     listaDoble.imprimirLista();
     listaDoble.agregarEn(3,1);
     listaDoble.imprimirLista();
     listaDoble.borrarEn(4);
     listaDoble.borrarEn(3);
     listaDoble.imprimirLista();
     
    
    }
}

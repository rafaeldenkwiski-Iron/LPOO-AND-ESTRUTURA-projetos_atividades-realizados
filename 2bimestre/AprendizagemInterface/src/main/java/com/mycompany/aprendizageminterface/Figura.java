/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aprendizageminterface;

/**
 *
 * @author rafae
 */
public interface Figura {
    public static final double pi=3.14159;
    //Metodo abstrado
    //classe concreta dever escrever ele
    double calcularArea();
    //Metodo default
    //classe concreta vai terminar de escrever este metodo
    default void mostrarDescricao(){
        System.out.print("Esta e uma figura Geometrica ");
    }
    //CLASSE CONCRETA NAO ESCREVE ESTE METODO 
    //APENAS USA
    static boolean possuiDimensaoValida(double valor){
        if (valor>0) {
            return true;
        }else{
            return false;
        }
    } 
}

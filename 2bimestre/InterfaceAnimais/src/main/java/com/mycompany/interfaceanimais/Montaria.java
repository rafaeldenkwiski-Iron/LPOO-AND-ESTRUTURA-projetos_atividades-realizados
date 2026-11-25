/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author rafae
 */
public interface Montaria {
    public static final 
            double velocidadeLimiteGalope=60;
    public static final 
            int idadeParaMontar=3;
    
    void galopar();
    
    default double calcularCargaMaxSuportada
        (double pesoAnimal){
        return pesoAnimal*10;
    }
        
    static void InspecionarEquipamentos
        (boolean temArreio, boolean cascosLimpos){
        if(temArreio==true && cascosLimpos==true){
            System.out.println("Montaria aprovada na inspecao!");
        }else{
            System.out.println("Reprovado! Certifique-se de limpar os cascos e colcocar arreio corretamente.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadesafiorpg3a1;

/**
 *
 * @author LAB3
 */
public class Personagens {
    String nome;
    String tipo;
    int PontosDeVida;
    
    public void ReceberDano(int dano){
        if(PontosDeVida>0 && PontosDeVida<=100){
            
            PontosDeVida-=dano;
                System.out.println("O personagem "+ nome +" recebeu um dano de "+ dano +" Pontos de vida atual: "+PontosDeVida);
        
        if (PontosDeVida<=0){
            System.out.println("O personagem "+nome+" nao esta mais respirando...");
        }else{
            System.out.println("O personagem "+nome+" sente uma dor aguda no peito");
        }
    }
    }   
public void curar(int cura){
    if(PontosDeVida>0 && PontosDeVida<=100){
        if(PontosDeVida+cura>100){
            PontosDeVida=100;
        }else{
            PontosDeVida+=cura;
        }
        
       System.out.println("O personagem "+nome+" recebeu uma cura de "+cura+" Pontos de vida atual: "+PontosDeVida);
    }else{
        System.out.println("O personagem "+nome+" nao tem mais pulso...");
    }
}

public void mostrarStatus(){
    System.out.println("-Status do Personagem-");
    System.out.println("Personagem: "+nome);
    System.out.println("Classe: "+tipo);
    System.out.println("Pontos de Vida: "+PontosDeVida);
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturadesafiorpg3a1;

/**
 *
 * @author LAB3
 */
public class EstruturaDesafioRPG3a1 {

    public static void main(String[] args) {
        
        Personagens personagem1= new Personagens();
        
        personagem1.nome="Saiter";
        personagem1.tipo="Tanque";
        personagem1.PontosDeVida=100;
        
        personagem1.mostrarStatus();
        
        personagem1.ReceberDano(23);
        personagem1.ReceberDano(41);
        personagem1.curar(90);
    }
}

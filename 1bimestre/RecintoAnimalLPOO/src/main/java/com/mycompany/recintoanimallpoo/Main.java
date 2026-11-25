/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recintoanimallpoo;

/**
 *
 * @author LAB3
 */
public class Main {
    public static void main(String[] args) {
        RecintoAnimalLPOO recinto1 = new RecintoAnimalLPOO("001", "Carnivoro", "Cleitao");
        
        RecintoAnimalLPOO recinto2 = new RecintoAnimalLPOO("002", "Herbivoro", "Juvicleisao");
        
        System.out.println("recinto 01");
        recinto1.mostrarInformacoes();
        System.out.println("--------------");
        System.out.println("recinto 02");
        recinto2.mostrarInformacoes();
        System.out.println("--------------");
        
        
        System.out.println("recinto 01");
        recinto1.AlimentarAnimal(10);
        System.out.println("--------------");
        System.out.println("recinto 02");
        recinto2.AlimentarAnimal(10);
        System.out.println("--------------");
        
        
        System.out.println("recinto 01");
        recinto1.LimparJaula();
        System.out.println("--------------");
        
        
        System.out.println("recinto 01");
        recinto1.MudarJaula("003");
        System.out.println("--------------");
        System.out.println("recinto 02");
        recinto2.MudarJaula("004");
        System.out.println("--------------");

        
        
        System.out.println("recinto 01");
        recinto1.mostrarInformacoes();
        System.out.println("--------------");
        System.out.println("recinto 02");
        recinto2.mostrarInformacoes();
        System.out.println("--------------");
    }
}

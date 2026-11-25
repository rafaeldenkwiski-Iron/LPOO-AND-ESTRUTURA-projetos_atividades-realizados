/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturagato;

/**
 *
 * @author LAB3
 */
public class Gatos{
    String nome;
    int idade;
    double peso;
    String cor;
    String cor_dos_olhos;
    String sexo;

public void mostrarInformacoes(){
        System.out.println("=== DADOS ===");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Peso: "+ peso);
        System.out.println("Cor: "+ cor);
        System.out.println("Cor_dos_olhos: "+ cor_dos_olhos);
        System.out.println("Sexo: "+ sexo);
    }
}
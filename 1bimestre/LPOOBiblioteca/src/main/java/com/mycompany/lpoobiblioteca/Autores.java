/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoobiblioteca;

/**
 *
 * @author LAB3
 */
public class Autores {
    int idAutor;
    String nome;
    String nacionalidade;
    String email;
    
    public void mostrarInformacoes(){
        System.out.println("=== AUTOR ===");
        System.out.println("ID: "+idAutor);
        System.out.println("NOME: "+nome);
        System.out.println("NACIONALIDADE: "+nacionalidade);
        System.out.println("EMAIL: "+email);
    }
}

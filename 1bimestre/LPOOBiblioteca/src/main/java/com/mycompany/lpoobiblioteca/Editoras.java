/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoobiblioteca;

/**
 *
 * @author LAB3
 */
public class Editoras {
    int idEditora;
    String nome;
    String cidade;
    String telefone;
    
    public void mostrarInformacoes(){
    System.out.println("=== EDITORA ===");
    System.out.println("ID: "+idEditora);
    System.out.println("NOME: "+nome);
    System.out.println("CIDADE: "+cidade);
    System.out.println("TELEFONE: "+telefone);
    }
}

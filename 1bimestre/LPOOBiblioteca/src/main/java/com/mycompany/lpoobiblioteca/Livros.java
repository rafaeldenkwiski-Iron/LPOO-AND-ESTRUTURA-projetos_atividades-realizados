/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoobiblioteca;

/**
 *
 * @author LAB3
 */
public class Livros {
    String isbn;
    String titulo;
    int ano_publicacao;
    String categoria;
    
    Editoras idEditora;
    
    public void mostrarInformacoes(){
        System.out.println("=== LIVRO ===");
        System.out.println("ISBN: "+isbn);
        System.out.println("TITULO: "+titulo);
        System.out.println("ANO: "+ano_publicacao);
        System.out.println("CATEGORIA: "+categoria);
        System.out.println("EDITORA: "+idEditora.nome);
        
    }
}

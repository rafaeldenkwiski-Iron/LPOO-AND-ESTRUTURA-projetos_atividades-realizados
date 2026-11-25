/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoobiblioteca;

/**
 *
 * @author LAB3
 */
public class Autoria {
    int idAutoria;
    Livros livro;
    Autores autor;
    
    public void mostrarInformacoes(){
        System.out.println("=== AUTORIA ===");
        System.out.println("ID: "+idAutoria);
        System.out.println("LIVROS: "+livro.titulo);
        System.out.println("AUTOR: "+autor.nome);
    }
}

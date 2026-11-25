/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpoobiblioteca;

/**
 *
 * @author LAB3
 */
public class LPOOBiblioteca {

    public static void main(String[] args) {
        
        Editoras editora1 = new Editoras();
        
        editora1.idEditora=1;
        editora1.nome="WEB NOVEL";
        editora1.cidade="Coreia do Sul";
        editora1.telefone="(11)7422-2340";
        editora1.mostrarInformacoes();
        System.out.println("");
        
        
        Livros livro1 = new Livros();
        
        livro1.isbn="118792920340";
        livro1.titulo="NANO MACHINE";
        livro1.ano_publicacao=2023;
        livro1.categoria="Artes Marciais";
        livro1.idEditora=editora1;
        livro1.mostrarInformacoes();
        System.out.println("");
        
        
        Autores autor1 = new Autores();
        
        autor1.idAutor=1;
        autor1.nome="Han-Joong-Wueol-Ya & Guem";
        autor1.nacionalidade="Sul-Coreana";
        autor1.email="HanJoong@gamil.com";
        autor1.mostrarInformacoes();
        System.out.println("");
        
        
        Autoria autoria1 = new Autoria();
        
        autoria1.idAutoria=1;
        autoria1.livro=livro1;
        autoria1.autor=autor1;
        autoria1.mostrarInformacoes();
    }
}

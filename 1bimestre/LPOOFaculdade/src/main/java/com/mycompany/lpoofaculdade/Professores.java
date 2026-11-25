/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoofaculdade;

/**
 *
 * @author LAB3
 */
public class Professores {
    int cpf;
    String nome;
    String titulacao;
    String id_professor;
    Cursos curso;
    
    public void mostrarInformacoes(){
    System.out.println("===Dados dos Professores===");
    System.out.println("CPF: "+cpf);
    System.out.println("Curso: "+curso.nome);
    System.out.println("Nome: "+nome);
    System.out.println("Titulacao: "+titulacao);
    
    }
}

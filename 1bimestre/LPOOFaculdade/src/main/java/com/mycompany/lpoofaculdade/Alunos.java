/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoofaculdade;

/**
 *
 * @author LAB3
 */
public class Alunos{
        int matricula;
        String nome;
        String cpf;
        String email;
        Cursos curso;
       
        
        public void mostrarInformacoes(){
            System.out.println("===Dados dos Alunos===");
            System.out.println("Matricula: "+matricula);
            System.out.println("Nome: "+nome);
            System.out.println("CPF: "+cpf);
            System.out.println("Email: "+email);
            System.out.println("Departamento: "+curso.nome);
            System.out.println("Departamento: "+curso.departamento);
        }
}
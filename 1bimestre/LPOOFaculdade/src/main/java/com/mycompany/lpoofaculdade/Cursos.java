/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoofaculdade;

/**
 *
 * @author LAB3
 */
public class Cursos {
    int id_curso;
    String nome;
    String departamento;
    
    public void mostraInformacoes(){
        System.out.println("===Dados dos Cursos===");
        System.out.println("Id_curso: "+id_curso);
        System.out.println("Nome: "+nome);
        System.out.println("Departamento: "+departamento);
    }
}

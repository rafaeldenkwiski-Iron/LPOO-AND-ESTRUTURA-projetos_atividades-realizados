/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpoofaculdade;

/**
 *
 * @author LAB3
 */
public class LPOOFaculdade {

    public static void main(String[] args) {
        Cursos cursoTi = new Cursos();
        cursoTi.id_curso=1;
        cursoTi.nome="TADS";
        cursoTi.departamento="Informatica";
        
        Alunos aluno1 = new Alunos();
        aluno1.matricula=1234;
        aluno1.nome="Roberto Capivariano";
        aluno1.cpf="8752634";
        aluno1.email="capivariano@gmail.com";
        aluno1.curso=cursoTi;
        aluno1.mostrarInformacoes();
        
        
        System.out.println("");
        
        Professores professo1 = new Professores();
        professo1.cpf=9727310;
        professo1.nome="Andre Duarte";
        professo1.titulacao="Analise de Sistemas";
        professo1.curso=cursoTi;
        professo1.mostrarInformacoes();
        
        
        System.out.println("");
        Disciplinas disciplina1 = new Disciplinas();
        disciplina1.id_disciplina=1;
        disciplina1.curso=cursoTi;
        disciplina1.professor=professo1;
        disciplina1.nome="Andre Duarte";
        disciplina1.carga_horaria=50;
        disciplina1.periodo=4;
        disciplina1.mostrarInformacoes();
        
        
    }
}
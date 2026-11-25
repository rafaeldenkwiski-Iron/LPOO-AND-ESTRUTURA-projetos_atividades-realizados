/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturadadosaula1;

/**
 *
 * @author LAB3
 */
public class EstruturaDadosAula1 {

    public static void main(String[] args) {
        //CRIAR PRIMEIRO OBJETO ALUNO
        //REGRA PARA CRIA OBJETO: NOME DA CLASSE SEGUIDO
        //DE NOME DO OBJETO SEGUIDO DE " = new" SEGUIDO DE NOME DA CLASSE ();
        System.out.println("");
        System.out.println("Aluno 1");
        Alunos aluno1 = new Alunos();
        aluno1.matricular();
        aluno1.matricula=123;
        aluno1.media=8.5;
        aluno1.nome="Patrick de Paula";
        aluno1.online=false;
        
        aluno1.mostrarInformacoes();
        
        System.out.println("");
        System.out.println("Aluno 2");
        Alunos aluno2 = new Alunos();
        aluno2.matricular();
        aluno2.matricula=1234;
        aluno2.media=7.3;
        aluno2.nome="Paula das Rosas";
        aluno2.online=true;
        
        aluno2.mostrarInformacoes();
        
        System.out.println("");
        System.out.println("Aluno 3");
        Alunos aluno3 = new Alunos();
        aluno3.matricular();
        aluno3.matricula=12345;
        aluno3.media=9.3;
        aluno3.nome="Bob";
        aluno3.online=false;
        
        aluno3.mostrarInformacoes();
        
    }
}

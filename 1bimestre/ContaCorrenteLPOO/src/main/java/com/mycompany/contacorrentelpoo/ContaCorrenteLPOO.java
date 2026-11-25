/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contacorrentelpoo;

/**
 *
 * @author LAB3
 */
public class ContaCorrenteLPOO {

    private int numero;
    private String titular;
    private double saldo;
    private String cpf;
    private int senha;
    
    //METODO CONSTRUTOR
    //MESMO NOME DA CLASSE
    
    public ContaCorrenteLPOO(int numeroConta, String titularNome, String cpfInformado, int senhaInformada){
        numero=numeroConta;
        titular=titularNome;
        saldo=0.00;
        cpf=cpfInformado;
        senha=senhaInformada;
    } 
    
    public void setTitular(String nomeTitular){
    titular=nomeTitular;
    }
    
    public void setSenha(int senhaTitular){//METODO SEM RETORNO 'VOID'
    senha=senhaTitular;
    }
    
    public int getNumero(){//METODO COM RETORNO 'INT'
        return numero;
    }
    public String getTitular(){//METODO COM RETORNO 'STRING'
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getSenha(){
        return senha;
    }
    
    public void mostrarInformacoes(){
        System.out.println("====EXTRATO BANCARIO====");
        System.out.println("Conta: "+getNumero());
        System.out.println("Titular: "+getTitular());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Cpf: "+getCpf());
    }
    //SACAR
    public void sacar(double valorSaque, int senhaDigitada){
        if((valorSaque<=getSaldo())&&(senhaDigitada==getSenha())){
            saldo-=valorSaque;
            System.out.println("Saque realizado com sucesso");
        }else if(senhaDigitada!=getSenha()){
            System.out.println("Senha incorreta");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    //DEPOSITAR
    public void depositar(double valorDeposito){
        saldo+=valorDeposito;
        System.out.println("Deposito realizado com sucesso");
    }
    //TRANSFERENCIA
    public void transferir(double valorTransferencia, ContaCorrenteLPOO contaDestino){
        if(this.getSaldo()>=valorTransferencia){
            this.saldo-=valorTransferencia;
            contaDestino.saldo+=valorTransferencia;
            System.out.println("Transferencia realizada");
            this.mostrarInformacoes();
            contaDestino.mostrarInformacoes();
        }else{
            System.out.println("Transferencia nao realizada");
        }
    }
    
}

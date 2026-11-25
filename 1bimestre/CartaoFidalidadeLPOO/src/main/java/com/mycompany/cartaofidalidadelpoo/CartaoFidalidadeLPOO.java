/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cartaofidalidadelpoo;

/**
 *
 * @author LAB3
 */
public class CartaoFidalidadeLPOO {
    
    private String nome;
    private String cpf;
    private int saldoPontos;
    
    
    public CartaoFidalidadeLPOO(String nomeCliente, String cpfInfo){
        
        nome=nomeCliente;
        cpf=cpfInfo;
        saldoPontos=0;
    }
    //SET
    public void setNomeCliente(String nomeCliente){
        nome=nomeCliente;
    }
    public void setCpf(String cpfInfo){
        cpf=cpfInfo;
    }
   
    //GET
    public String getnome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getSaldoPontos(){
        return saldoPontos;
    }
    

    public void mostrarInformacoes(){
        System.out.println("====CARTAO FIDALIDADE====");
        System.out.println("Cliente: "+getnome());
        System.out.println("CPF: "+getCpf());
        System.out.println("PONTOS: "+getSaldoPontos());
        System.out.println("=================================");
    }
    
    //PONTOS
    public void ganharpontos(double valorCompra){
    if (valorCompra>=0){
        saldoPontos+=valorCompra*10/100;
        System.out.println("Voce obteve mais pontos: "+saldoPontos);
        System.out.println("=================================");
    }else{
        System.out.println("Voce nao obteve mais pontos...");
        System.out.println("=================================");
        }
    }
    
    public void resgatar(String produto, int produtoPontos){
        if (saldoPontos>=produtoPontos){
            saldoPontos-=produtoPontos;
            
            System.out.println("Voce resgatou o "+produto+". pontos restantes: "+saldoPontos);
            System.out.println("=================================");
        }else{
            System.out.println("Pontos insuficiente...");
            System.out.println("=================================");
        }
    }
    
    public void transferirPontos(int quantidade, CartaoFidalidadeLPOO cartao){
    
        if(quantidade<=this.saldoPontos){
            saldoPontos-=quantidade;
            cartao.saldoPontos+=quantidade;
            this.mostrarInformacoes();
            //cartao.mostrarInformacoes();
            
        }else{
            System.out.println("Pontos insuficiente...");
        }
    } 
    
}

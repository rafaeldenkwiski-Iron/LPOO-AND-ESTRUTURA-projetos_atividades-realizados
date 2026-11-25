/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recintoanimallpoo;

/**
 *
 * @author LAB3
 */
public class RecintoAnimalLPOO {

private String codigoJaula;
private String especie;
private String tratador;
private double racao;
private boolean limpo;

public RecintoAnimalLPOO(String codigo, String especieAnimal, String nomeTratador){
    codigoJaula=codigo;
    especie=especieAnimal;
    tratador=nomeTratador;
    racao=50.00;
    limpo=true;
}

//SET
public void setCodigoJaula(String codigo){
    codigoJaula=codigo;
}
public void setEspecie(String especieAnimal){
    especie=especieAnimal;
}
public void setTrarador(String nomeTratador){
    tratador=nomeTratador;
}
public void setRacao(double quantidade){
    racao=quantidade;
}
public void setLimpo(boolean limpeza){
    limpo=limpeza;
}

//GET
public String getCodigoJaula(){
    return codigoJaula;
}
public String getEspecie(){
    return especie;
}
public String getTratador(){
    return tratador;
}
public double getRacao(){
    return racao;
}
public boolean getLimpo(){
    return limpo;
}

public void mostrarInformacoes(){
    System.out.println("RECINTO ANIMAL");
    System.out.println("Codigo da jaula: "+getCodigoJaula());
    System.out.println("Especie: "+getEspecie());
    System.out.println("Tratador: "+getTratador());
    System.out.println("Racao Desponivel: "+getRacao());
    System.out.println("Limpo: "+getLimpo());
}

public void MudarJaula(String novaJaula){
    if(limpo==true){
        this.codigoJaula=novaJaula;
        System.out.println("Foi para outra Jaula: "+novaJaula);
    }else{
        System.out.println("Nao foi permitido a mudanca da Jaula");
    }
}

public void LimparJaula(){
    this.limpo=true;
    System.out.println("Esta limpo a Jaula.");
}

public void AlimentarAnimal(double Alimentado){
    if(racao>=Alimentado){
     racao-=Alimentado;
    System.out.println("A quantidade de Racao atual: "+racao);
    limpo=false;
    }else{
        System.out.println("Quantidade Insuficiente");
    }
   
}
}

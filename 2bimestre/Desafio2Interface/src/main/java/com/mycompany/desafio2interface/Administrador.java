/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio2interface;

/**
 *
 * @author rafae
 */
public class Administrador implements Autenticavel{    

    @Override
    public boolean realizarLogin(String usuario, String senha) {
        if(Autenticavel.super.realizarLogin(usuario, senha)==true){
            System.out.println("ATENCAO: ACESSO ADMINISTRATIVO REGISTRADO NOS LOGS!");
            System.out.println("===================================");
            return true;
        }else{
            System.out.println("ACESSO BLOQUEADO. TENTATIVA LOGIN ADMINISTRATIVO COM SENHA FRACA!");
            System.out.println("===================================");
            return false;
        }
    }
   
}

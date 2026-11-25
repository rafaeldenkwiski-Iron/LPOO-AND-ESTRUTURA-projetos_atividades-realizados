/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.desafio2interface;

/**
 *
 * @author rafae
 */
public interface Autenticavel {
    public static final int TAMANHHO_MINIMO_SENHA=8;
    
    static boolean validarForcaSenha(String senha){
        if (TAMANHHO_MINIMO_SENHA <= senha.length()) {
            return true;
        }else{
            return false;
        }
    }
    
    default boolean realizarLogin(String usuario, String senha){
        if (validarForcaSenha(senha)==true) {
            System.out.println("===================================");
            System.out.println("Usuario "+usuario+", Logado com sucesso");
            System.out.println("===================================");
            return true;
        }else{
            System.out.println("===================================");
            System.out.println("Senha muito fraca. "
        + "Tente Novamente ussando pelo menos oito caracteres");
            System.out.println("===================================");
            return false;
        }
    }
}

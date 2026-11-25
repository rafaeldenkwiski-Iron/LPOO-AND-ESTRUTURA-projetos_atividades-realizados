/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio2interface;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Desafio2Interface {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        UsuarioComum usuario = new UsuarioComum();
        Administrador admin = new Administrador();
        
        Autenticavel[] usuarios = {usuario,usuario,admin,admin};
        
        for (int i=0;i<usuarios.length;i++) {
            System.out.println("=============================================");
            System.out.println("==========SISTEMA DE AUTENTICACCAO===========");
            System.out.println("INFORME O USUARIO");
            String user = teclado.nextLine();
            System.out.println("INFORME A SENHA");
            String senha = teclado.nextLine();
            usuarios[i].realizarLogin(user, senha);
        }
    }
}

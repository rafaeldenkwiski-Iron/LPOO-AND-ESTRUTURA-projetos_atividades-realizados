/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio1interface;

/**
 *
 * @author rafae
 */
public class NotificacaoSms implements Notificador{

    @Override
    public void enviarMensagem(String destinatario, String texto) {
        System.out.println("===================================");
        System.out.println("Enviando SMS para "+destinatario+": Texto: "+texto);
        System.out.println("===================================");
    }
    
}

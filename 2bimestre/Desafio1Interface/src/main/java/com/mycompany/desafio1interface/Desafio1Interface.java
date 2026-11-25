/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio1interface;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Desafio1Interface {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        NotificacaoEmail email = new NotificacaoEmail();
        NotificacaoSms sms = new NotificacaoSms();
        
        Notificador[] notificadores={email, sms};
        
        for (int i = 0; i < notificadores.length; i++) {
            System.out.println("Informe Destinatario");
            String destinatario = teclado.nextLine();
            System.out.println("Informe texto");
            String texto=teclado.nextLine();
            notificadores[i].enviarMensagem(destinatario, texto);
        }
    }
}

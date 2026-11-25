/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetordesafio3;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorDesafio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PedidoInternacional pedido1=new PedidoInternacional();
        PedidoInternacional pedido2=new PedidoInternacional();
        
        Pedido[] pedidos={pedido1,pedido2};
        
        for (int i=0;i<pedidos.length;i++) {
            System.out.println("=========SISTEMA E-COMMERCE==========");
            System.out.println("INFORME A DISTANCIA EM KM");
            double distancia = teclado.nextDouble();
            double frete = pedidos[i].calcularFrete(distancia);
            System.out.println("=====================================");
            System.out.println("VALOR DO FRETE R$ "+frete);
            System.out.println("=====================================");
            double taxa = pedidos[i].taxaFixa();
            System.out.println("VALOR DA TAXA DE SERVICO R$ "+taxa);
            System.out.println("=====================================");
            System.out.println("INFORME O VALOR DA COMPRA");
            double compra=teclado.nextDouble();
            System.out.println("=====================================");
            System.out.println("INFORME O CUPOM");
            String cupom = teclado.next();
            System.out.println("=====================================");
            double valorFinal = pedidos[i].aplicarDesconto(compra, cupom);
            double valorPagar=frete+taxa+valorFinal;
            System.out.println("VALOR A PAGAR R$ "+valorPagar);
            System.out.println("=====================================");
        }
    }
}

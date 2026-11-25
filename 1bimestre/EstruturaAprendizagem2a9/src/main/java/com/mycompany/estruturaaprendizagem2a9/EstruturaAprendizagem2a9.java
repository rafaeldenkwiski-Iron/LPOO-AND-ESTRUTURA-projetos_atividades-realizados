/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem2a9;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaAprendizagem2a9 {

    public static void main(String[] args) {
        double compra;
        boolean vip;
        double desconto;
        double valorFinal;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor da compra");
        compra=teclado.nextDouble();
        
        System.out.println("VIP(SIM/NAO)");
        vip=teclado.nextBoolean();
        
        if(compra>=200 || vip==true){
            desconto=compra*10/100;
            valorFinal=compra-desconto;
            System.out.println("Desconto de "+desconto);
            System.out.println("Valor Final: "+valorFinal);
        }else{
        System.out.println("Nao tem desconto");        
        }
    }
}

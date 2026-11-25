/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem2a4;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaAprendizagem2a4 {

    public static void main(String[] args) {
        int n1;
        
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("===Informe um Numero===");
        n1=teclado1.nextInt();
        
        if (n1%5==0){
            System.out.println("O numero e divisivel por 5");
        } else{
            System.out.println("O numero nao e divisivel por 5");
        }
    }
}

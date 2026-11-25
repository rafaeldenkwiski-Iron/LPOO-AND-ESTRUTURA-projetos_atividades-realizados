/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem2a6;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaAprendizagem2a6 {

    public static void main(String[] args) {
        double altura;
        double peso_ideal;
        String sexo;
        
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Informe a Altura");
        altura=teclado1.nextDouble();
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Sexo(M/F)");
        sexo=teclado2.nextLine();
        
        if (sexo.equalsIgnoreCase("M")){
        peso_ideal=(72.7*altura)-58;
        }else{
        peso_ideal=(62.1*altura)-44.7;
        }
        System.out.println("Peso Ideal "+ peso_ideal);
    }
}

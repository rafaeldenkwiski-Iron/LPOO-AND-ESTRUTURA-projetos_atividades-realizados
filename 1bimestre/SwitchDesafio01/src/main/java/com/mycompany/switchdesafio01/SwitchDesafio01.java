/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchdesafio01;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class SwitchDesafio01 {

    public static void main(String[] args) {
        int opecao;
        
        int codigo;
        
        
        
        Scanner teclado = new Scanner(System.in); 
            System.out.println("---DIGITE O CODIGO---");
            codigo=teclado.nextInt();
            
            switch(codigo){
                case 1:{
                    System.out.println("ALIMENTO NAO-PERECIVEL");
                    break;
                }
                case 2:    
                case 3:
                case 4:{
                    System.out.println("ALIMENTO PERECIVEL");
                    break;
            }
                case 5:
                case 6:{
                    System.out.println("VESTUARIO");
                    break;
                }
                case 7:{
                    System.out.println("HIGIENE PESSOAL");
                    break;
                }
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:{
                    System.out.println("LIMPEZA E UTENSILIOS DOMESTICOS");
                    break;
                }
                default:
                    System.out.println("CODIGO INVALIDO");
                }
                
            }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturagato;

/**
 *
 * @author LAB3
 */
public class EstruturaGato {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Gato 1");
        Gatos gato1 = new Gatos();
        gato1.nome="Fia";
        gato1.idade=6;
        gato1.peso=8;
        gato1.cor="laranja";
        gato1.cor_dos_olhos="olhos verde e azul";
        gato1.sexo="femea";
        
        gato1.mostrarInformacoes();
        
        System.out.println("");
        System.out.println("Gato 2");
        Gatos gato2 = new Gatos();
        gato2.nome="Astolfo";
        gato2.idade=7;
        gato2.peso=7;
        gato2.cor="cinza";
        gato2.cor_dos_olhos="olhos lilas";
        gato2.sexo="macho";
        
        gato2.mostrarInformacoes();
    }
}

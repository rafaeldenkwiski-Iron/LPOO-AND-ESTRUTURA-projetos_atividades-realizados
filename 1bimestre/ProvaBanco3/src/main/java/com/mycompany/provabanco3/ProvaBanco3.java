/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provabanco3;

/**
 *
 * @author LAB3
 */
public class ProvaBanco3 {

    public static void main(String[] args) {
        CarroEletrico TeslaModelY = new CarroEletrico("Tesla Model Y", 20, true);
        
        TeslaModelY.viajar(20);
        System.out.println("");
        
        
        TeslaModelY.setModoEcoAtivado(true); 
          
        
        TeslaModelY.viajar(15);
        System.out.println("");
        

        TeslaModelY.exibirPainel();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceanimais;

/**
 *
 * @author rafae
 */
public class InterfaceAnimais {

    public static void main(String[] args) {
        /*Cachorro diluvio = new Cachorro("Diluvio", 3);
        diluvio.emitirSom();
        diluvio.comer();
        diluvio.brincarComHumanos();
        diluvio.envelhecer();*/
        
        Cavalo peDePano = new Cavalo("PeDePano", 2);
        
        peDePano.emitirSom();
        peDePano.comer();
        peDePano.brincarComHumanos();
        
        Montaria.InspecionarEquipamentos(true, true);
        peDePano.envelhecer();
        
        peDePano.galopar();
        
        System.out.println("Peso máximo suportado para carga "+peDePano.calcularCargaMaxSuportada(515));
        
        
    }
}

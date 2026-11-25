/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provabanco3;

/**
 *
 * @author LAB3
 */
public class CarroEletrico {
    private String modelo;
    private int bateriaPorcentagem;
    private boolean modoEcoAtivado;
    
    public CarroEletrico(String modeloCarro, int bateriaPorcentagemCarro, boolean modoEcoAtivadoCarro){
    modelo=modeloCarro;
    bateriaPorcentagem=100;
    modoEcoAtivado=false;
    };

    public void viajar(int km){
        bateriaPorcentagem-=km;
        if (bateriaPorcentagem>0 && km>0) {
            if (modoEcoAtivado=true) {
                int consumo = km*1;
                System.out.println("BATERIA RESTANTE: "+bateriaPorcentagem);  
            }else{
                int consumo = km*2;
                System.out.println("BATERIA RESTANTE: "+bateriaPorcentagem);
            }
        
            if(bateriaPorcentagem<=15 || modoEcoAtivado==true){
                System.out.println("ALERTA: ATIVAR POSTO DE RECARGA PROXIMO!!");
                System.err.println("VIAGEM DE "+km+" KM, REALIZADA COM SUCESSO.");
            }
        }
    };
    
    public void carregar(){
        bateriaPorcentagem=100;
    };
    
    public void exibirPainel(){
        System.out.println("PAINEL DE CONTROLE");
        System.out.println("MODELO: "+getModelo());
        System.out.println("BATERIA: "+getBateriaPorcentagem());
        System.out.println("STATUS DO MODO ECONOMICO: "+isModoEcoAtivado());
    };
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the bateriaPorcentagem
     */
    public int getBateriaPorcentagem() {
        return bateriaPorcentagem;
    }

    /**
     * @return the modoEcoAtivado
     */
    public boolean isModoEcoAtivado() {
        return modoEcoAtivado;
    }

    /**
     * @param modoEcoAtivado the modoEcoAtivado to set
     */
    public void setModoEcoAtivado(boolean modoEcoAtivado) {
        this.modoEcoAtivado = modoEcoAtivado;
    }
}

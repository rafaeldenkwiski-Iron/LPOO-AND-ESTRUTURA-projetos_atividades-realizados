/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aprendizageminterface;

/**
 *
 * @author rafae
 */
public class Retangulo implements Figura{
double base;
double altura;

public Retangulo(double baseInformada, double alturaInformada){
    if (Figura.possuiDimensaoValida(baseInformada)==true) {
            this.base=baseInformada;
    }else{
        System.out.println("NAO ACEITA VALORES NEGATIVOS");
            this.base=1.0;
    }
    if (Figura.possuiDimensaoValida(alturaInformada)==true) {
            this.altura=alturaInformada;
    }else{
        System.out.println("NAO ACEITA VALORES NEGATIVOS");
            this.altura=1.0;
    }
}

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public void mostrarDescricao() {
        System.out.println("Retangulo com base "+this.base+" e altura "+this.altura);
    }
    
}

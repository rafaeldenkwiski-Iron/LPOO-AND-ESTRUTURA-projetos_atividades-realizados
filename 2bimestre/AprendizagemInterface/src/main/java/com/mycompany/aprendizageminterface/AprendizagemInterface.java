/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprendizageminterface;

/**
 *
 * @author rafae
 */
public class AprendizagemInterface {

    public static void main(String[] args) {
        Circulo c = new Circulo(-10);
        c.mostrarDescricao();
        System.out.println("AREA DO CIRCULO "+c.calcularArea());
        
        System.out.println("");
        
        Quadrado q = new Quadrado(10);
        q.mostrarDescricao();
        System.out.println("AREA DO CIRCULO "+q.calcularArea());
        
        System.out.println("");
        
        Triangulo t = new Triangulo(10, 15);
        t.mostrarDescricao();
        System.out.println("AREA DO TRIANGULO "+t.calcularArea());
        
        System.out.println("");
        
        Retangulo r = new Retangulo(20, 5);
        r.mostrarDescricao();
        System.out.println("AREA DO RETANGULO "+r.calcularArea());
        
        System.out.println("");
        
        Trapezio tr = new Trapezio(30, 20, 50);
        tr.mostrarDescricao();
        System.out.println("AREA DO TRAPEZIO "+tr.calcularArea());
    }
}

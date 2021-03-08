/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pr_figuras;

/**
 *
 * @author User
 */
public class triangulo implements Ifigurafactory{

    
    private final float base;
    private final float altura;

    public triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float area() {
        
        return (base*altura)/2;
        
    }

  
}

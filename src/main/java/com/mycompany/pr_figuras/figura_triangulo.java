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
public class figura_triangulo extends figura{

    private final float base;
    private final float altura;

    public figura_triangulo(float base, float altrua) {
        this.base = base;
        this.altura = altrua;
    }
    
    @Override
    public Ifigurafactory factorymethod() {

        return new triangulo(base,altura);
    }
    
    
    
    
}

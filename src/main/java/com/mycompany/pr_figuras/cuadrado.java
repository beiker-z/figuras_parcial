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
public class cuadrado implements Ifigurafactory{

    private final float lado;

    public cuadrado(float lado) {
        this.lado = lado;
    }
    
    
    @Override
    public float area() {
    
     return lado*lado;
     
     
    }

   
    
    
}

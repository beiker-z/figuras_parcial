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
public class rectangulo implements Ifigurafactory{
    
    private final float a;
    private final float b;

    public rectangulo(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float area() {

            return a*b;
    }

  
   
    
}

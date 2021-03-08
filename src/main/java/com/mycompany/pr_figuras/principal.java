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
public class principal {
    
    public static void main(String[] args) {
        
        
           mostrararea(new figuracuadrada(12));
           mostrararea(new figurarecntangulo(5, 4));
           mostrararea(new figura_triangulo(12, 4));
           
        
        
    }
    
    
    public static void mostrararea(figura obj){
        
 
        System.out.println(obj.calculararea());

        
    }
}

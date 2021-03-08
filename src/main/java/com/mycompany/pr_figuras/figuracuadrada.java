
package com.mycompany.pr_figuras;


public class figuracuadrada extends figura{

    private final float lado;

    public figuracuadrada(float lado) {
        this.lado = lado;
    }
    
    @Override
    public Ifigurafactory factorymethod() {
 
        return new cuadrado(this.lado);
        
    }
    
    
    
    
    
}


package com.mycompany.pr_figuras;

public abstract class figura {

    public abstract Ifigurafactory factorymethod();
   
    public float calculararea(){
    
        Ifigurafactory fig = factorymethod();
        return fig.area();
    
    }
    
   
}

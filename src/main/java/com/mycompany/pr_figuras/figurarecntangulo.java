
package com.mycompany.pr_figuras;

public class figurarecntangulo extends figura{


    private final float a;
    private final float b;

    public figurarecntangulo(float a, float b) {
        this.a = a;
        this.b = b;
    }
    

    @Override
    public Ifigurafactory factorymethod() {
  
   return new rectangulo(a, b);
        
    }
    
}

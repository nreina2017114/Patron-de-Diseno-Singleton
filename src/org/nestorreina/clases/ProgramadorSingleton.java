
package org.nestorreina.clases;

import javax.swing.JFrame;
import org.nestorreina.sistema.Programador;


public class ProgramadorSingleton {
    
    private static JFrame Pro;

    public ProgramadorSingleton() {
    }
    
    public static JFrame getInstance(){
        if (Pro == null) {
            Pro = new Programador();
            
        }
        return Pro;
    }
}

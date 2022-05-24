
package Hilos;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.DefaultListModel;

/**
 *
 * @author Marcos Mata
 */
public class E31 {
     DefaultListModel modelo= new DefaultListModel();
         public Thread hilo=new Thread();
    
     
    public void run(){
        for (int i = 0; i < 6; i++) {
            
       //modelo.addElement(hilo);
        modelo.addElement(" MAIN "+i);
        Tres.lista3.setModel(modelo);
        try {
                    Thread.sleep(800);
                } catch (Exception e) {
                    System.out.println("Algo anda mal");
                }
        
     
    
    
}
    }
     
    
}

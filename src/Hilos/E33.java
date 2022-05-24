/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import javax.swing.DefaultListModel;

/**
 *
 * @author Marcos Mata
 */
public class E33 implements Runnable{
     DefaultListModel modelo= new DefaultListModel();
         public Thread hilo=new Thread();
    
     
    public void run(){
        for (int i = 0; i < 6; i++) {
            
       //modelo.addElement(hilo);
        modelo.addElement(" MAIN "+i);
        //modelo.addElement(""+hilo.isAlive());
        
        Tres.lista2.setModel(modelo);
        try {
                    Thread.sleep(800);
                } catch (Exception e) {
                    System.out.println("Algo anda mal");
                }
        
     
    
    
}
    }
}

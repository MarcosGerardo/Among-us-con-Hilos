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
public class E32 implements Runnable {
    DefaultListModel modelo= new DefaultListModel();
    public Thread hilo=new Thread();
    public void run(){
        
            for(char i ='A';i<'K';i++){
                modelo.addElement("Prioridad "+hilo.getPriority());
        modelo.addElement(" "+i);
        Tres.lista1.setModel(modelo);
        
                try {
                    Thread.sleep(800);
                } catch (Exception e) {
                    System.out.println("Algo anda mal");
                }
        }
        
        
        
        
    }
    
    
}

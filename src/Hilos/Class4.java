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
public class Class4 implements Runnable{
    public Thread Hilo;
    String N_hilo;
    
    static MetodosCuatro obj = new MetodosCuatro();
    DefaultListModel modelo = new DefaultListModel();
    
    
    Class4(String nombrehilo){
        Hilo = new Thread(this, nombrehilo);
        N_hilo = nombrehilo;
    }
    
    public void run()  
    {
      synchronized(obj)
        {
           
            if(N_hilo=="Sub_Hilo1")
            {
                obj.Hilo1();
            }
            
            if(N_hilo=="Sub_Hilo2"){
                
                obj.Hilo2();
              }
            if(N_hilo=="Sub_Hilo3"){
            
                obj.Hilo3();
            }
            if(N_hilo=="Sub_Hilo4")
            {
            
                obj.Hilo4();
               }
          
        }
    }
    
}

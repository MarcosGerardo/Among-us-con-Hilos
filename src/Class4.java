

import Hilos.MetodosCuatro;
import javax.swing.DefaultListModel;

public class Class4 implements Runnable {
    public Thread Hilo;
    String N_hilo;
    
 static  MetodosCuatro obj = new MetodosCuatro();
    DefaultListModel modelo = new DefaultListModel();
    
    
    Class4(String nombrehilo){
        Hilo = new Thread(this, nombrehilo);
        N_hilo = nombrehilo;
    }
    
   
    @Override
    public void run()  
    {
      synchronized(obj)
        {
           
            if(N_hilo=="Sub_Hilo1")
            {
               obj.CicloHilo1();
            }
            
            if(N_hilo=="Sub_Hilo2"){
                
                obj.CicloHilo2();
              }
            if(N_hilo=="Sub_Hilo3"){
            
                obj.CicloHilo3();
            }
            if(N_hilo=="Sub_Hilo4")
            {
            
                obj.CicloHilo4();
               }
          
        }
    }
    }    
    

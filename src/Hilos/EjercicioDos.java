/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import javax.swing.JLabel;

public class EjercicioDos extends Thread{
public Thread Hilo;
   String N_hilo;
   public boolean iterar;
 
   
   EjercicioDos(String nombrehilo)//Constructor
    {
       Hilo=new Thread (this,nombrehilo);
       N_hilo=nombrehilo;
       System.out.println("Sistema contra incendios :  "+Hilo.getName());
       Hilo.start();//Llama al metodo run() Se ejecuta el subproceso

    }
@Override
    public void run()
    {
         if(N_hilo=="El sistema esta Activdado")
        {
           do {                
                
            
          
           System.out.println("Sistema de alarma activado : Hay un cadaver");
             try {//Intentar
            Thread.sleep(1000);
           //duerme 1000 milisegundos cuando el proceso duerme continua la ejecucion otro
            }
            catch(InterruptedException exc)
            {
            System.out.println("Interrupcion en Hilo");
            }
            }while(0==0);
          
          
        }
         if(N_hilo=="El sistema se ha descativado")
        {
            try {      
                iterar=false;
      Hilo.stop();
       System.out.println("ALARMA DESACTIVAVA POR EL IMPOSTOR");
      System.out.println("                 el impostor logro su objetivo!!");
            
                
            } catch (Exception ex) {
                System.out.println("ISE HA SABOTEADO EL PROGRAMA");
            }
     
        }
         
    }  
   
    
    
    


  public void detener(){
      iterar=false;
 
       System.out.println("ALARMA DESACTIVAVA POR EL IMPOSTOR");
      System.out.println("                 el impostor logro su objetivo!!");
  }
      
}


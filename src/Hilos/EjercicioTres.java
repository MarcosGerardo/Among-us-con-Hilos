/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author Marcos Mata
 */
public class EjercicioTres implements Runnable{
    public Thread hilo;
String n_hilo;
 LeerArchivo obj=new LeerArchivo ();
    public EjercicioTres(String nombrehilo)
    { 
    hilo=new Thread (this,nombrehilo);
    n_hilo=nombrehilo;//almacena el nombre del hilo
    System.out.println("Comienza el hilo de nombre :\t "+hilo.getName());
  
    hilo.start();
        
    }
   public void  run(){
          synchronized (obj){
            
            if(n_hilo=="Nom_Hilo1")
            obj.LeerArchivaje("C:\\Users\\Marcos Mata\\Desktop\\programa.TXT");
            
            if(n_hilo=="Nom_Hilo2")
            obj.Ciclo();
            
             if(n_hilo=="Nom_Hilo3")
            obj.Captura();
            
             if(n_hilo=="Nom_Hilo4")
         {
             try{
                 Thread.sleep(1500);
                 if(hilo.isAlive());
                 System.out.println("");
                  System.out.println("");
                   System.out.println("");
                    System.out.println("");
                 
                 
                } catch(InterruptedException exc){
                     System.out.println("Interrupcion del Hilo");
                    }
                }
                if(n_hilo=="Nom_Hilo5")
                obj.imprimeArchivo();
            }
        
        
           }
    
}

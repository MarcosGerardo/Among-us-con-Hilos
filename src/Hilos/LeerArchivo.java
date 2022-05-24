/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.io.*;
public class LeerArchivo {
    
    
    
      public Thread hilo;
   String n_hilo;
   String cadena;
    
 
    void LeerArchivaje(String Archivo){
   try{
    Thread.sleep(1000);
    try{
    
    String concatenado="";
    FileReader obj1= new FileReader(Archivo);
    BufferedReader obj2= new BufferedReader(obj1);
    cadena=obj2.readLine();
    obj2.close();
    concatenado+=cadena+"\n";
}
    catch(Exception e)
   {
       System.out.println("Excepcion"+e);
   }
}
   catch(InterruptedException e2)
   {
       System.out.println("excepcion"+e2);
   }
   }
    void Captura(){
        try {
            for(char i ='A';i<'J';i++){
        System.out.println(i);
        }
            
        } catch (Exception e) {
            System.out.println("Interrupcion de hilo");
        }
        
    }
    void Ciclo(){
        
        try {
            for(int i =1;i<11;i++){
                System.out.println("HiUno: "+i);
                   
                }
        } catch (Exception e) {
             System.out.println("Interrupcion de hilo");
        }
        
        
    }
    void imprimeArchivo(){
        
        System.out.println(cadena);
      
        
        
        
        
    }
    
    
}

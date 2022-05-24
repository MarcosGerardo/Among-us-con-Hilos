/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Marcos Mata
 */
public class MetodosCuatro extends JFrame {
    DefaultListModel modelo = new DefaultListModel();
    synchronized void Hilo1(){
        
        modelo.addElement("Inicio:\tSubProceso1");
       for(int i=1; i<=5; i++)
       {
      modelo.addElement("Hilo: "+i);
      Cuatro.Listaje.setModel(modelo);
         try
            {
            Thread.sleep(1000);
            }
             catch(InterruptedException exc)
             {
                 System.out.println("Error en hilo");
              }
        }
        modelo.addElement("Termino Subproceso1");
       Cuatro.Listaje.setModel(modelo);
    }
    
    synchronized void Hilo2()
    {
        modelo.addElement("Inicio:\tSubProceso2");
        for(char i='a'; i<='e'; i++)
        {
         modelo.addElement("Hilo: "+i);
          Cuatro.Listaje.setModel(modelo);
         try
            {
            Thread.sleep(500);
            }
             catch(InterruptedException exc)
             {
              System.out.println("Interrupcion en Hilo");
              }
        }
         modelo.addElement("Termino Subproceso2");
        Cuatro.Listaje.setModel(modelo);
    }
    
    synchronized void Hilo3()
    {
       
        modelo.addElement("Inicio:\tSubProceso3");
        for(int i=1; i<=8; i++)
        {
           modelo.addElement("Hilo: "+i);
           try
            {
            Thread.sleep(2000); 
            }
             catch(InterruptedException exc)
             {
              System.out.println("Interrupcion en Hilo");
              } 
        }   
        modelo.addElement("Termino Subproceso3");
       Cuatro.Listaje.setModel(modelo);
    }
    
    synchronized void Hilo4(){
        
        modelo.addElement("Inicio:\tSubProceso4");
        for(char i='a'; i<='e'; i++)
        {
         System.out.println("Hilo: "+i);
         modelo.addElement("Hilo: "+i);
         try
            {
            Thread.sleep(500);
            }
             catch(InterruptedException exc)
             {
              System.out.println("Interrupcion en Hilo");
              } 
        }
        
        modelo.addElement("Termino Subproceso4");
        Cuatro.Listaje.setModel(modelo);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

 * and open the template in the editor.
 */
package Hilos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Mata
 */
public class EjercicioUno extends Thread {
       

   public JLabel eti;
   public Uno p;
  
public boolean iterar;
    

public EjercicioUno(JLabel eti,Uno p){
    this.eti=eti;
    this.p=p;
   
    
}
public void run(){
    int c1=0 , c2=0;
    
    while(iterar){
        try {
            
            sleep((int )(Math.random()*1000));
            c1=p.gettxt1().getLocation().x;
             c2=p.gettxt2().getLocation().x;
             if(c1<p.gettxt3().getLocation().x-10&&c2<p.gettxt3().getLocation().x-10) {
                 eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                 p.repaint();
             }else{
                 break;
             }
            
                 
             
    
             
        } catch (InterruptedException e) {
        }
        if(eti.getLocation().x>=p.gettxt3().getLocation().x-10){
            if(c1>c2){
                JOptionPane.showMessageDialog(null,"Ganó Tripulante");
            }else if(c2>c1){
                
                  JOptionPane.showMessageDialog(null,"Ganó Impostor");
                
            } else {
                  JOptionPane.showMessageDialog(null,"Empate");
            }
            
        }
        
    }
    
    
}
public void start(){
    iterar=true;
    new Thread(this).start();
    
}
  public void detener(){
      iterar=false;
  }
public void avanzar(){

iterar=true;
(this).start();
//Pausar el hilo


   
}

}

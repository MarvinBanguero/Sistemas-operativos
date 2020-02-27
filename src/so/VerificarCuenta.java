/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante103
 */
public class VerificarCuenta implements Runnable{

private  CuentaBanco cb = new CuentaBanco();
   
    private synchronized void HacerRetiro(int cantidad) throws InterruptedException{       
        
      while(cb.isMsj()==true){
          System.out.println(Thread.currentThread().getName() + " Descuento al semaforo " + cantidad + ".");
          cb.setMsj(false);
      }
        if(cb.getBalance() >= cantidad){
            //System.out.println(Thread.currentThread().getName() + " Descuento al semaforo " + cantidad + ".");

            Thread.sleep(1000);
            
            cb.retiroBancario(cantidad);

            //System.out.println(Thread.currentThread().getName() + ": Tiempo total "+ cb.getBalance());
            System.out.println(Thread.currentThread().getName() + ": Segundos para cambiar " + cb.getBalance());

        }else{           
            System.out.println("Semaforo Detenido" + Thread.currentThread().getName());
            System.out.println("Tiempo restante "+cb.getBalance());
            Thread.sleep(1000);
            
        }       
      
    }
    
   
    @Override
    public void run() {
        for (int i = 0; i <= 4; i++) {
            try {
                this.HacerRetiro(10);
                if(cb.getBalance() < 0){
                    System.out.println("La cuenta está sobregirada.");
                }
                if(i==4){
                     System.out.println(Thread.currentThread().getName() + " Semaforo Detenido");
                     System.out.println("\n");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
}

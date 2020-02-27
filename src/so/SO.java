/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

/**
 *
 * @author Estudiante103
 */
public class SO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        VerificarCuenta vc = new VerificarCuenta();
       
        Thread Semaforo1 = new Thread(vc, "Semaforo1");
        
        Thread Semaforo2 = new Thread(vc, "Semaforo2");
        Thread Semaforo3 = new Thread(vc, "Semaforo3");
        Thread Semaforo4 = new Thread(vc, "Semaforo4");
       
        Semaforo1.start();
        Semaforo1.join();
        Semaforo2.start();  
        Semaforo2.join();
        Semaforo3.start(); 
        Semaforo3.join();
        Semaforo4.start(); 
        Semaforo4.join();
    }
    
}

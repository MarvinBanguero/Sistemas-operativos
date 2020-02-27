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
public class CuentaBanco {
    private int balance = 200;
    private boolean msj=false;
   
    public CuentaBanco(){       
    }

    public int getBalance(){
        return balance;
    }

    public void retiroBancario(int retiro){
        balance = balance - retiro;
    }

    public boolean isMsj() {
        return msj;
    }

    public void setMsj(boolean msj) {
        this.msj = msj;
    }
    
    

}

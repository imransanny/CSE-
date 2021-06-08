/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Imran Hasan
 */
public abstract class Abstract {
    
    private double Balance;
    
    abstract void display();
        double deposit;
        double withdraw;
    public void Deposit(double dep) {
        this.deposit =  dep;

    }

    public  void Witdraw(double wit) {
           
        if (wit < Balance) {
            this.Balance = Balance - wit;
            //System.out.println( "withdraw ="+ this.getBalance());
        } 
        else {
            System.out.println(" low balance");
        }
    }

}

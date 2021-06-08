
package bankaccount;

public class CheckingAccount extends Account{
    
    private double OverDraftLimit;
    
    CheckingAccount(){
         
    }
    public void setOverDraftLimit(double odl){
        this.OverDraftLimit = odl;
    }
    public double getOverDraftLimit(){
        return OverDraftLimit;
    }
    public void withdraw(double m, double odl1){
     if(m >= odl1){
         setBalance(m);
     }   
     else{
         System.out.println("donot sufficient ammount ");
     }
    }
}

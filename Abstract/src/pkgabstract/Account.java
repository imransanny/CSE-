
package pkgabstract;

public class Account {
    private int Id;
    double Balance;
    double AnnualInterestRate;
    
    
    Account(){
   
    }
   public Account(int id, double balance, double irate){
       this.Id = id;
       this.Balance = balance;
       this.AnnualInterestRate = irate;
   } 
   public void setId(int id){
       this.Id = id;
   }
   public int getId(){
       return Id;
   }
   public void setBalance(double balance){
       this.Balance = balance;
   }
   public double getBalance(){
       return Balance;
   }
   public void setAnnualInterestRate(double irate){
       this.AnnualInterestRate = irate;
   }
   public double getAnnualInterestRate(){
       return AnnualInterestRate;
   }
}

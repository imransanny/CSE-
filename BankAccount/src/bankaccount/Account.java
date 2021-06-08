
package bankaccount;
import java.util.Calendar;
public class Account {
  private int Id;
private double Balance;
private double AnnualInterestRate;

public Account(){
    
}
public Account(int id, double balance, double annualirate){
    this.Id = id;
    this.Balance = balance;
this.AnnualInterestRate = annualirate;
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
public void setAnnualInterestRate(double annualirate){
    this.AnnualInterestRate = annualirate;
}
public double getAnnualInterestRate(){
    return AnnualInterestRate;
}
private Calendar dataCreated = Calendar.getInstance();
public Calendar getDataCreated(){
    return dataCreated;
}
public void setDataCreated(Calendar calendar){
this.dataCreated = calendar;    
}

public void display(){
    System.out.println("Id = "+ this.getId());
 System.out.println("Balance = "+ this.getBalance());
    System.out.println("Time = "+this.getDataCreated().getTime());
        
         }
}

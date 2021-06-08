
package bankaccount;

import java.util.Calendar;
import java.util.Random;


public class SavingAccount extends Account{
    private String CreditCardNumber;
    private Calendar CardExpireDate = Calendar.getInstance();
    private double CreditBalance = this.getBalance() *3 ;


public void Info(){
Random rand = new Random();

for(int i=0 ;i <15 ; i++){
  int CreditCardNumber = rand.nextInt(15)+1;
}
CardExpireDate.add(Calendar.YEAR , 2);
}
public String getCreditCardNumber(){
    return CreditCardNumber;
}
public Calendar getCardExpireDate(){
    return CardExpireDate;
}
public double getCreditBalance(){
return CreditBalance;
}
}
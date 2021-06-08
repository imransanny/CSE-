
package bankaccount;
import java.util.*;
  
public class AbstractSavingAccount extends  AbstractAccount {

    private String CreditCardNumber;
    private Calendar CardExpireDate = Calendar.getInstance();
    private double CreditBalance = this.getBalance() * 3;

    AbstractSavingAccount() {
        Info();
    }

    public void Info() {
        Random rand = new Random();
        for (int z = 0; z < 15; z++) {
            this.CreditCardNumber += (char) (rand.nextInt(10) + 48);
        }
        CardExpireDate.add(Calendar.YEAR, 2);
    }

    public String getCardNo() {
        return CreditCardNumber;
    }

    public Calendar getExpireDate() {
        return CardExpireDate;
    }

    public double getCreditBalance() {

        return CreditBalance;
    }
}


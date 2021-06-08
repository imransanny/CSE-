
package bankaccount;



public class AbstractCheakingAccount extends AbstractAccount {

    private double OverdraftLimit;

    AbstractCheakingAccount() {

    }

    public double getOverdraftLimit() {
        return OverdraftLimit;
    }

    public void setOverdraftLimit(double odf) {
        this.OverdraftLimit = odf;
    }

    public void withdraw(double m, double odf1) {
        if (m >= odf1) {
            setBalance(m);
        } else {
            System.out.println("Less amount Withdraw");
        }
    }
}


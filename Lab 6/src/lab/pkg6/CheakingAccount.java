package lab.pkg6;

public class CheakingAccount extends Account {

    private double OverdraftLimit;

    CheakingAccount() {

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

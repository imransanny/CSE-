package lab.pkg6;

import java.util.Calendar;

public class Account {

    private int Id;
    private double Balance;
    private double AnnualInterestRate;
    //private double MonthlyInterestRate;

    private Calendar dataCreated = Calendar.getInstance();

    Account() {

    }

    public Calendar getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Calendar calender) {
        this.dataCreated = calender;
    }

    public Account(int id, double balance, double irate) {
        this.Id = id;
        this.Balance = balance;
        this.AnnualInterestRate = irate;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setAnnualInterestRate(double irate) {
        this.AnnualInterestRate = irate;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate / 12;
    }

    public double getMonthlyInterestRate() {
        return AnnualInterestRate / 12;
    }

    public double getMonthlyInterestAmount() {

        return Balance * getMonthlyInterestRate();
    }

    public void Deposit(double dep) {
        this.Balance = Balance + dep;

    }

    public void Witdraw(double wit) {
        if (wit < Balance) {
            this.Balance = Balance - wit;
            //System.out.println( "withdraw ="+ this.getBalance());
        } 
        else {
            System.out.println(" low balance");
        }
    }

    public void display() {
        System.out.println(" ID = " + this.getId());
        System.out.println("Balence = " + this.getBalance());

        System.out.println("Time = " + this.getDataCreated().getTime());

        System.out.println("Monthly Interest rate = " + getMonthlyInterestRate());
        System.out.println("Momthly interest ammount = " + getMonthlyInterestAmount());
        //  System.out.println(this.Balance);

    }
}

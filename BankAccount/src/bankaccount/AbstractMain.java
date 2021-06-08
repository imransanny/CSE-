
package bankaccount;
import java.util.*;

public class AbstractMain {
   

    public static void main(String[] args) {
        ArrayList< AbstractAccount> alist = new ArrayList< AbstractAccount>();
          

        Scanner input = new Scanner(System.in);
        while (true) {
        //    System.out.println("\n choose option :");
            System.out.println("1.Account ");
            System.out.println("2. Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4. Display");
            System.out.println("5. cheaking Accouont");
            System.out.println("6. Saving Acount");
            System.out.println("7. exit");
                          System.out.println("\nChoose option :");
            int option = input.nextInt();

            switch (option) {
                case 1: {

                    System.out.println("Enter id number: ");
                    int a1 = input.nextInt();
                    System.out.println("Enter Balance : ");
                    double a2 = input.nextInt();
                    System.out.println("Enter Annual Interest Rate");
                    double air = input.nextDouble();
                    double air1 = air / 100;
                     AbstractAccount a = new  AbstractAccount(a1, a2, air1);
                    alist.add(a);
                   //alist.add(ab);
                    // a.display();
                    break;
                }
                case 2: {
                    System.out.println("account id:");
                    int iD = input.nextInt();
                    for ( AbstractAccount i : alist) {
                        if (i.getId() == iD) {
                            System.out.println("witdraw amount :");
                           // i.Witdraw(input.nextDouble());
                              
                        }
                    }
                }
                break;
                case 3:
                    System.out.println("account id : ");
                    int id = input.nextInt();
                    for ( AbstractAccount i : alist) {
                        if (i.getId() == id) {
                            System.out.println("deposit amount :");
                            i.Deposit(input.nextDouble());

                        }
                    }

                    break;

                case 4:
                    for (int i = 0; i < alist.size(); i++) {
                        alist.get(i).display();

                    }
                    break;

                case 5:
                   AbstractCheakingAccount CheckAcc = new  AbstractCheakingAccount ();

                    System.out.println("Enter Account ID:");
                    CheckAcc.setId(input.nextInt());
                    input.nextLine();
                    System.out.println("Enter Account Balance:");
                    CheckAcc.setBalance(input.nextInt());
                    input.nextLine();
                    System.out.println("Enter Account Annual Interest Rate(%):");
                    CheckAcc.setAnnualInterestRate(input.nextInt());
                    input.nextLine();
                    System.out.println("Enter Account Over Draft:");
                    CheckAcc.setOverdraftLimit(input.nextDouble());
                    input.nextLine();
                    alist.add(CheckAcc);
                    System.out.println("Checking account is created ID:" + CheckAcc.getId() + " at " + CheckAcc.getDataCreated().getTime());

                    break;
                case 6:
                      AbstractSavingAccount SaveAcc = new   AbstractSavingAccount();

                    System.out.println("Enter Account ID:");
                    SaveAcc.setId(input.nextInt());
                    input.nextLine();
                    System.out.println("Enter Account Balance:");
                    SaveAcc.setBalance(input.nextInt());
                    input.nextLine();
                    System.out.println("Enter Account Annual Interest Rate(%):");
                    SaveAcc.setAnnualInterestRate(input.nextInt());
                    input.nextLine();
                    System.out.println("Saving account is created  ID:" + SaveAcc.getId() + " at " + SaveAcc.getDataCreated().getTime());
                    System.out.println("Your card No:" + SaveAcc.getCardNo() + " Expire Date:" + SaveAcc.getExpireDate().getTime());
                    alist.add(SaveAcc);
                    break;
                case 7:
                    if (option == 7) {
                     System.out.println("\n Thank you ");
                        break;
                    }
                    break;
                    

            }
        }}}
    



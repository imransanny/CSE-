
package pkgabstract;
import java.util.*;
public class testAcc {
    public static void main(String[] args) {
    
        System.out.println("1. Saving Account");
        System.out.println("2. Checking Account");
        System.out.println("3. exit");
    Scanner input = new Scanner(System.in);
    int option = input.nextInt();
    
    switch(option){
        case 1:  //save Account 
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

            
    }
    
    
    }
}

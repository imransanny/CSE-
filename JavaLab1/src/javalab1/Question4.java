
package javalab1;
import java.util.Scanner;

public class Question4 {
    
    public static void main(String[] args) {
        int USD, BDT, choose ;
       float TUSD, TBDT;
       
        System.out.println( " Choose 1 or 2 ");
        System.out.println("1. U.S(Doller) convert to BDT (TAKA)");
        System.out.println("2. BDT(TAKA) convert to U.S (Doller)");
        System.out.println( " \nEnter Choose NUmber :  ");
       Scanner inputchoose= new Scanner (System.in);
        choose= inputchoose.nextInt();
       switch(choose){
           case 1:
                   System.out.println("Enter amount of  USD Doller :");
        Scanner inputUSD= new Scanner (System.in);
        USD= inputUSD.nextInt();
           TBDT = (float) (USD* 84.75); 
            System.out.println(USD + " U.S Doller " + TBDT +" BDT TAKA " );
        break;
           
           case 2:
                   System.out.println("Enter amount of  BDT TAKA:");
          Scanner inputBDT= new Scanner (System.in);
        BDT= inputBDT.nextInt();
        TUSD = (float) (BDT / 84.75);
      
         System.out.println(BDT + " BDT TAKA " + TUSD +" U.S Doller " );
       }    
    }
    
}

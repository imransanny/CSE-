
package electricbillcalculation;
import java.util.Scanner;

public class ElectricBillCalculation {

   
    public static void main(String[] args) {
   int  BaseMonthlyCharge = 12;
    Scanner input = new Scanner(System.in);
    double cost1 = 0, cost2 = 0 , cost3 = 0,  cost4 = 0;
    ///double unit=0;
    double unit = input.nextInt();
    double watt;
   
      if(unit > 0 ){
          watt = 5;
          cost1 = watt * 2 ; 
     unit = unit - watt;
    System.out.println("cost = "+ cost1 + " unit = "+ unit);
      }
      
      if(unit <= 10){
          
          
          cost2 = unit * 4;
          unit = unit - unit;
        System.out.println("cost = "+ cost2 + " unit = "+ unit);    
      }
      if(unit <=15 ){
          cost3 = unit * 6;
          unit  = unit -unit;
            System.out.println("cost = "+ cost3 + " unit = "+ unit);
      }
      if( unit >= 15){
          cost4 = unit* 6;
            System.out.println("cost = "+ cost4 + " unit = "+ unit);
      }
        
        double TotalCost = cost1 + cost2 + cost3 + cost4;
        System.out.println("TotalCost = " + TotalCost);  
    }
  
    
    
    }
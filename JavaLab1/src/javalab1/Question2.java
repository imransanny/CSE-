
package javalab1;

import java.util.Scanner;
public class Question2 {
     public static void main(String[] args) {
     int min;
     int year, day, rday, tday;
      System.out.println("Enter the minute");
     Scanner input = new Scanner(System.in);
         min= input.nextInt();
         year = min /525600 ;
         
     
      rday = min % 525600;
      tday = rday / 1440;
         System.out.println("Year = "+ year);
          
            System.out.println("day = "+ tday);       
    }
    
    
}


package javalab1;

import java.util.Scanner;
public class Question1 {
    
    public static void main(String[] args) {
       int num;
               System.out.println("Enter the  Number");
       Scanner input= new Scanner(System.in);
       
       num = input.nextInt();
  
           
       if ( num%2 ==0 && num%3 == 0){
             System.out.println("False");  
                }
        else if ( num%2 ==0 ){
              System.out.println("True");  
                }
       
         else if ( num%3 == 0){
              System.out.println("True");  
}
       
       
       
    }
       
}

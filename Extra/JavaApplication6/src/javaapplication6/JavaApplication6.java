
package javaapplication6;


import java.util.Scanner;
public class JavaApplication6 {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
     double base, height;
     double area;
     System.out.println("Enter the base number");
     base = input.nextDouble();
        
     System.out.println("Enter height ");
        height= input.nextDouble();
    System.out.println("Tryangle area");
        area = 0.5 * base * height;
        System.out.println("Area:\t"+ area);
        
        
    
    }
    
}

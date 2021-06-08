
package javaapplication6;

import java.util.Scanner;
public class VowelConsonet {
    public static void main(String[] args){
        
        Scanner input = new Scanner ( System.in);
        
        char charac;
   System.out.println("Enter the input number");
   charac = input.next().charAt(0); // 0 diye cahr er 1st box number bojai
   if(charac=='a'|| charac =='e'|| charac =='i' || charac == 'o' ||charac == 'u'){
       System.out.println("Vower");
   }
   else{
       System.out.println("Consonant");
   }
        
    }}

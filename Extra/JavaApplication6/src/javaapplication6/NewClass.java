
package javaapplication6;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        int num;
       System.out.println("Enter the input number :"); 
       num= input.nextInt();
       
        if(num%2==0){
            System.out.println("Even" + num);
        }
        else{
            System.out.println("Odd" + num);
        }
        
        
}
}

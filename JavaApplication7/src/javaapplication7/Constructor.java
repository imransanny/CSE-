
package javaapplication7;
import java.util.*;
public class Constructor {
    
 public static void main(String [] args){
     
Scanner input = new Scanner(System.in);
//Scanner input = new Scanner(System.in);
Employee e1 = new Employee();
e1.input("Tanni", 1000.0);
 e1.display();
 
 Employee e2 = new Employee("imran hasan", 2000);
 e2.display();
 
 }
}


package javaapplication4;
import java.util.Scanner;

public class ClassFuntion {

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
        Employee e1= new Employee();
    Employee[] ejob =new Employee[3];
    for(int i= 0 ; i<ejob.length ; i++){
        ejob [ i]= new Employee();
    ejob [i].input("nam", i);
    }
    e1.input("imran" , 1000.0);
    e1.disply();
}    
    
    
}

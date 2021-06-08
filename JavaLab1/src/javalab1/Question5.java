
package javalab1;
import java.lang.Math;
import java. util. Scanner;

public class Question5 {
  
    public static void main(String[] args) {
int a,b, p,q,r ;
System.out.println("Enter (p, q)");
Scanner inputp = new Scanner(System.in);
 p = inputp.nextInt();
 
 Scanner inputq = new Scanner(System.in);
 q = inputq.nextInt();
 System.out.println("Enter point(x, y)");
Scanner inputa = new Scanner(System.in);
 a = inputa.nextInt();
 
 Scanner inputb =  new Scanner (System.in);
 b = inputa.nextInt();
 System.out.println("Enter the redious");
 
 Scanner inputr = new Scanner(System.in);
 r = inputa.nextInt();
 int one, two, square;
 float root;
  one= (p-a) * (p-a) ;
   two = (q-b) * (q-b);
  square= one +two;
  root = (float)Math.sqrt(square);
  if(root< r){
      System.out.println("The (x,y) point into the circle");
  }
  else{
      System.out.println("The (x,y) point  Outside of the circle");
  }
    }
    
    
}

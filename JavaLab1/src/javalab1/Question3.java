
package javalab1;
import java.util.Scanner;
import java.lang.Math;
//import java.util.Math;
public class Question3 {
    
    public static void main(String[] args) {
        float a, b ,c ;
         System.out.println("Enter the input a, b and c");
        Scanner inputa= new Scanner (System.in);
        a= inputa.nextFloat();
          Scanner inputb= new Scanner (System.in);
        b= inputb.nextFloat();
          Scanner inputc= new Scanner (System.in);
        c= inputc.nextFloat();
        
        float r1, r2, det, root;
        det = ((b*b) - (4*a*c));
        if ( det > 1 ){
            root = (float) Math.sqrt(det);
            r1= (-b+  root) / (2*a) ;
           r2= (-b -  root) / (2*a) ;
            System.out.println("The equation has two roots  r1 = "+r1 );
             System.out.println("   r2 = "+r2 );
        }
        else if (det == 0){
             root = (float) Math.sqrt(det);
            r1= (-b+  root) / (2*a) ;
            System.out.println("The equation has one roots  r1 = "+r1 );
        }
        else {
        System.out.println("The equation has no real number " );
        
    }
    }}
    
    


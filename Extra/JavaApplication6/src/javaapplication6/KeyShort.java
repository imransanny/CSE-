
package javaapplication6;
import java.util.Scanner;
public class KeyShort {

    //public static void main(String[] args) {
   
        /* int m, n, j;
      Scanner input = new Scanner(System.in);
      m = input.nextInt();
      n= input.nextInt();
        for ( j = m; j <= n; j++) {
            if(m%2==0){
                System.out.println(m);
    
            }
  m=m+1;
        
       }
            
        }
    }
    */

    
    public static void main(String[] args) {
        int i, n, mul;
        Scanner input = new Scanner(System.in);
        n= input.nextInt();
        for(i=1; i<=10 ; i++){
            mul = n*i;
            System.out.println(n +"*" +i +"= " +mul);
        }
                
    }}

package javaapplication7;
import java.util.*;
public class JavaApplication7 {

    public static int sum(int a, int b){
        int sumn = 0;
        for(int i=a ; i<b ; i++){
            sumn =  i * i ;
        }
        return sumn;
    }
    public static int sumAry(int n , int [][]ary){
    int sum = 0;
    for(int i=0 ; i<ary.length ; i++){
        for(int j=0 ; j<ary[i].length ; j++)
        sum = sum+ ary[i][j];  
    }
    return sum;
    }
    
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     
      int n = input.nextInt();
     //int n=3;
     
     //int [][]ary = {{1,2},{2,3}};
     int [][]ary = new int[2][2];
     
     for(int i=0 ; i<ary.length ; i++){
         for(int j=0 ; j<ary[i].length ; j++){
     
      ary[i][j] = input.nextInt();
         }}
     
    
     
        int sum1 =  sum(1, 10);
        int sum2 = sumAry(n, ary);
           System.out.println("Sum = "+ sum1);
           System.out.println("sum Ary +" + sum2);
        
    }
    
}

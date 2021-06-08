
package arrayfuntion;

import static arrayfuntion.PassTwodary.fnum;
import java.util.Scanner;
public class ArrayFuntion {

  
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
   //int [][]num = {{1,2},{3,4}};
   int num[][] = new int [10][10];
   System.out.println("Enter the input numbber : "); 
   for(int i=0 ; i<2 ; i++){
      for(int j=0 ; j<2 ; j++ ){
         
      num[i][j]= input.nextInt(); 
      }
  }
    
    int sum = fnum(2,2,num) ;
        System.out.println(sum);

   
 
         
    
    }
}

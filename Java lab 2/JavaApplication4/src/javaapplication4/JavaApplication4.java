
package javaapplication4;
 import java.util.Scanner;
public class JavaApplication4 {

     public static void main(String[] args) {
   Scanner input = new Scanner(System.in);         
      int tdary[][]={{1,2},{2,3}};
         //for(int i=0; i< tdary.length; i++){
         // for(int j=0 ; j<tdary[i].length ; j++){
         //   tdary[i][j] = input.nextInt();
         //}
     
 int sum= 0;
 for(int i=0 ; i<tdary.length ;i++){
     for(int j= 0 ; j<tdary[i].length ; j++){
         sum = sum +tdary[i][j];
         
     }
 } 
 System.out.println(sum);
  /*for (int i= 0 ; i<tdary.length  ; i++){
      for(int j=0 ; j<tdary[i].length ; j++){
          System.out.println(tdary[i][j]);
          
      }
  }
    */  
      
      }
    
}

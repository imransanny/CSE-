
package javaapplication4;
import java.util.*;
public class ExaTtest {
    
  public static void main(String[] args){
     int n=4, m=3;
     int [][]num={{0,1,0},{1,0,1},{1,1,1},{1,0,0}};
   int [] ary0= new int [10];
  int []ary1= new int [10];
  int arry0 = rowc(n,m, num);
  int arry1= row(n,m, num);   
  
  for(int i=0 ; i<10 ;i++){
      System.out.printf("Row %d total0 = %d , toal1 %d", i,arry0[i], arry1[i]);
  }
  }
}

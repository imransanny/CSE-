
package arrayfuntion;


public class PassTwodary {
    
    public static int fnum(int a, int b, int [][]numa){
        int sum=0 ;
    for(int i=0 ; i<a ; i++){
        for(int j=0 ; j<b ; j++){
          sum= sum +  numa[i][j]  ;
        }
    }    
   
   return sum; 
}}

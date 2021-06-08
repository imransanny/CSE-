
package javaapplication4;


public class New {
    public static int rowc(int a , int num[][]) 
    {
        int [][] t1= new int [a][a];
          
        int [][] t2= new int [a][a];
    int count1=0 , count2 =0;
        for(int i=0 ; i< a ; i++){
            for(int j=0 ; j<a ; j++){
                if(num[i][j] == 0 ){
                    count2++;
                }
                else if(num[i][j]==1){
                    count1++;
                }
            }
            int[] tatal1 = null;
        
    tatal1 [i] = count1;
    count1=0;
     int []total2 =null;
     total2[i]=count2;
    count2=0;
        }
        boolean [ ]sum = new boolean [2];
        boolean[] csum = null;
            csum[0]=true;
            csum[1]=false;
            for(int i=0 ; i<a ; i++){
                if(csum[i]== true){
                    return count2;
                }
               else if(csum[i]== false){
                   return count1;
               }
            }
        return 0;
    }}
    
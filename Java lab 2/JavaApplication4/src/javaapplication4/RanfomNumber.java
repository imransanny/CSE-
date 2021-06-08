/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
public class RanfomNumber {
public static void main(String [] args){
Scanner input = new Scanner (System.in);
    int [][]rand = new int [2][3] ; 
    for(int i=0; i< rand.length; i++)    
    {
for( int j=0 ;j<rand[i].length ; j++){
    rand[i][j] = (int) (Math.random()*5);
    
}    
    
    }
    for(int i=0 ; i< rand.length  ; i++ ){
        for(int j =0 ; j<rand[i].length ; j++){
            System.out.printf("%d " ,rand[i][j]);
        }
      System.out.printf("\n");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }


}    

    private static void printf(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

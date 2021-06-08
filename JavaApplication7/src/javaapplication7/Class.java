
package javaapplication7;
import java.util.*;
public class Class {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        //CreaClass e1 = new CreaClass();
       /* String n=input.nextLine();
       e2= new CreaClass();
      
       e1.input(n, 5000.0);
        e1.display();
        //e2.input("imran", 200);
        
        e2.name= "imran sanny";
        e2.salary = 20000;
    e2.display();
    }*/
       //int []ClsAry = new int [3];
    CreaClass [] ClsAry = new CreaClass [3];
    //double s;
    for(int i=0 ; i<ClsAry.length ; i++){
        ClsAry[i] = new CreaClass();
  //  ClsAry[i].input("imran", 200);
 String nme =input.nextLine();
    //s =input.nextInt();
 ClsAry[i].input(nme, 5000);
    }
    for(int i=0 ; i<ClsAry.length ; i++){
        ClsAry[i].display();
    }
} }

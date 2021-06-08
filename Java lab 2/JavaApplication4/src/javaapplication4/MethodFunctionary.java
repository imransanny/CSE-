
package javaapplication4;


public class MethodFunctionary {
    
    
    public static int sum(int a, int b){
int sum = 0;
for(int i=a ; i<=b ; i++){
sum +=i; 
}
return sum;
   }
public static void main(String[] args){

       int sum= sum(5,5);
       int sum1= sum(15,20);
       System.out.println(sum);
            System.out.println(sum1);
   }

}
 
  

}
 
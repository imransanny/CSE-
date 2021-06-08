
package exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {
   
    int x=1 ; 
    int y=0 ; 
   try{
       //int result = x/y;
      //int []sum = new int [4];
        //sum[1] = x*y; 
    // System.out.println("Result"+ result);
   }
   
   catch(Exception e){
       System.out.println("ArithmethicException exception threated");   
    } 
 
 finally{
   int mul = x*y; 
        System.out.println("mul =" +mul);
   System.out.println("Bangladesh");
   }
}}

package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingExcercise {

    public static void main(String[] args) {

        //while (true) {
        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter first numebr ");
                int num1 = input.nextInt();
                System.out.println("Enter second numebr ");
                int num2 = input.nextInt();

              //  int result = (int) num1 / num2;

                //System.out.println("Result = " + num1 + "/" + num2 + " = " + result);
                count = 2;

            } catch (Exception e) {
                System.out.println("Exception : " + e);
                System.out.println("You must Enter in integer Please try Again");
            }
        }while (count == 1);

        }
    
    }


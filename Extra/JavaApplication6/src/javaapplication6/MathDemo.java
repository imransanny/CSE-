
package javaapplication6;

public class MathDemo {
public static void main(String[] args){
    int x= 9;
    int y= 5;
    int z=-30;
int max = Math.max(x,y);
System.out.println(max);
//System.out.println(Math.max(x, y));

int absolute = Math.abs(z);
    System.out.println(absolute);
    double power = Math.pow (x, y);
    System.out.println("x to the power of y ="+ power);
int round = Math.round (8.9f);
System.out.println("Round of 8.9 = " + round);
System.out.println(Math.PI);

float root= (float)Math.sqrt(x);
System.out.println(root);
}

}
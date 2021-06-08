
package javaapplication4;
import java.util.*;
public class Contructor {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ConEmploye e1= new ConEmploye();
        e1.input ( "imran sanny" , 500);
        e1.display();
        ConEmploye e2= new ConEmploye("boss", 200);
        e2.display();
    }
}

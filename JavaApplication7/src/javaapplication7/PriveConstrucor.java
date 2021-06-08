
package javaapplication7;
import java.util. *;

public class PriveConstrucor {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in );
        PrivateEply e1 = new PrivateEply();
        
        e1.input("Tanni mitro", 1000.0);
        e1.display();
        e1.name = "Imran Sanny";
        e1.salary = 2900;
Employee e2 = new Employee ("JArin", 20000);
e2.display();
    }
    
    }

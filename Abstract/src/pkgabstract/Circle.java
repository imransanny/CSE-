
package pkgabstract;

import java.text.DecimalFormat;

public class Circle extends AbstractShape {
    //dim1, dim2 is here
    
    Circle(double r){
        super(r,r);
}
    DecimalFormat obj = new DecimalFormat("0.000");
 
void area(){
   double result = Math.PI * dim1 * dim2;
   // System.out.println("Circle area = "+ result);
    //System.out.printf(" Circle area =  %.2f", result);
    System.out.println("\nCircle area = "+ obj.format(result));
    
}
}


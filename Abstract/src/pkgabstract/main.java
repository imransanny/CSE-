
package pkgabstract;

public class main {
    public static void main(String[] args) {
        AbstractShape sh;
        sh = new Rectangle(10,20);
        sh.area();
     
        sh = new Triangle(10,20);
        sh.area();
   
      //  sh = new Circle(10);
        //sh.area(); 
        
    }
    
}

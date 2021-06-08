
package polymorphism;

public class Triangle extends Shape{
    double base,height;
    
    Triangle(double base, double heig){
        this.base = base;
        this.height = heig;
    }
    @Override
    double area(){
        return 0.5*base*height;
    }
}

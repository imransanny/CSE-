
package polymorphism;

public class Rectangle extends Shape {
    double length ,width;
    Rectangle(double len, double wid){
        this.length = len;
        this.width = wid;
       
    }
    @Override
    double area(){
        return length*width;
    
    }
}

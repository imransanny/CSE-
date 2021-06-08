
package polymorphism;

public class testmain {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10,20);
        Shape s3 = new Triangle(50,80);
        System.out.println(""+s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
    }
}

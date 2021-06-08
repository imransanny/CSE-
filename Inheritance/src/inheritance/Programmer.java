
package inheritance;


public class Programmer extends Inheritance {
private String qulification;


    public String getQulification() {
        return qulification;
    }

    public void setQulification(String qulification) {
        this.qulification = qulification;
    }

void display2(){
    display1();
    System.out.println("Qulification = "+ qulification);
    
}
}
 
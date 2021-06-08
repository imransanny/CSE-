
package javaapplication7;


public class PrivateEply {
    String name;
    double salary = 0;
PrivateEply(){
    }
PrivateEply(String nam, double sal){
    name =nam;
    salary =sal;
}
public void setname(String nam){
    name=nam;
}
public String getname(){
    return name;
}
public void setsal(double sal){
    salary = sal;
    
}
public double getsal(){
    return salary;
}
public void display(){
    System.out.println("Neme"+ " " + salary);
}

    void input(String tanni_mitro, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

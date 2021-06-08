
package javaapplication4;

public class ConEmploye {
String name ;
double salary;
//int sal1;
    public ConEmploye() {
        
    }
    ConEmploye(String nam, double a){
        name = nam;
        salary = a;
    }
    void input (String nam, int b){
        salary = b;
        name = nam;
    }
    void display(){
    System.out.println(name + "" + "" +salary);
    
}}

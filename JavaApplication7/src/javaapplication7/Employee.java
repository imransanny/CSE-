
package javaapplication7;

public class Employee {
    String name;
    double salary=0;
   
    
    Employee()
    {
         }
Employee(String nam, double sal){
    name = nam;
    salary= sal;
  }
void input (String nam, double sal){
    name = nam;
    salary = sal;
}
void display(){
    System.out.println(name + "" + salary);
}
}
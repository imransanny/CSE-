/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Imran Hasan
 */
public class Employee {
    String name;
    double salary;
    void input(String nam, double sal){
        name = nam;
        salary= sal;
    }
    void disply(){
        System.out.println(name +""+ salary);
    }
}

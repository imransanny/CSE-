
package lab5.student;

import java.util.ArrayList;
//import java.util.*;

public class Course {
    
//private ArrayList<Student> StuList= new <Student>();
    private int CourseId;
private String CourseTitle;
private double CourseCredit;
private ArrayList<Student> StuList= new ArrayList<Student>();
    private int StudentCount;
    private Faculty faculty;

Course(){
    
}
public Course( String title, int id, double credit){
   this.CourseTitle= title;
   this.CourseId= id;
 this.CourseCredit = credit; 
           
}
//public void setCourseId(String id){
  // this.CourseId = id;
//}
public int getCourseId(){
    return CourseId;
}

public void setCourseTitle(String title){
   this.CourseTitle= title;
}
public String getCourseTitle(){
    return CourseTitle;
}
public void setCourseCredit(double credit){
    this.CourseCredit = credit;
}
public double getCourseCredit(){
    return CourseCredit;
}
 public int getStudentCount(){
        StudentCount = StuList.size();
        return StudentCount;
    }

 public int StudentId(int i){
        return StuList.get(i).getStudentId();
    }
    
  // Add Student
    public void addStudent(Student s){
        StuList.add(s);
        System.out.println(StuList);
        //pass t1522
    }
 // Add Faculty
    public void addFaculty(Faculty faculty){
        this.faculty = faculty;
       
        System.out.println(this.faculty);
    }
   
    // Drop
    public void dropStudent(int studentId){
        for( int i = 0 ; i < StuList.size() ; i++ ){         
            if( studentId == StuList.get(i).getStudentId() ){
                StuList.remove(i);
            }
        }
    }
   
    // Drop Faculty
    public void dropFaculty(){
        this.faculty = null;
    }  
    
@Override
    public String toString(){
    System.out.println("Course Title = "+ this.getCourseTitle());
    System.out.println("Course Id = "+this.getCourseId());
   System.out.println("Course Credit = "+this.getCourseCredit());
//System.out.println("\n");
  //  StudentCount =StuList.size();
   // System.out.println("Total Student:"+StudentCount+"\n"+StuList);
   
     for(int i=0;i<StuList.size();i++)
        {
            StuList.get(i).toString();
        }

    return null;
}
    
    public void StudentCount(){
        StudentCount = StuList.size();
    System.out.println("Total Student:"+StudentCount+"\n"+StuList);
    }
}

   
    


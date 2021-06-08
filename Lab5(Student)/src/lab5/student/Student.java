
package lab5.student;


public class Student {
    private String StudentName;
private int StudentId;
private double StudentCgpa;

   Student() {
    }
public Student( String nam,int id, double cgpa){

  this.StudentName= nam;
    this.StudentId= id;
   this.StudentCgpa = cgpa;
} 

    
  public void setStudentName(String nam){
        this.StudentName = nam;
   } 
     public String getStudentName(){
      return StudentName;
    }

  public void setStudentId(int id){
        this.StudentId = id;
   } 
  public int getStudentId(){
   return StudentId;
   }
  
 public void setStudentCgpa(double cgpa){
        this.StudentCgpa = cgpa;
   } 
public double getStudentCgpa(){
return StudentCgpa;
}

 

@Override
   public String toString() {    
//return (this.getStudentName() +"id="+"nam="+this.getStudentId()+"cgpa="+this.getStudentCgpa());
        System.out.println("name = "  +this.getStudentName());
        System.out.println("ID = "    + this.getStudentId());
        System.out.println("Cgpa = "  +this.getStudentCgpa());
     System.out.println("\n");
//System.out.println(StudentName+" " + StudentId+" " + StudentCgpa+" ");

return null; 
   }

    

}
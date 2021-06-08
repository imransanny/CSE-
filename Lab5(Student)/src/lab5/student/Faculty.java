
package lab5.student;


public class Faculty {
 private int  FacultyId;
   private String FacultyName;
private String FacultyPosition;
 
Faculty(){
}

public Faculty( String fname ,int id, String fpos){
this.FacultyId = id;
this.FacultyName = fname; 
this.FacultyPosition = fpos;
}
public void setFacultyId(int id){
    this.FacultyId = id;    
}
public int getFacultyId(){
    return FacultyId;
}

public void setFacultyName(String fnam){
    this.FacultyName = fnam;
}
public String getFacultyName(){
    return FacultyName;
}
public void setFacultyPosition(String fpos){
    this.FacultyPosition = fpos;
} 
public String getFacultyPosition(){
    return FacultyPosition ;
}
 
 @Override
 public String toString(){
      //  System.out.println("Faculty Name = "+getFs); 
     System.out.println("Faculty Name = "+this.getFacultyName());
    System.out.println("Faculty Id = " + this.getFacultyId());
    System.out.println("Faculty Position = " + this.getFacultyPosition());
     System.out.println("\n"); 
    return null;
}

}


package classrelatipnship;

public class Course {
    public String CourseCode;
    public String CourseTitle;
    
    Course (String title, String code){
        
        this.CourseTitle = title;
        this.CourseCode = code;
    }
    public void display(){
        System.out.println(CourseTitle+" "+ CourseCode);
    }
}

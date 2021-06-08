
package bookclasrealtionship;

public class Author {
    private String AuthorName;
private double AuthorAge;
 //private String DOB; 
 //private String SureName;

  public Author(String nam, double age){
      this.AuthorAge= age;
      this.AuthorName = nam;
  }
public void setAuthorName(String nam){
    this.AuthorName = nam;
}
public String getAuthorName(){
    return AuthorName;
}
public void setAuthorAge(double age){
    this.AuthorAge = age;
}
public double getAuthorAge(){
    return AuthorAge;
}

public void  display(){
    System.out.println("Author  name = "+ this.getAuthorName());
    System.out.println("Author Age = "+ this.getAuthorAge());
}
}

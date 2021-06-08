
package classrelatipnship;

class Student {
   public int id;
   public String name;
   public Course list;
   public Grade Cgpa;
   
  Student(int id ,String name,String Code,String ctitle,float cgpa){
      this.id= id;
      this.name= name;
      list = new Course(ctitle, Code);
      Cgpa = new Grade(cgpa);
      
  }
  public void display(){
      System.out.println(id+" "+name);
  list.display();
  //Cgpa.display();
  }
}

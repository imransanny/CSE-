
package lab5.student;
import java.util.*;
public class Lab5Student {
public static ArrayList<Student> StuList= new ArrayList<Student>();
public static ArrayList<Course>  CourList= new ArrayList<Course>();
public static ArrayList<Faculty> FacList= new ArrayList<Faculty>();
   
public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in);
     while(true){
       // System.out.println(S.getStudentName());
        System.out.println("1. Add a Student: ");
        System.out.println("2. Add a Course : ");
         System.out.println("3. Add Faculty : ");
        System.out.println("4. Add a student in a Course :");
         System.out.println("5.Add a Course in faculty :");
         System.out.println("6. Detet a studenrt :");
        
       //  System.out.println("7. Delet a Faculty");
      System.out.println("7. display student");
       // System.out.println("7 : ");
        System.out.println("8. Exit:");
     
       // while(true){
        int option = input.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter Name, id, cgpa");     
               //Student S = new Student("imran", 2020, 3.70);
            //Student S= new Student();
                      
                   
             String name= input.next();
              int id= input.nextInt();
              float cgpa= input.nextFloat();
              Student S= new Student(name, id, cgpa);
        
               StuList.add(S);
                      S.toString();
                     break;
            case 2: 
              //Course c = new Course("CSE",110,3.5);
              
                System.out.println("Enter Course title, Course Id, course credit");
              input.nextLine();
              String ctitle =input.nextLine();
              int couid = input.nextInt();
              double ccre = input.nextDouble();
                Course c = new Course(ctitle, couid, ccre);
                CourList.add(c);
              c.toString();
                     break;
            case 3:     
                //  Faculty F = new Faculty("Tonni mitro",20,"lecturer");
                 
              
    System.out.println("Enter Faculty Name, Faculty Id , Faculty position"); 
                  Faculty F = new Faculty (); 
                  input.nextLine();
                   F.setFacultyName(input.nextLine());
                
                     F.setFacultyId(input.nextInt());
                     input.nextLine();
                    F.setFacultyPosition(input.nextLine());
                   
               FacList.add(F);
                  
                  F.toString();
                  break;

            case 4:
               int CId, SId;
                System.out.println("Enter course id");
               CId= input.nextInt();
                System.out.println("Enter Student id");
               SId = input.nextInt();
            
               for(int i=0;i<CourList.size();i++)
              {
                  if(CId == CourList.get(i).getCourseId())
                  {
                      for(int j=0;j<StuList.size();j++)
                      {
                          if(SId==StuList.get(j).getStudentId())
                          {
                              CourList.get(i).addStudent(StuList.get(j));
                          }
                      }
                  }
              }
              
           
     break;
              
                case 5 :       
                     int cid, fid;
                     System.out.println("Enter course id");
               cid= input.nextInt();
                    System.out.println("Enter Faculty id");
               fid = input.nextInt();
            
               for(int i=0;i<CourList.size();i++)
              {
                  if(cid == CourList.get(i).getCourseId())
                  {
                      for(int j=0;j<FacList.size();j++)
                      {
                          if(fid ==FacList.get(j).getFacultyId())
                          {
                              CourList.get(i).addFaculty(FacList.get(j));
                          }
                      }
                  }
              }
                       break;
            case 6:
                System.out.println("Enter Student ID : ");
                int sid= input.nextInt();
               for(int i=0;i<StuList.size();i++)
               {
                   if(sid== StuList.get(i).getStudentId())
                   {
                       StuList.remove(i);
                       //break;
                   }
               }
                
                break;
                 
            
          /*  case 7: 
                 int facid= input.nextInt();
               for(int i=0;i<FacList.size();i++)
               {
                   if(facid== FacList.get(i).getFacId())
                   {
                       FacList.remove(i);
                       //break;
                   }
               }
                
                break;
             */   
                
            case 7 :
                for(int i=0;i<StuList.size();i++)
               { 
                   StuList.get(i).toString();
              
               }
                break;
                
       case 8:
                break;
        }
     if( option ==9){
         System.out.println("Sucessfully Exit");
         break;
     }
  }
    
    }
}


package testclass;

import java.util.ArrayList;
import java.util.Scanner;

       
public class TestClass {
    public static ArrayList<Student> stu = new ArrayList<Student>();
    public static ArrayList<course> cor = new ArrayList<course>();
    public static ArrayList<Faculty> fac= new ArrayList<Faculty>();
    public static void main(String[] args) {
       int option;
       Scanner input = new Scanner(System.in);
       while(true)
       {
           System.out.println("\n press 1: Add a student");
           System.out.println("\n press 2: Add a course");
           System.out.println("\n press 3: Student display");
           System.out.println("\n press 4: Course display");
           System.out.println("\n press 5: Add student in a course");
           System.out.println("\n press 6: Add a faculty");
           System.out.println("\n press 7: Delete a student");
           System.out.println("\n press 8: Exit");
           option= input.nextInt();
           if(option==1)
           {
              String name= input.next();
              int id= input.nextInt();
              float cgpa= input.nextFloat();
              Student s= new Student(name, id, cgpa);
              stu.add(s);
              
           }
           else if(option==2)
           {
               course c= new course("CSE110",1);
               cor.add(c);
           }
           else if(option==3)
           {
               
               for(int i=0;i<stu.size();i++)
               { 
                   stu.get(i).display();
              
               }
           }
           else if(option==4)
           {
               
               for(int i=0;i<cor.size();i++)
               { 
                   cor.get(i).display();
               }
           }
           else if(option==5) 
           {
              int cid,sid;
              cid=input.nextInt();
              sid=input.nextInt();
             /* for(int i=0;i<cor.size();i++)
              {
                  for(int j=0;j<cor.get(i).slist.size();j++)
                  {
                      if(sid==cor.get(i).slist.get(j).getid())
                      {
                          
                      }
                  }
              }*/
              
              
             for(int i=0;i<cor.size();i++)
              {
                  if(cid==cor.get(i).getid())
                  {
                      for(int j=0;j<stu.size();j++)
                      {
                          if(sid==stu.get(j).getid())
                          {
                              cor.get(i).addstudent(stu.get(j));
                          }
                      }
                  }
              }
           }
           else if(option==6)
           {
               Faculty f= new Faculty(1,"TM");
               fac.add(f);
           }
           else if(option==7)
           {
               int sid= input.nextInt();
               for(int i=0;i<stu.size();i++)
               {
                   if(sid== stu.get(i).getid())
                   {
                       stu.remove(i);
                       //break;
                   }
               }
           }
           else
           {
               break;
           }
       }
        
    }
    
}
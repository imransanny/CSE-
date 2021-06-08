

1.course

package teststudentclass;

import java.util.ArrayList;

public class course {
    private String title;
    private int id;
    public ArrayList<Student> slist= new ArrayList<Student>();
    private int scount=0;
    private Faculty facul;
    
    course(String t, int i)
    {
        title =t;
        id =i;
    }
    public int getid()
    {
        return id;
    }
    public void addstudent(Student s)
    {
        slist.add(s);
    }
   public void addfaculty(Faculty f)
   {
       facul=f;
   }
    public int getscount()
    {
        scount=slist.size();
        return scount;
    }
    public void display()
    {
        System.out.println(title+" "+id);
        for(int i=0;i<slist.size();i++)
        {
            slist.get(i).display();
        }
    }
   
}


2.faculty

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package teststudentclass;

/**
*
* @author HP
*/
public class Faculty {
    private int fid;
    private String fname;
    
    Faculty(int id, String name)
    {
        fid=id;
        fname=name;
        
    }
    public void fdisplay()
    {
        System.out.println(fid+" "+fname);
    }
}



3.student


/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package teststudentclass;

/**
*
* @author HP
*/
public class Student {
    // Attributes/ properties
    private String name;
    private int id;
    private float cgpa;
    
    public static void setcount()
    {
        
    }
    
    public Student()
    {
        //count++;
    }
    public Student(String nam, int id1, float cgpa1)
    {
       //count++;
        name = nam;
        id= id1;
        cgpa= cgpa1;  
    }
    public void setname(String nam)
    {
        name= nam;
    }
    public String getname()
    {
        return name;
    }
    public void setid(int id1)
    {
        id= id1;
    }
    public int getid()
    {
        return id;
    }
    public void setcgpa(float cg)
    {
        cgpa= cg;
    }
    public float getcgpa()
    {
        return cgpa;
    }
    
   public void Addinfo(String nam, int id1, float cgpa1)
    {
        name = nam;
        id= id1;
        cgpa= cgpa1;
    }
    public void display()
    {
        System.out.println(name+" " + id+" " + cgpa+" ");
    }
    public void checkcgpa(Student s)
    {
        if(cgpa== s.getcgpa())
            System.out.println(" CGPA same");
        else
            System.out.println(" CGPA not same");
    }
    
}

4...



/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package teststudentclass;

import java.util.ArrayList;
import java.util.Scanner;

/**
*
* @author HP
*/
public class TestStudentClass {
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
    

package testclass;
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



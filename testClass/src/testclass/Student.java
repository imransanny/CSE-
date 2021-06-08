
package testclass;


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



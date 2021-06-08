
package testclass;

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


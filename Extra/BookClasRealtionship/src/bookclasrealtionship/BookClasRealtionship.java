
package bookclasrealtionship;
import java.util.*;

public class BookClasRealtionship {

    public static ArrayList<Author> AuthorList= new ArrayList<Author>();
     public static ArrayList<Book> BookList= new ArrayList<Book>();
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        while(true){
            System.out.println("1. Book ");
            System.out.println("2. Author ");
            System.out.println("3. display");
            System.out.println("4.exit");
       int option = input.nextInt();
        switch(option){
            
            case 1:
                //System.out.println("Enter book name");
              //  Book b= new Book ("physics", 1010.0);
              //  b.
              /*     Author a = new Author ("Topon", 20);
                   Author a1= new Author("sir", 10);
                    AuthorList.add(a);
                AuthorList.add(a1);
                   
                */   
                   
               // b.display();
            break;
            case 2: 
               Book b= new Book ("physics", 1010.0);
               Book b1 = new Book("chem", 202.0);
               BookList.add(b1);
               BookList.add(b);
                 Author a = new Author ("Topon", 20);
                  Author a1= new Author("sir", 10);
                  Author a3= new Author ("rafi" , 29);
                  Author a4 = new Author ("imran", 30);
                AuthorList.add(a);
                AuthorList.add(a1);
                 AuthorList.add(a3);
                AuthorList.add(a4);
                
               // a.display();
              // a1.display();
                break;
            case 3:
                for(int i=0 ; i<BookList.size(); i++){ 
                BookList.get(i).display();
                }
                 for(int i=0;i<AuthorList.size();i++)
               { 
                 
                   AuthorList.get(i).display();
              
               }
               // b.display();
                //a1.display();
               // a.display();
            case 4:
                if(option ==4){
                    break;
                }
                break;
        
            
            
        }
        
        }
        
        
        
    }
    
}

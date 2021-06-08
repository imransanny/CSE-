
package bookclasrealtionship;

import java.util.ArrayList;

public class Book {
    

  private String BookTitle;
private double ISBN;    
private ArrayList<Author> AuthorList = new ArrayList<Author>();

 public Book( String btitle, double isbn){
this.BookTitle = btitle;
this.ISBN = isbn;
}
public void setBookTitle(String btitle ){
    this.BookTitle = btitle;    
} 
public String getBookTitle(){
      return BookTitle;
   
  }
public void setISBN(double isbn){
    this.ISBN = isbn;
}
public double getISBN(){
    return ISBN;
} 

    public void addAuthor(Author a){
        AuthorList.add(a);
        System.out.println(AuthorList);
 
    }
    public void display(){
    System.out.println("Book title = "+ this.getBookTitle());
    System.out.println("ISBN = " + this.getISBN());

    for(int i=0;i<AuthorList.size();i++)
        {
            AuthorList.get(i).display();
        }
    
    }
}

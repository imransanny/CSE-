class Book{
    
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private int count;
    
    void setISBN(int ISBN){
    this.ISBN = ISBN;
    }
    int getISBN(){
     return ISBN;
    }
    
    void setbookTitle(String bookTitle){
    this.bookTitle = bookTitle;
    }
    String getbookTitle(){
     return bookTitle;
    }
    
    void setnumberOfPages(int numberOfPages){
    this.numberOfPages = numberOfPages;
    }
    int getnumberOfPages(){
     return numberOfPages;
    }
    
    public void Book(int ISBN,String bookTitle, int numberOfPages){
    }
    public void Book(){    
    }
    public String toString(){
        return "ISBN:"+ISBN+"\nTitle:"+bookTitle+"\nPage:"+numberOfPages;
    }
    public int compareTo( Book book ){
        if(this.getnumberOfPages() > book.getnumberOfPages()) return 1;
        else if(this.getnumberOfPages() == book.getnumberOfPages()) return 0;
        else return -1;
    }
    public int getCount(){
        return 0;
    }
    
    
}

package lab4;

public class TextBook {
	String isbn;
    String title;
    String author;

    public TextBook(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    
    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
 
    
    
    public String getTitle(){
        return this.title;
    } 
    public void setTitle(String title){
        this.title = title;
    }

    
    
    public String getAuthor(){
        return this.author;
    }  
    public void setAuthor(String author){
        this.author = author;
    }
    


    public String  toString(){
        return "TextBook: " + this.title + "\n"+"Author " + this.author + "\n"+"ISNB " + this.isbn;
    }

    public Boolean equals(TextBook textBook){
        if(this.isbn == textBook.isbn && this.title == textBook.title && this.author == textBook.author) 
        	return true;
        else return false;
    }
}
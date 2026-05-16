package Inheritance;

public class Book {
    String title;
    String author;

    Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void showDetails(){
        System.out.println("Title:- " +title);
        System.out.println("Author:- " +author);
    }

}

class LibraryBook extends Book{
    int shiftNumber;

    LibraryBook(String title,String author,int shiftNumber){
        super(title,author);
        this.shiftNumber = shiftNumber;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("ShiftNumber:- " +shiftNumber);
    }

    public static void main(String[] args){
        Book so = new LibraryBook("Java Basics","John Smith",5);
        so.showDetails();
        
    }
}
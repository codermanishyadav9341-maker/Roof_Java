package Inheritance1;

public class Book {
    String title;
    String author;

    Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void showDetails(){
        System.out.println("Titles:- " +title);
        System.out.println("Author:- " +author);
    }
}

class LibraryBook extends Book{
    int shelfNo;

    LibraryBook(String title,String author,int shelfNo){
        super(title,author);
        this.shelfNo = shelfNo;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("ShelfNo:- " +shelfNo);
    }

    public static void main(String[] args){
        Book bb = new LibraryBook("Java Basics","John Smith",105);
        bb.showDetails();
    }
}
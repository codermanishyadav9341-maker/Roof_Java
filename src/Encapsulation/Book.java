package Encapsulation;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean isAvailable;

    public Book(String title,String author,String isbn,int pages){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getPages(){
        return pages;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void borrowBook(){
        if(isAvailable){
            this.isAvailable = false;
        }
         else{
             System.out.println("BorrowBook is currently not available");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            this.isAvailable = true;
        }
         else{
             System.out.println("Book is already available");
        }
    }

    public static void main(String[] args){
        Book bb = new Book("Java Basics","Gaurav Sir","A4",104);

        System.out.println("--------------=:Book Details:=---------------");
        System.out.println("Title:- " +bb.getTitle());
        System.out.println("Author:- " +bb.getAuthor());
        System.out.println("ISBN:- " +bb.getIsbn());
        System.out.println("Pages:- " +bb.getPages());
        System.out.println("IsAvailable:- " +bb.getIsAvailable());
    }

}

package ru.ithub.javatrainj;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Book {
    private String title;
    private String author;
    private int year ;
    private String isbn;
    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        if(!validateISBN(isbn)){
            throw new IllegalArgumentException("Неверный формат ISBN");
        }
        else{
            this.isbn = isbn;
        }
    }
    private boolean validateISBN(String ISBN){
        Pattern regex = Pattern.compile("\\d{3}-\\d{1}-\\d+-\\d+-\\d{1}");
        Matcher m = regex.matcher(ISBN);
        return m.matches();
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsbn(String isbn) throws IllegalArgumentException{
        if(!validateISBN(isbn)){
            throw new IllegalArgumentException("Неверный формат ISBN");
        }
        else{
            this.isbn = isbn;
        }
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public String getIsbn() {
        return isbn;
    }
    @Override
    public String toString(){

        return "Название: "+getTitle()+","+"Автор: "+getAuthor()+","+"Год: "+getYear()+","+"ISBN: "+getIsbn();
    }
}

package ru.ithub.javatrain;
class Book {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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
}
class Library {
    private Book[]books;
    private int count;
    public Library(int size) {
        books = new Book[size];
        count = 0;
    }
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Библиотека полна, не удалось добавить книгу: " + book.getTitle());
        }
    }
    public void findBooksByAuthor(String author) {
        System.out.println("Книги автора " + author + ":");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println("- " + books[i].getTitle() + " (" + books[i].getYear() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книги не найдены.");
        }
    }
    public void findBooksByYear(int year) {
        System.out.println("Книги, опубликованные в " + year + ":");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getYear() == year) {
                System.out.println("- " + books[i].getTitle() + " (" + books[i].getAuthor() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книги не найдены.");
        }
    }
}
public class Main {
    public static void main(String[]args){
        Library library = new Library(5); // Создаем библиотеку с максимальным размером 5
        library.addBook(new Book("Война и мир", "Лев Толстой", 1869));
        library.addBook(new Book("1984", "Джордж Оруэлл", 1949));
        library.addBook(new Book("Преступление и наказание", "Федор Достоевский", 1866));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));
        library.addBook(new Book("Собачье сердце", "Михаил Булгаков", 1925));
        // Пытаемся добавить еще одну книгу, когда библиотека полна
        library.addBook(new Book("Новая книга", "Автор", 2023));
        library.findBooksByAuthor("Михаил Булгаков");
        library.findBooksByYear(1866);
    }
}

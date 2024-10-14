package ru.ithub.javatrainj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book>books;
    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("Книга с таким ISBN уже существует!");
                return;
            }
        }
        books.add(book);
    }

    public void removeBook(String isbn) throws IllegalArgumentException{
        for (Book b : books) {
            if (!b.getIsbn().equals(isbn)) {
                throw new IllegalArgumentException("Книга с таким ISBN не найдена!");
            }
            else{
                books.remove(b);
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                result.add(b);
            }
        }
        return result;
    }

    public void displayAllBooks() {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Book book : books) {
                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getYear() + "," + book.getIsbn());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении в файл: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    addBook(new Book(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]));
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке из файла: " + e.getMessage());
        }
    }
}

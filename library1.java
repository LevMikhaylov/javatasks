package ru.ithub.javatrainj;
import java.util.*;
public class lol {
    private static final String FILENAME = "C:\\Users\\student\\IdeaProjects\\ppppp\\src\\ru\\ithub\\javatrainj\\library.txt";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Library l = new Library();
        l.loadFromFile(FILENAME);
        int point;
        System.out.println("Управление библиотекой");
        do{
            System.out.println("Введите пункт меню" + "\n" + "1. Добавление книги" + "\n" + "2. Удаление киниги" + "\n" + "3. Поиск книги по названию" + "\n" + "4. Поиск книги по автору" + "\n" + "5. Отображение всех книг" + "\n" + "6. Выход");
            point=s.nextInt();
            switch (point) {
                case 1:
                    try {
                        System.out.println("Введите название книги");
                        String title = s.next();
                        System.out.println("Введите автора книги");
                        String author = s.next();
                        System.out.println("Введите год издания книги");
                        int year = s.nextInt();
                        System.out.println("Введите ISBN");
                        String isbn = s.next();
                        l.addBook(new Book(title, author, year, isbn));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Введите ISBN");
                    String isbn = s.next();
                    try {
                        l.removeBook(isbn);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Введите название");
                    String title = s.next();
                    Book foundbooksbytitle = l.findBookByTitle(title);
                    System.out.println(foundbooksbytitle.toString());
                    break;
                case 4:
                    System.out.println("Введите автора");
                    String author = s.next();
                    List<Book> foundbooksbyauthor = l.findBooksByAuthor(author);
                    for (Book b : foundbooksbyauthor) {
                        System.out.println(b.toString());
                    }
                    break;
                case 5:
                    l.displayAllBooks();
                    break;
                case 6:
                    l.saveToFile(FILENAME);
                    System.out.println("Вы вышли из программы");
                    break;
            }
        }while(point!=6);
    }
}

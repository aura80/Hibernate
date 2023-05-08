package controller;

import entity.Books;
import entity.Student;
import service.implementation.BooksImplementation;
import service.implementation.StudentImplementation;

import java.sql.Date;
import java.time.Instant;

public class MainController {
    public static void main(String[] args) {
        StudentImplementation studentService = new StudentImplementation();

//        studentService.saveStudent(new Student(4, "Ionel", Date.valueOf("2011-12-25")));
//        studentService.saveStudent(new Student(5, "Ana", Date.valueOf("2014-08-15")));
//        studentService.saveStudent(new Student(6, "Mihai", Date.valueOf("2022-07-03")));
        studentService.getStudent().forEach(System.out::println);

        BooksImplementation booksService = new BooksImplementation();

//        booksService.saveBooks(new Books(1, "Title1", "Author1", 100, Date.valueOf("1950-03-22")));
//        booksService.saveBooks(new Books(2, "Title2", "Author2", 457, Date.valueOf("1943-02-23")));
//        booksService.saveBooks(new Books(3, "Title3", "Author3", 385, Date.valueOf("1958-08-14")));
//        booksService.saveBooks(new Books(4, "Title4", "Author4", 522, Date.valueOf("1947-10-09")));
//        booksService.saveBooks(new Books(5, "Title5", "Author5", 371, Date.valueOf("1963-02-11")));
//        booksService.saveBooks(new Books(6, "Title6", "Author6", 280, Date.valueOf("1972-11-04")));
//        booksService.saveBooks(new Books(7, "Title7", "Author7", 391, Date.valueOf("1974-10-18")));
//        booksService.saveBooks(new Books(8, "Title8", "Author8", 570, Date.valueOf("1983-01-07")));
//        booksService.saveBooks(new Books(9, "Title9", "Author9", 720, Date.valueOf("1983-05-03")));
//        booksService.saveBooks(new Books(10, "Title10", "Author10", 250, Date.valueOf("1995-12-12")));

        booksService.getBooks().forEach(System.out::println);

        System.out.println();

        System.out.println(booksService.getBooks(6));
//        booksService.deleteBooks(booksService.getBooks(6).get());

    }
}

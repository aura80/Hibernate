package controller;

import entity.Books;
import entity.Student;
import service.implementation.BooksImplementation;
import service.implementation.StudentImplementation;

import java.awt.print.Book;
import java.sql.Date;
import java.time.Instant;
import java.util.*;

public class MainController {
    public static void main(String[] args) {
        StudentImplementation studentService = new StudentImplementation();

//        studentService.saveStudent(new Student(4, "Ionel", Date.valueOf("2011-12-25")));
//        studentService.saveStudent(new Student(5, "Ana", Date.valueOf("2014-08-15")));
//        studentService.saveStudent(new Student(6, "Mihai", Date.valueOf("2022-07-03")));

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


        studentService.getStudent(1).get().setBooksList(Arrays.asList(booksService.getBooks(7).get(),
                booksService.getBooks(8).get(),
                booksService.getBooks(9).get()));
        Student student0 = new Student();
        student0.setBooksList(studentService.getStudent(1).get().getBooksList());

        studentService.getStudent(2).get().setBooksList(Arrays.asList(booksService.getBooks(1).get(),
                booksService.getBooks(3).get(),
                booksService.getBooks(5).get()));
        Student student00 = new Student();
        student00.setBooksList(studentService.getStudent(2).get().getBooksList());

        studentService.getStudent(3).get().setBooksList(Arrays.asList(booksService.getBooks(2).get(),
                booksService.getBooks(4).get()));
        Student student000 = new Student();
        student000.setBooksList(studentService.getStudent(3).get().getBooksList());

        studentService.getStudent(4).get().setBooksList(Arrays.asList(booksService.getBooks(7).get(),
                booksService.getBooks(8).get(),
                booksService.getBooks(9).get()));
        Student student01 = new Student();
        student01.setBooksList(studentService.getStudent(4).get().getBooksList());

        studentService.getStudent(5).get().setBooksList(Arrays.asList(booksService.getBooks(1).get(),
                booksService.getBooks(3).get(),
                booksService.getBooks(5).get()));
        Student student001 = new Student();
        student001.setBooksList(studentService.getStudent(5).get().getBooksList());

        studentService.getStudent(6).get().setBooksList(Arrays.asList(booksService.getBooks(2).get(),
                booksService.getBooks(4).get()));
        Student student0001 = new Student();
        student0001.setBooksList(studentService.getStudent(6).get().getBooksList());

        studentService.getStudent().forEach(System.out::println);

        booksService.getBooks().forEach(System.out::println);

        System.out.println();

        System.out.println(" ---> " + booksService.getBooks(6));
        System.out.println();
        System.out.println(" ---> " + booksService.getBooks(3));
//        booksService.deleteBooks(booksService.getBooks(6).get());
        System.out.println();
        System.out.println(booksService.getBooks(8));
        System.out.println(booksService.getBooks(2));

        Student student = new Student();
        student.getBooksList().add(booksService.getBooks(1).get());
        student.getBooksList().add(booksService.getBooks(2).get());
        student.getBooksList().add(booksService.getBooks(3).get());
        System.out.println();
        System.out.println("*******" + student.getBooksList());

        System.out.println();

        Books books = new Books();
        books.setStudent(studentService.getStudent(1).get());
        books.setId_book(30);
        books.setTitle("Title30");
        books.setAuthor("Author30");
        books.setPages(230);
        books.setDate_of_release(Date.valueOf("2020-03-05"));

        Books books1 = new Books(40, "Title40", "Author 40", 350, Date.valueOf("2021-12-07"));
        books1.setStudent(studentService.getStudent(2).get());

        System.out.println(books);
        System.out.println(books1);

        System.out.println();

        booksService.getBooks(5).get().setStudent(studentService.getStudent(2).get());
        booksService.getBooks(3).get().setStudent(studentService.getStudent(2).get());
        booksService.getBooks(7).get().setStudent(studentService.getStudent(2).get());
        System.out.println(booksService.getBooks(5).get());
        System.out.println(booksService.getBooks(3).get());
        System.out.println(booksService.getBooks(7).get());

        System.out.println();

        booksService.getBooks(1).get().setStudent(studentService.getStudent(3).get());
        booksService.getBooks(2).get().setStudent(studentService.getStudent(3).get());
        booksService.getBooks(4).get().setStudent(studentService.getStudent(4).get());
        booksService.getBooks(8).get().setStudent(studentService.getStudent(4).get());
        booksService.getBooks(5).get().setStudent(studentService.getStudent(4).get());
        booksService.getBooks(9).get().setStudent(studentService.getStudent(5).get());
        booksService.getBooks(10).get().setStudent(studentService.getStudent(5).get());
        booksService.getBooks(3).get().setStudent(studentService.getStudent(6).get());
        booksService.getBooks(4).get().setStudent(studentService.getStudent(6).get());
//        booksService.getBooks(10).get().setStudent(studentService.getStudent(6).get());
        System.out.println(booksService.getBooks(1).get());
        System.out.println(booksService.getBooks(2).get());
        System.out.println(booksService.getBooks(4).get());
        System.out.println(booksService.getBooks(8).get());
        System.out.println(booksService.getBooks(5).get());
        System.out.println(booksService.getBooks(9).get());
        System.out.println(booksService.getBooks(10).get());
        System.out.println(booksService.getBooks(3).get());
        System.out.println(booksService.getBooks(4).get());
        System.out.println(booksService.getBooks(10).get());

        System.out.println();

        System.out.println();
        System.out.println(setBooksListForStudent_1_2());
    }

    public static Set<Student> setBooksListForStudent_1_2() {
        List<Books> books = new ArrayList<>();
        Set<Student> student = new HashSet<>();

        StudentImplementation studentService = new StudentImplementation();
        BooksImplementation booksService = new BooksImplementation();

        Student student1 = new Student();
        student1.setId(studentService.getStudent(1).get().getId());
        student1.setName(studentService.getStudent(1).get().getName());
        student1.setDate_of_borrow(studentService.getStudent(1).get().getDate_of_borrow());

        booksService.getBooks(1).get().setStudent(booksService.getBooks(1).get().getStudent());
        booksService.getBooks(2).get().setStudent(booksService.getBooks(2).get().getStudent());
        booksService.getBooks(3).get().setStudent(booksService.getBooks(3).get().getStudent());
//        stack overflow
//        booksService.getBooks(1).get().setStudent(studentService.getStudent(1).get());
//        booksService.getBooks(2).get().setStudent(studentService.getStudent(1).get());
//        booksService.getBooks(3).get().setStudent(studentService.getStudent(1).get());
        studentService.getStudent(1).get().setBooksList(Arrays.asList(booksService.getBooks(1).get(),
                                                                         booksService.getBooks(2).get(),
                                                                         booksService.getBooks(3).get()));
        student1.setBooksList(studentService.getStudent(1).get().getBooksList());

        System.out.println();

        studentService.getStudent(2).get().setBooksList(Arrays.asList(booksService.getBooks(4).get(),
                                                                         booksService.getBooks(5).get()));
        Student student2 = new Student(studentService.getStudent(2).get().getId(),
                studentService.getStudent(2).get().getName(),
                studentService.getStudent(2).get().getDate_of_borrow());
        student2.setBooksList(studentService.getStudent(2).get().getBooksList());

        System.out.println();

        System.out.println(student1);
        System.out.println(student1.getBooksList());
        System.out.println();
        System.out.println(student2);
        System.out.println(student2.getBooksList());

        System.out.println();

//        books.add(booksService.getBooks(1).get());
//        books.add(booksService.getBooks(2).get());
//        books.add(booksService.getBooks(3).get());
//
//        student1.setBooksList(books);
        student.add(student1);
        student.add(student2);

        return student;
    }
}

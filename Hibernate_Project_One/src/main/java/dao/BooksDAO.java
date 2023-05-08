package dao;

import entity.Books;
import entity.Student;

import java.util.List;
import java.util.Optional;

public interface BooksDAO {
    void saveBooks(Books books);
    Optional<Books> findBooksById(int id);
    List<Books> findAllBooks();
    void deleteBook(Books books);
}

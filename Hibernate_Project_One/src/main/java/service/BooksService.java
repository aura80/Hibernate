package service;

import entity.Books;

import java.util.List;
import java.util.Optional;

public interface BooksService {
    void saveBooks(Books books);
    Optional<Books> getBooks(int id);
    List<Books> getBooks();
    void deleteBooks(Books books);
}

package service.implementation;

import dao.BooksDAO;
import dao.implementation.BooksDAOImplementation;
import entity.Books;
import service.BooksService;
import service.base.BaseService;

import java.util.List;
import java.util.Optional;

public class BooksImplementation extends BaseService implements BooksService {

    private final BooksDAO booksDAO;

    public BooksImplementation() {
        this.booksDAO = new BooksDAOImplementation(getSessionFactory());
    }

    @Override
    public void saveBooks(Books books) {
        booksDAO.saveBooks(books);
    }

    @Override
    public Optional<Books> getBooks(int id) {
        return booksDAO.findBooksById(id);
    }

    @Override
    public List<Books> getBooks() {
        return booksDAO.findAllBooks();
    }

    @Override
    public void deleteBooks(Books books) {
        booksDAO.deleteBook(books);
    }
}

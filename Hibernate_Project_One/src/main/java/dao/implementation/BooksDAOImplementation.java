package dao.implementation;

import dao.BooksDAO;
import dao.base.BaseDAO;
import entity.Books;
import entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public class BooksDAOImplementation extends BaseDAO implements BooksDAO {

    public BooksDAOImplementation(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void saveBooks(Books books) {
        Transaction transaction = null;
        try {
            transaction = currentSession.beginTransaction();
            currentSession.persist(books);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public Optional<Books> findBooksById(int id) {
        return Optional.ofNullable(currentSession.get(Books.class, id));
    }

    @Override
    public List<Books> findAllBooks() {
        return currentSession.createQuery("FROM Books", Books.class).list();
    }

    @Override
    public void deleteBook(Books books) {
        Transaction transaction = null;
        try {
            transaction = currentSession.beginTransaction();
            currentSession.remove(books);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}

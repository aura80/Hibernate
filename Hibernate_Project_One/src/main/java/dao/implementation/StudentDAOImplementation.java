package dao.implementation;

import dao.StudentDAO;
import dao.base.BaseDAO;
import entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class StudentDAOImplementation extends BaseDAO implements StudentDAO {

    public StudentDAOImplementation(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void saveStudent(Student student) {
        Transaction transaction = null;
        try {
            transaction = currentSession.beginTransaction();
            currentSession.persist(student);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public Optional<Student> findStudentById(int id) {
        return Optional.ofNullable(currentSession.get(Student.class, id));
    }

    @Override
    public List<Student> findAllStudents() {
        return currentSession.createQuery("FROM Student", Student.class).list();
    }

    @Override
    public void deleteStudent(Student student) {
        Transaction transaction = null;
        try {
            transaction = currentSession.beginTransaction();
            currentSession.remove(student);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}

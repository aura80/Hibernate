package service.base;

import entity.Books;
import entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public abstract class BaseService {

    private SessionFactory sessionFactory;

    protected SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                configuration.configure();
                configuration.addAnnotatedClass(Student.class);
                configuration.addAnnotatedClass(Books.class);

                sessionFactory = configuration.buildSessionFactory();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

}

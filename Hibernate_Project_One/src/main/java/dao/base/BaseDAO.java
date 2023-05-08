package dao.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class BaseDAO {
    protected final Session currentSession;

    protected BaseDAO(SessionFactory sessionFactory) {
        this.currentSession = sessionFactory.openSession();
    }
}

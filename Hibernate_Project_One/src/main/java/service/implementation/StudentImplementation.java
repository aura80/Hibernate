package service.implementation;

import dao.StudentDAO;
import dao.implementation.StudentDAOImplementation;
import entity.Student;
import service.StudentService;
import service.base.BaseService;

import java.util.List;
import java.util.Optional;

public class StudentImplementation extends BaseService implements StudentService {

    private final StudentDAO studentDAO;

    public StudentImplementation() {
        this.studentDAO = new StudentDAOImplementation(getSessionFactory());
    }

    @Override
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

    @Override
    public Optional<Student> getStudent(int id) {
        return studentDAO.findStudentById(id);
    }

    @Override
    public List<Student> getStudent() {
        return studentDAO.findAllStudents();
    }

    @Override
    public void deleteStudent(Student student) {
        studentDAO.deleteStudent(student);
    }
}

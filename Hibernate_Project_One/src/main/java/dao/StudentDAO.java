package dao;

import entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    void saveStudent(Student student);
    Optional<Student> findStudentById(int id);
    List<Student> findAllStudents();
    void deleteStudent(Student student);
}

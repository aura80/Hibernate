package service;

import entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void saveStudent(Student student);
    Optional<Student> getStudent(int id);
    List<Student> getStudent();
    void deleteStudent(Student student);
}

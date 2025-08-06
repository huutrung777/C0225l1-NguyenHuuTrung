package bai_tap.mvc.repository;

import bai_tap.mvc.entity.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void add(Student student);
    boolean deleteById(int id);

}

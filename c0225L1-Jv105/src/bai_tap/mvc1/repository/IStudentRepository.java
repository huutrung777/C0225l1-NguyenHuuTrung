package bai_tap.mvc1.repository;

import bai_tap.mvc1.entity.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    boolean add(Student student);
    boolean deleteById(int id);            // xóa sinh viên theo id
    Student findById(int id);


}

package bai_tap.mvc1.repository;

import bai_tap.mvc1.entity.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    boolean add(Student student);
    boolean delete(String id);            // xóa sinh viên theo id
    Student findById(String id);


}

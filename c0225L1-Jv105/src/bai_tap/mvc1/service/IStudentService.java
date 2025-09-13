package bai_tap.mvc1.service;

import bai_tap.mvc1.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    boolean add(Student student);
    boolean delete(int id);            // xóa sinh viên theo id
    Student findById(int id);


}

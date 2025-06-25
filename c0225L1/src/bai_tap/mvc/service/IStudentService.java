package bai_tap.mvc.service;

import bai_tap.mvc.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void add(Student student);
    boolean deleteById(int code);
}

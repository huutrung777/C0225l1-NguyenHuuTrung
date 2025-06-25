package bai_tap.mvc.service;

import bai_tap.mvc.entity.Student;

import java.util.List;

public class StudentService implements IStudentService {


    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public void add(Student student) {

    }

    @Override
    public boolean deleteById(int code) {
        return false;
    }
}

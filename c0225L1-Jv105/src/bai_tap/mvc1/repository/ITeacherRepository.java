package bai_tap.mvc1.repository;

import bai_tap.mvc1.entity.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> findAll();
    boolean add(Teacher teacher);
    Teacher findById(String id);
    boolean delete(String id);
}

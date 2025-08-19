package bai_tap.mvc1.service;

import bai_tap.mvc1.entity.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAll();
    boolean add(Teacher teacher);
    boolean delete(String id);           // xoá giáo viên theo id
    Teacher findById(String id);

}

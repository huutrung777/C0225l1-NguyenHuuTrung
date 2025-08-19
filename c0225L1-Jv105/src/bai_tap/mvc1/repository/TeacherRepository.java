package bai_tap.mvc1.repository;

import bai_tap.mvc1.entity.Student;
import bai_tap.mvc1.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> teachers = new ArrayList<>();
    static {
        teachers.add(new Teacher(1,"Trung",100000));
        teachers.add(new Teacher(2,"Ngân",200000));
        teachers.add(new Teacher(3,"Tâm",300000));

    }

    @Override
    public List<Teacher> findAll() {
        return teachers;
    }

    @Override
    public boolean add(Teacher teacher) {
        teachers.add(teacher);
        return false;
    }
    @Override
    public boolean delete(String id) {
        int intId = Integer.parseInt(id);
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == intId) {
                teachers.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Teacher findById(String id) {
        int intId = Integer.parseInt(id);
        for (Teacher teacher : teachers) {
            if (teacher.getId() == intId) {
                return teacher;
            }
        }
        return null;
    }


}

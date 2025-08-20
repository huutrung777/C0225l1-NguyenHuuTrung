package bai_tap.mvc1.repository;

import bai_tap.mvc1.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1,"Trung",9.0f));
        students.add(new Student(2,"Ngân",10.0f));
        students.add(new Student(3,"Tâm",7.0f));

    }

    @Override
    public List<Student> findAll()
    {

        return students;
    }

    @Override
    public boolean add(Student student) {
        students.add(student);
        return true;

    }

    @Override
    public boolean delete(String id) {
        int intId = Integer.parseInt(id);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == intId) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Student findById(String id) {
        int intId = Integer.parseInt(id);
        for (Student s : students) {
            if (s.getId() == intId) {
                return s;
            }
        }
        return null;
    }
}

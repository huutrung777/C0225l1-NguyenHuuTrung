package bai_tap.mvc1.service;

import bai_tap.mvc1.entity.Teacher;
import bai_tap.mvc1.repository.ITeacherRepository;
import bai_tap.mvc1.repository.TeacherRepository;

import java.util.List;

public class TeacherService implements ITeacherService {
private ITeacherRepository teacherRepository=new TeacherRepository();


    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public boolean add(Teacher teacher) {
        List<Teacher> teachers = findAll();
        for (int i = 0; i <teachers.size() ; i++) {
            if (teachers.get(i)!=null){
                if (teachers.get(i).getId()==teacher.getId()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }else {
                break;
            }

        }
        return teacherRepository.add(teacher);
    }

    @Override
    public boolean delete(int id) {
        return teacherRepository.deleteById(id);
    }

    @Override
    public Teacher findById(int id) {
        return teacherRepository.findById(id);
    }

}

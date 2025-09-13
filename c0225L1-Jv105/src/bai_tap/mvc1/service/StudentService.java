package bai_tap.mvc1.service;

import bai_tap.mvc1.entity.Student;
import bai_tap.mvc1.repository.IStudentRepository;
import bai_tap.mvc1.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository=new StudentRepository();


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean add(Student student) {
        List<Student> students = studentRepository.findAll();
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i)!=null){
                if (students.get(i).getId()==student.getId()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }else {
                break;
            }

        }
        return studentRepository.add(student);
    }

    @Override
    public boolean delete(int id) {
        Student student = studentRepository.findById(id);
        if (student == null) {
            System.out.println("Không tìm thấy sinh viên với id = " + id);
            return false;
        }
        return studentRepository.deleteById(id);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

}

package bai_tap.mvc1.repository;

import bai_tap.mvc1.Utill.ReadAndWriteFile;
import bai_tap.mvc1.entity.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String STUDENT_FILE ="c0225L1-Jv105/src/bai_tap/mvc1/Data/student.csv";
//    private static List<Student> students = new ArrayList<>();
//    static {
//        students.add(new Student(1,"Trung",9.0f));
//        students.add(new Student(2,"Ngân",10.0f));
//        students.add(new Student(3,"Tâm",7.0f));
//
//    }

    @Override
    public List<Student> findAll()
    {
        List<Student> studentList = new ArrayList<>();
        try {
            List<String> stringList= ReadAndWriteFile.readFileCSV(STUDENT_FILE);
            String[] array=null;
            // chuyển đổi kiểu stringList thành studentList
            for(int i=0;i<stringList.size();i++){
                array=stringList.get(i).split(",");
                Student student=new Student(Integer.parseInt(array[0]),array[1],Float.parseFloat(array[2]));
                studentList.add(student);
            }
        } catch (IOException e) {
            System.out.println("đọc file bị lỗi ");
        }
        return studentList;


    }

    @Override
    public boolean add(Student student) {
        List<String> list = new ArrayList<>();
        list.add(student.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(STUDENT_FILE,list,true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;

    }

    @Override
    public boolean deleteById(int id) {
        boolean isSuccessDelete = false;
        List<Student> studentList = findAll();
        for(int i=0;i<studentList.size();i++){
            if(id==studentList.get(i).getId()){
                studentList.remove(i);
                isSuccessDelete=true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        // chuyen đổi listStudent => listString;
        for(int i=0;i<studentList.size();i++){
            stringList.add(studentList.get(i).getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(STUDENT_FILE,stringList,false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
        return isSuccessDelete;
    }

    @Override
    public Student findById(int id) {
        List<Student> studentList = findAll();
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


}

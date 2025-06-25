package bai_tap.mvc.repository;

import bai_tap.mvc.entity.Student;
import bai_tap.mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
private final String STUDENT_FILE = "src/bai_tap/mvc/data/student.csv";
private final boolean APPEND = true;
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        // sau nay đọc ghi file thêm vào list
        List<String> stringList = ReadAndWriteFile.readFileCSV(STUDENT_FILE);
        String[] array =null;
        for (String line: stringList) {
            array = line.split(",");
            Student student = new Student(Long.parseLong(array[0]),array[1],array[2],
                    (int) Float.parseFloat(array[3]),array[4]);
            studentList.add(student);
        }
        return studentList;

    }
    @Override
    public void add(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        ReadAndWriteFile.writeListToCSV(STUDENT_FILE,stringList,APPEND);
        // ghi vào file
    }

    @Override
    public boolean deleteById(int code) {
        boolean isDelete = false;
        List<Student> studentList = findAll();
        for (int i = 0; i <studentList.size() ; i++) {
            if (code== studentList.get(i).getCode()){
                studentList.remove(i);
                isDelete = true;
                break;
            }
        }
        // chuyển sang listring để ghi lại
        List<String> stringList = new ArrayList<>();
        for (Student s: studentList) {
            stringList.add(s.getInfoToCSV());
        }
        ReadAndWriteFile.writeListToCSV(STUDENT_FILE,stringList,!APPEND);
        return isDelete;
    }

}

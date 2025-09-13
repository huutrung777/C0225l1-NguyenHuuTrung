package bai_tap.mvc1.repository;

import bai_tap.mvc1.Utill.ReadAndWriteFile;
import bai_tap.mvc1.entity.Student;
import bai_tap.mvc1.entity.Teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private final String TeacherFile="c0225L1-Jv105/src/bai_tap/mvc1/Data/teacher.csv";
//    private static List<Teacher> teachers = new ArrayList<>();
//    static {
//        teachers.add(new Teacher(1,"Trung",100000));
//        teachers.add(new Teacher(2,"Ngân",200000));
//        teachers.add(new Teacher(3,"Tâm",300000));
//
//    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> teacherList = new ArrayList<>();
        List<String>stringList= null;
        try {
            stringList = ReadAndWriteFile.readFileCSV(TeacherFile);
            // chuyển đổi kiểu stringList thành teachertList
            for(int i=0;i<stringList.size();i++){
                String[] array=null;
                array=stringList.get(i).split(",");
                Teacher teacher=new Teacher(Integer.parseInt(array[0]),array[1],Float.parseFloat(array[2]));
                teacherList.add(teacher);
            }
        } catch (IOException e) {
            System.out.println("Đọc File lỗi");

        }
        return teacherList;

    }

    @Override
    public boolean add(Teacher teacher) {
        List<String>list=new ArrayList<>();
        list.add(teacher.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(TeacherFile,list,true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;



    }
    @Override
    public boolean deleteById(int id) {
        boolean isSuccessDelete = false;
        List<Teacher> teacherList = findAll();
        for(int i=0;i<teacherList.size();i++){
            if(id==teacherList.get(i).getId()){
                teacherList.remove(i);
                isSuccessDelete=true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        // chuyen đổi listTeacher => listString;
        for(int i=0;i<teacherList.size();i++){
            stringList.add(teacherList.get(i).getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(TeacherFile,stringList,false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
        return isSuccessDelete;

    }

    @Override
    public Teacher findById(int id) {
        List<Teacher> teacherList = findAll();
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;

    }





}

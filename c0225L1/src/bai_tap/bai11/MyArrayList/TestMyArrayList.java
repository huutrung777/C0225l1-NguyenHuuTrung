package bai_tap.bai11.MyArrayList;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args) {
        Student a = new Student(1,"Trung");
        Student b = new Student(2,"Ngân");
        Student c = new Student(3,"Hiếu");
        Student d = new Student(4,"Liên");
        Student e =new Student(5,"Tâm");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<Student>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(4, e);

        for(int i=0;i<studentMyArrayList.Size();i++){
            Student student=(Student) studentMyArrayList.elemment[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }

    }
}

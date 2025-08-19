package bai_tap.mvc1.entity;

public class Student  extends Person{
    private float score;

    public Student() {
    }

    public Student(int id, String name, float score) {
        super(id, name);
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "score=" + score +
                '}';
    }
}

package bai_tap.mvc1.entity;

public class Student  extends Person{
    private float score;

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String getInfoToCSV() {
        return this.getId()+","+this.getName()+","+this.getScore();
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

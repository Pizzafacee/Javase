import java.io.Serializable;

class Student implements Serializable {
    int no;
    String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
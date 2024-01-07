package JavaTheory.Sliit.Collection.Map;

public class Student {

    private int studentID, gpa;
    private String name;

    //constructor
    public Student(int studentID, String name, int gpa) {
        super();
        this.studentID = studentID;
        this.gpa = gpa;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

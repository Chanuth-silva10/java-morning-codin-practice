package JavaTheory.Sliit.LabSheet.Lab_03.Exercise_5;

public class Student extends Person {

    String studentId;

    public Student(String newName, String newAddress, String newStudentId) {
        super(newName, newAddress);
        studentId = newStudentId;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("My ID is " + studentId + "\n");

    }
}

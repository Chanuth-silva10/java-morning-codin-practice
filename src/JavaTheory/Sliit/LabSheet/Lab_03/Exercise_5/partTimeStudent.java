package JavaTheory.Sliit.LabSheet.Lab_03.Exercise_5;

public class partTimeStudent extends Student {

    int noOfHrs;

    public partTimeStudent(String newName, String newAddress, String newStudentId, int newNoOfHrs) {
        super(newName, newAddress, newStudentId);
        noOfHrs = newNoOfHrs;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("My working hourse are " + noOfHrs);
    }
}

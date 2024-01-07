package JavaTheory.Sliit.LabSheet.Lab_03.Exercise_8;

public class Dog extends Pet {

    int noOfMasters;

    public Dog(String name, String owner, int age,int m) {
        super(name, owner, age);
        this.noOfMasters = m;

    }
    public Dog(String name, String o) {
        super(name ,o);
        this.noOfMasters = 1;

    }

    public void showDetails() {
        super.showDetails();
        System.out.println("I am a dog.I have  "+this.noOfMasters+"masters");
    }

}

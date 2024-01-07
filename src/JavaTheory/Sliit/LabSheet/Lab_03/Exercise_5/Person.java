package JavaTheory.Sliit.LabSheet.Lab_03.Exercise_5;

public class Person {

    public String name, address;

    public Person(String newName, String newAddress) {

        name = newName;
        address = newAddress;
    }

    void showDetails() {
        System.out.println("My name is " + name + "\nI am from " + address + "\n");
    }
}

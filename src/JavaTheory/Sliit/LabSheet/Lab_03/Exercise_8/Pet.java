package JavaTheory.Sliit.LabSheet.Lab_03.Exercise_8;

public class Pet {

    private String name;
    private String owner;
    private int age;

    public Pet(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    //overloaded constructor
    public Pet(String name,String owner) {
        this.name = name;
        this.owner = owner;
        this.age = 0;
    }
    public void showDetails(){
        System.out.println("I am a pet. My name is " +this.name+". My owner is "+this.owner+" Age is  :"+this.age);
    }
}

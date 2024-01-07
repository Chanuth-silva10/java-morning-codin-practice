package JavaTheory.Sliit.LabSheet.Lab_05.Abstract_ClassEx_2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Cat test");
        animal1.display();
        System.out.println(" ");

        Cat mycat = new Cat("Micky Cat");
        mycat.display();
        System.out.println(" ");

        Dog mydog = new Dog("Rover Dog");
        mydog.display();
        System.out.println(" ");

        ToyCat myToy = new ToyCat("kittie","Toysrus");
        myToy.display();
        System.out.println(" ");

        // We can called default constructors
        ToyCat T = new ToyCat();
    }
}
package JavaTheory.Sliit.LabSheet.Lab_03.Exercise_8;

public class Main {
    public static void main(String[] args) {
        Pet p = new Pet("Lissie","Smith",3);
        p.showDetails();

        //call overloaded constructor for newborn pet
        Pet p1 = new Pet("Kittiya","Ann");
        p1.showDetails();

        Cat c = new Cat("Kyan", "Silva", 4, 4);
        c.showDetails();

        //call overloaded constructor for newborn pet
        Cat c1 = new Cat("Tommy", "Jerry");
        c.showDetails();

        Dog d = new Dog("Blacky","Saman",6,2);
        d.showDetails();

        //call overloaded constructor for new born pet
        Dog d1 = new Dog("Brown","Kasun");
        d1.showDetails();
    }
}

package JavaTheory.Sliit.JavaOOP.Polymorphism;

public class main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Outputs: Bark

        Animal myCat = new Cat();
        myCat.makeSound();  // Outputs: Meow
    }
}

package JavaTheory.Sliit.LabSheet.Lab_05.Abstract_ClassEx_2;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        System.out.println("Cat constructor called");
    }
    @Override
    public String speak()  {
        return "Meow Meow";
    }
}

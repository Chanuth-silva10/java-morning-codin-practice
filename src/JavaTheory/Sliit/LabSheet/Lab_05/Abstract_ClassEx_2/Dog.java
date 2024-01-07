package JavaTheory.Sliit.LabSheet.Lab_05.Abstract_ClassEx_2;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        System.out.println("Dog constructor called");
    }

    @Override
    public String speak()  {
        return "Bow Wow";
    }
}

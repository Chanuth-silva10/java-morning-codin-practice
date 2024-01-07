package JavaTheory.Sliit.LabSheet.Lab_03.Exercise_8;

public class Cat extends Pet{
    private int livesLeft;

    public Cat(String name, String owner, int age,int l) {
        super(name, owner, age);
        this.livesLeft = l;
    }

    public Cat(String name,String o) {
        super(name,o,0);
        this.livesLeft = 7;
    }
}
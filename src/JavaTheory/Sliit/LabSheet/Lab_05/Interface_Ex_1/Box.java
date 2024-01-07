package JavaTheory.Sliit.LabSheet.Lab_05.Ex_1;

public class Box implements ICompute{
    private int length, width, height;
    private int volume;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public Box(int length, int width, int height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // volume calculations
    @Override
    public int calculate() {
        volume = width * height * length;
        System.out.println("Calculate :"+volume);
        return 0;
    }

    @Override
    public void display() {
        System.out.println("Interface so display must be implement");

    }
}

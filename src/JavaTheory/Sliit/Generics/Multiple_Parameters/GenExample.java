package JavaTheory.Sliit.Generics.Multiple_Parameters;

public class GenExample {
    public static void main(String[] args) {
        TwoGen<Integer, String>  gob = new TwoGen<Integer, String>(123,"Anne");

        gob.ShowType();

        int v = gob.getob1();
        System.out.println("Value is :"+v);

        String s = gob.getob2();
        System.out.println("Value is :"+s);

    }
}

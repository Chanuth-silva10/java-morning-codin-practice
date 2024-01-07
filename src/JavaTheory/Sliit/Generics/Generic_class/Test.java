package JavaTheory.Sliit.Generics.Generic_class;

public class Test {
    public static void main(String[] args) {
        MyGen<String> m = new MyGen<>();
        m.add("String");
        System.out.println(m.get());

        MyGen<Integer> i = new MyGen<>();
        i.add(15);
        System.out.println(i.get());
    }
}

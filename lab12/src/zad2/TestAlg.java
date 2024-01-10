package zad2;

public class TestAlg {

    public static void main(String[] args) {
        Alg a1 = new Alg();
        System.out.println(a1.isEqual(4, 4));
        System.out.println(a1.isEqual("hello", "hello"));
        System.out.println(a1.isEqual(5,12));
        System.out.println(a1.isEqual(1.2, 1.1+0.1));
    }
}

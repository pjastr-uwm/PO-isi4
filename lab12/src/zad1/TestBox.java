package zad1;

public class TestBox {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        System.out.println(b1.get());
        b1.set(6);
        System.out.println(b1.get());
        System.out.println(b1);
        Box<Integer> b2 = new Box<>(-20);
        System.out.println(b2.get());
        Box<String> b3 = new Box<>("Hello");
        System.out.println(b3.get());
    }
}

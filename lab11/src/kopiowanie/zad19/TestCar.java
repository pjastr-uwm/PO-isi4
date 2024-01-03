package kopiowanie.zad19;

public class TestCar {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car("AA", "TT", new Engine(4.5, "RR", "PP"));
        Car c2 = c1.clone();
        System.out.println(c1);
        System.out.println(c2);
    }
}

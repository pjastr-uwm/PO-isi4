package rekordy.zad2;

public class TestPerson {

    public static void main(String[] args) {
        Address a1 = new Address("Słoneczna", 54, 10710, "Olsztyn");
        Person p1 = new Person("Jan", a1);
        Person p2 = new Person("Jan", new Address("Słoneczna", 54,
                10710, "Olsztyn"));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
    }
}

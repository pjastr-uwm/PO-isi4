package pl.edu.uwm.edu.zad15;

public class TestProperty {
    public static void main(String[] args) {
        Property p1 = new Property("Olsztyn", 45, 300000.4);
        Apartment a1 = new Apartment("Olsztyn", 45, 300000.4, 8);
        System.out.println(p1);
        System.out.println(a1);
        System.out.println(p1.equals(a1)); //false
        Property p2 = new Property("Olsztyn", 45, 300000.4);
        Property p3 = null;
        Property p4 = new Property(null, 45, 300000.4);
        Property p5 = new Property(new String("Olsztyn"), 45, 300000.4);
        System.out.println(p1.equals(p1)); //true
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1.equals(p3)); //false
        //System.out.println(p3.equals(p1));
        System.out.println(p1.equals(p4)); //false
        System.out.println(p4.equals(p1)); //false
        System.out.println(p1.equals(p5)); //true
        Apartment a2 = new Apartment("Olsztyn", 45, 300000.4, 8);
        Apartment a3 = null;
        Apartment a4 = new Apartment(null, 45, 300000.4, 8);
        Apartment a5 = new Apartment("Olsztyn", 45, 300000.4, 7);
        System.out.println(a1.equals(a2)); //true
        System.out.println(a1.equals(a3)); //false
        System.out.println(a1.equals(a4)); //false
        System.out.println(a1.equals(a5)); //false
        System.out.println(a1.hashCode() == a2.hashCode()); //true
        System.out.println(a1.hashCode() == a4.hashCode()); //false
    }

}

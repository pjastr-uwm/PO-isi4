import pl.edu.uwm.zad2.Vehicle;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Skoda", "Fabia", 2010);
        System.out.println(v1);
        Vehicle v2 = new Vehicle("Skoda", "Fabia", 2010);
        System.out.println(v1 == v2); // java kontekst jest zawsze ten sam
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v1));
        System.out.println(v2.equals(v2));
        System.out.println(v2.equals(v1));
        Vehicle v3 = null;
        Vehicle v4 = new Vehicle(null, "Fabia", 2010);
        Vehicle v5 = new Vehicle(new String("Skoda"), "Fabia", 2010);
        System.out.println(v1.equals(v3)); //false
        System.out.println(v1.equals(v4)); //false
        System.out.println(v1.equals(v5)); //true
        System.out.println(v4.equals(v1)); //false
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v1.hashCode() == v2.hashCode());
    }
}
